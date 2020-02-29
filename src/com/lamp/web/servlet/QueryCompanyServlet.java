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
import com.lamp.web.entity.Company;


public class QueryCompanyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Company company = new Company();
		company.setId(1009911);
		company.setCompanyUnicode("HD-990AA9100P");
		company.setCompanyName("兴旺灯具制造有限公司");
		company.setAddress("长江路");
		company.setCreatedTime(new Date());
		company.setModifiedTime(new Date());
		
		Company company1 = new Company();
		company1.setId(1009911);
		company1.setCompanyUnicode("HD-990AA9100P");
		company1.setCompanyName("兴旺灯具制造有限公司");
		company1.setAddress("长江路");
		company1.setCreatedTime(new Date());
		company1.setModifiedTime(new Date());
		
		List<Company> dataList = new ArrayList<>();
		dataList.add(company);
		dataList.add(company1);
		
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
