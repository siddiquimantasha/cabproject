package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDAO;


@WebServlet("/register")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String repeatpassword=request.getParameter("repeatpassword");
		String role=request.getParameter("role");
		String phoneno=request.getParameter("phoneno");
		String email= request.getParameter("email");
		String city= request.getParameter("city");
		String age= request.getParameter("age");
		
		UserDAO ud = new UserDAO();
		try 
		{
			if(repeatpassword.equals(password))
			{		
				ud.insertUser(name, password, role, phoneno, email, city, age);
				response.sendRedirect("success.jsp");
			}
			else
			{
				PrintWriter out = response.getWriter();
				out.println("Password does not match");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
