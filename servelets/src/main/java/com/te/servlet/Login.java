package com.te.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String parameter = req.getParameter("uname");
		String parameter2 = req.getParameter("upass");
		
		if(parameter.equals("praveen")) {
			resp.sendRedirect("http://www.youtube.com");
		}
		
		if(parameter.equals("bhushan")) {
			resp.sendRedirect("http://localhost:8085//servlets");//./maharaj can also be used
		}
		
	}

}
