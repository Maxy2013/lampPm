package com.lamp.web.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JdbcConnector {
	private static final String URL="jdbc:mysql://192.168.1.3:3306/lamp_pm?characterEncoding=utf-8";
	private static final String USER="root";
	private static final String PASSWORD="root";
	private static Connection conn=null;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接Class.forName("com.mysql.jdbc.Driver");
	    try {
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	    PreparedStatement preparedStatement = null;
//	    String sql = "select * from book";
	    //获取PreparedStatement
	    preparedStatement = conn.prepareStatement("select * from book");
	    //执行sql,获取结果集
	    ResultSet rs =preparedStatement.executeQuery();
	    //遍历结果集,取出数据
	   while(rs.next()) {
		   String id = rs.getString(1);
		   String name = rs.getString(2);
		   String number = rs.getString(3);
		   String author = rs.getString(4);
		   //输出数据
		   System.out.println(id+"\t"+name+"\t"+number+"\t"+author);
	   }
	   //关闭结果集
	   rs.close();
	   //关闭数据库连接
	   preparedStatement.close();
	   //关闭连接
	   conn.close();
	    
	}
	
	static {
		//加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}
}
