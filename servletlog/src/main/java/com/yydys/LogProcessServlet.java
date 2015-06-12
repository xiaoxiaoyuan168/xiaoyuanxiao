package com.yydys;


import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LogProcessServlet extends HttpServlet {
	private static final long serialVersionUID = -1520397721353327716L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		Enumeration<String> paramNames = req.getParameterNames();
//		paramNames.
		while(paramNames.hasMoreElements()){
			String paramName = paramNames.nextElement();
			String paramValue = req.getParameter(paramName);
			String[] paramValues = req.getParameterValues(paramName);
			System.out.println("参数名：" + paramName + " || 参数值：" + paramValues );
		}
	}
	

}
