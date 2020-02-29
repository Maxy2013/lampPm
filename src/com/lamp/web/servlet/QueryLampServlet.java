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
import com.lamp.web.entity.Streetlight;

public class QueryLampServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Streetlight streetlight = new Streetlight();
		streetlight.setLampWick("玻璃灯罩");
		streetlight.setLampshade("圆形灯柱");
		streetlight.setWire("国家级甲型线缆");
		streetlight.setSupportingArm("短支撑臂");
		streetlight.setScrew("S-I新型螺钉");
		streetlight.setCreateTime(new Date());
		
		Streetlight streetlight1 = new Streetlight();
		streetlight1.setLampWick("A玻璃灯罩");
		streetlight1.setLampshade("圆形灯柱");
		streetlight1.setWire("国家级乙型线缆");
		streetlight1.setSupportingArm("长支撑臂");
		streetlight1.setScrew("S-I新型螺钉");
		streetlight1.setCreateTime(new Date());
		
		List<Streetlight> list = new ArrayList<>();
		list.add(streetlight);
		list.add(streetlight1);
		
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
