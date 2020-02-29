package com.lamp.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lamp.web.entity.Streetlight;
import com.lamp.web.jdbc.JdbcConnector;

public class StreetLightDao {

	public static void main(String[] args) {
		List<Streetlight> queryStreetLight = queryStreetLight();
		System.out.println(queryStreetLight.size()+"-----");
	}
	
	//查询路灯相关信息
	public static List<Streetlight> queryStreetLight(){
		Connection connection = JdbcConnector.getConnection();
	    String sql="select * from streetlight_info";
	   
	    List<Streetlight> list = new ArrayList<Streetlight>();
	    try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery(sql);
			while(resultSet.next()) {
				Streetlight streetlight = new Streetlight();
				streetlight.setId(resultSet.getInt("id"));
				streetlight.setLampshade(resultSet.getString("lampshade"));
				streetlight.setLampWick(resultSet.getString("lamp_wick"));
				streetlight.setScrew(resultSet.getString("screw"));
				streetlight.setSupportingArm(resultSet.getString("supporting_arm"));
				streetlight.setWire(resultSet.getString("wire"));
				streetlight.setCreatedTime(resultSet.getDate("created_time"));
				streetlight.setModifiedTime(resultSet.getDate("modified_time"));
				list.add(streetlight);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//根据lampwick灯罩查询相关信息
	public static List<Streetlight> queryStreetLightWithLampWick(String lampWick){
		Connection connection = JdbcConnector.getConnection();
	    String sql="select * from streetlight_info where lamp_wick=?";
	    Streetlight streetlight = new Streetlight();
	    List<Streetlight> list = new ArrayList<Streetlight>();
	    try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(2, lampWick);
			ResultSet resultSet = prepareStatement.executeQuery(sql);
			while(resultSet.next()) {
				streetlight.setId(resultSet.getInt("id"));
				streetlight.setLampshade(resultSet.getString("lamp_shade"));
				streetlight.setLampWick(resultSet.getString("lamp_wick"));
				streetlight.setScrew(resultSet.getString("screw"));
				streetlight.setSupportingArm(resultSet.getString("supporting_arm"));
				streetlight.setWire(resultSet.getString("wire"));
				streetlight.setCreatedTime(resultSet.getDate("created_time"));
				streetlight.setModifiedTime(resultSet.getDate("modified_time"));
				list.add(streetlight);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//新增路灯信息
	public static int insertStreetLight(Streetlight streetlight){
		Connection connection = JdbcConnector.getConnection();
	    String sql="insert into streetlight_info(id,lamp_wick,lamp_shade,wire,supporting_arm,screw,created_time,modified_time)"
	    		+ " values(?,?,?,?,?,?,now(),now())";
	    
	   
	    try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, (int) System.currentTimeMillis());
			prepareStatement.setString(2, streetlight.getLampWick());
			prepareStatement.setString(3, streetlight.getLampshade());
			prepareStatement.setString(4, streetlight.getWire());
			prepareStatement.setString(5, streetlight.getSupportingArm());
			prepareStatement.setString(6, streetlight.getScrew());
			int update = prepareStatement.executeUpdate();
			return update;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}


}
