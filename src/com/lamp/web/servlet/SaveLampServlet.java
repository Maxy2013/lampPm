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
import com.lamp.web.dao.StreetLightDao;
import com.lamp.web.entity.Streetlight;

public class SaveLampServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String wick = req.getParameter("wick");//灯罩
		String shape = req.getParameter("shape");//灯柱
		String wire = req.getParameter("wire");//线缆
		String supportArm = req.getParameter("supportArm");//支撑臂
		String screw = req.getParameter("screw");//螺钉
		
		Streetlight streetlight = new Streetlight(wick, shape, wire, supportArm, screw);
		
		int insertRow = StreetLightDao.insertStreetLight(streetlight);
		
		resp.setCharacterEncoding(Config.CHARACTER_ENCODING);
//		resp.setContentType(Config.CONTENT_TYPE_JSON);
		
		PrintWriter out = resp.getWriter();
		out.write(String.valueOf(insertRow));		
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
