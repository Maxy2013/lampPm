package com.lamp.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lamp.web.entity.Company;
import com.lamp.web.jdbc.JdbcConnector;

public class CompanyDao {
	
	private static Connection connection;
	public static void main(String[] args) {
		insert(new Company());
	}
	public static int insert(Company company) {
		connection = JdbcConnector.getConnection();
		String sql = "insert into book (id, name) values (?, ?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, "132423");
			ps.setString(2, "张三丰");
			int executeUpdate = ps.executeUpdate();
			return executeUpdate;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
