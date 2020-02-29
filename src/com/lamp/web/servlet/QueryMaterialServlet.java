package com.lamp.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.lamp.web.base.Config;
import com.lamp.web.entity.Material;
import com.lamp.web.entity.Streetlight;

public class QueryMaterialServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Material material = new Material();
		material.setId(12345);
		material.setMaterialNumber("900190-I号");
		material.setName("玻璃灯罩-I号");
		material.setFactory("玻璃灯罩制造有限公司");
		material.setPrice(30.89);
		material.setUnitOfMeasurement("个");
		material.setCreatedTime(new Date());
		
		Material material1 = new Material();
		material1.setId(33);
		material1.setMaterialNumber("900190-II号");
		material1.setName("法兰盘-#I*号");
		material1.setFactory("玻璃灯罩制造有限公司");
		material1.setPrice(20.89);
		material1.setUnitOfMeasurement("个");
		material1.setCreatedTime(new Date());
		
		List<Material> list = new ArrayList<>();
		list.add(material);
		list.add(material1);
		
		String string = JSON.toJSONString(list);
		resp.setCharacterEncoding(Config.CHARACTER_ENCODING);
		resp.setContentType(Config.CONTENT_TYPE_JSON);
		
		PrintWriter out = resp.getWriter();
		out.write(string);		
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
