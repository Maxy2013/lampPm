package com.lamp.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lamp.web.entity.Road;
import com.lamp.web.jdbc.JdbcConnector;

public class RoadDao {

	public static void main(String[] args) {
		List<Road> queryRoad = queryRoad();
		System.out.println(queryRoad.size()+"-----");
	}
	private static Connection connection;
	//查询道路相关信息
	public static List<Road> queryRoad(){
		connection=JdbcConnector.getConnection();
		String sql="select * from road_info";
		Road road = new Road();
		List<Road> list = new ArrayList<Road>();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery(sql);
			while(resultSet.next()) {
				road.setId(resultSet.getInt("id"));
				road.setArea(resultSet.getString("area"));
				road.setInstallCompany(resultSet.getString("install_company"));
				road.setLength(resultSet.getInt("length"));
				road.setNeedLightNumber(resultSet.getInt("need_light_number"));
				road.setRoadSection(resultSet.getString("road_section"));
				road.setCreatedTime(resultSet.getDate("created_time"));
				road.setModifiedTime(resultSet.getDate("modified_time"));
				list.add(road);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

}
