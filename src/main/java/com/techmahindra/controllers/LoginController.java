package com.techmahindra.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.services.LoginBeanService;
import com.techmahindra.servicesfactory.ServicesFactory;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=ISO-8859-1");
		PrintWriter out=response.getWriter();
		String role="";
		try
		{
			String uname=request.getParameter("userName");
			String password=request.getParameter("passWord");
			System.out.println("hello"+uname);
			LoginBean lb=new LoginBean();
			lb.setUserName(uname);
			lb.setPassword(password);
			
			HttpSession hs = request.getSession();
			hs.setAttribute("n", uname);
			
			LoginBeanService lbs=ServicesFactory.getLoginBeanService();
			try
			{
				role=lbs.validateUser(lb);
				System.out.println(role);
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			System.out.println(role);
			if(role.equalsIgnoreCase("admin"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("adminpage.html");
				rd.forward(request, response);
			}
			 if(role.equalsIgnoreCase("user"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("test_details.jsp");
				rd.forward(request, response);
		}
			if(role.equalsIgnoreCase("invaliduser"))
			{
				request.setAttribute("msg","Invalid username and password");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
			}
		}
		finally{
			out.close();
		}
		
	}


}
