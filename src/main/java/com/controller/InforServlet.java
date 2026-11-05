package com.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InforServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		
		Infor infor = new Infor();
		infor.setAddress(address);
		infor.setId(id);
		infor.setName(name);
		infor.setPhone(phone);
		infor.setPwd(pwd);
		
		req.setAttribute("infor",infor);
		// 결과를 infoResult.jsp에 출력
		RequestDispatcher rd = req.getRequestDispatcher("/exam/infoResult.jsp");
		rd.forward(req, resp);
	}
}
