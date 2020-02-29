package com.lamp.web.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lamp.web.entity.Material;
import com.lamp.web.jdbc.JdbcConnector;

public class MaterialDao {
	private static Connection connection;
	public static List<Material> queryMaterial(){
		connection=JdbcConnector.getConnection();
		String sql="select * from material_info";
		List<Material> list = new ArrayList<Material>();
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String materialNumber = resultSet.getString("material_number");
				String name = resultSet.getString("name");
				String factory = resultSet.getString("factory");
				double price = resultSet.getDouble("price");
				String unitOfMeasurement = resultSet.getString("unit_of_measurement");
				Date createdTime = resultSet.getDate("created_time");
				Date modifiedTime = resultSet.getDate("modified_time");
				Material material = new Material();
				material.setId(id);
				material.setMaterialNumber(materialNumber);
				material.setName(name);
				material.setFactory(factory);
				material.setPrice(price);
				material.setUnitOfMeasurement(unitOfMeasurement);
				material.setCreatedTime(createdTime);
				material.setModifiedTime(modifiedTime);
				list.add(material);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return list;
	}
	public static void main(String[] args) {
		List<Material> queryMaterial = queryMaterial();
		System.out.println(queryMaterial.size()+"-----");
	}

}
