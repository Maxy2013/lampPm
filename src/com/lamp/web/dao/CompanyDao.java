package com.lamp.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lamp.web.entity.Company;
import com.lamp.web.entity.Material;
import com.lamp.web.jdbc.JdbcConnector;

public class CompanyDao {
	
	private static Connection connection;
	public static void main(String[] args) {
		List<Company> queryCompany = queryCompany();
		System.out.println(queryCompany.size()+"------");
	}
	public static List<Company> queryCompany() {
		connection = JdbcConnector.getConnection();
		String sql = "select * from company_info";
		List<Company> list = new ArrayList<Company>();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery(sql);
			while (resultSet.next()) {
				Company company=new Company();
				company.setId(resultSet.getInt("id"));
				company.setCompanyName(resultSet.getString("company_name"));
				company.setCompanyUnicode(resultSet.getString("company_unicode"));
				company.setAddress(resultSet.getString("address"));
				company.setCreatedTime(resultSet.getDate("created_time"));
				company.setModifiedTime(resultSet.getDate("modified_time"));
				list.add(company);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//根据companyUnicode公司编码查询相关信息
	public static List<Company> queryCompanyWithCompanyUnicode(String companyUnicode) {
		connection = JdbcConnector.getConnection();
		String sql = "select * from company_info where company_unicode=?";
		List<Company> list = new ArrayList<Company>();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(2, companyUnicode);
			ResultSet resultSet = ps.executeQuery(sql);
			while (resultSet.next()) {
				Company company=new Company();
				company.setId(resultSet.getInt("id"));
				company.setCompanyName(resultSet.getString("company_name"));
				company.setCompanyUnicode(resultSet.getString("company_unicode"));
				company.setAddress(resultSet.getString("address"));
				company.setCreatedTime(resultSet.getDate("created_time"));
				company.setModifiedTime(resultSet.getDate("modified_time"));
				list.add(company);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
