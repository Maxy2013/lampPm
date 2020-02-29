package com.lamp.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;


public class RoadsServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("name", "知春路");
		dataMap.put("legth", "335");
		dataMap.put("area", "渝北区");
		dataMap.put("lampNum", "300");
		dataMap.put("status", "已开工");
		Map<String, String> roadMap = new HashMap<>();
		roadMap.put("name", "知春1路");
		roadMap.put("legth", "100");
		roadMap.put("area", "巴南区");
		roadMap.put("lampNum", "100");
		roadMap.put("status", "未开工");
		List<Map<String, String>> dataList = new ArrayList<>();
		dataList.add(dataMap);
		dataList.add(roadMap);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("test/json;charset=UTF-8");
		
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
