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
import com.lamp.web.dao.MaterialDao;
import com.lamp.web.entity.Material;
import com.lamp.web.entity.Streetlight;

public class QueryMaterialServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		List<Material> list = MaterialDao.queryMaterial();
		
		
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
