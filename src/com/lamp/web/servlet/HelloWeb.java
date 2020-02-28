package com.lamp.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWeb extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.print("打印一句话");
		System.out.print("打印一句话");
		
//		resp.sendRedirect(req.getContextPath() + "/index2.jsp");
		req.getRequestDispatcher("/index3.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//转发,转发是在服务器端转发的，客户端是不知道的
		super.doPost(req, resp);
		req.getRequestDispatcher(req.getContextPath() + "/index3.jsp");
	}
}
