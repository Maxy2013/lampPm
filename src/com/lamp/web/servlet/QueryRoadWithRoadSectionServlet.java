package com.lamp.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import com.lamp.web.dao.RoadDao;

import com.lamp.web.entity.Road;

public class QueryRoadWithRoadSectionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	List<Road> dataList = RoadDao.queryRoadWithRoadSection(req.getParameter("roadSection"));
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/json;charset=UTF-8");
		
		String jsonString = JSON.toJSONString(dataList);
		PrintWriter out = resp.getWriter();
		out.write(jsonString);
		out.flush();
		out.close();	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
