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
	    Streetlight streetlight = new Streetlight();
	    List<Streetlight> list = new ArrayList<Streetlight>();
	    try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery(sql);
			while(resultSet.next()) {
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

}
