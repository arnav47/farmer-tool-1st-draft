/**
 * 
 */
package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDAO;

/**
 * @author bharath
 *
 */

	public class Register extends HttpServlet 
	{
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
		{
			String uname="";
			String pass="";
			String email="";
			String adhar="";
			String address="";
			
			
			uname=req.getParameter("username");
			pass=req.getParameter("pasword");
			email=req.getParameter("email");
			adhar=req.getParameter("Adhar");
			address=req.getParameter("Address");
			
			boolean flag=false;
			UserDAO u=new UserDAO();
			flag=u.register_user(uname, pass, email, adhar,address);
			RequestDispatcher rd=null;
			System.out.println("flag "+flag);
			if(flag)
			{
			
				rd=req.getRequestDispatcher("/index.jsp?no=2");
				rd.forward(req, resp);
			}
			
			else
			{
				rd=req.getRequestDispatcher("/index.jsp?no=3");
				rd.forward(req, resp);
			}
			
		}
	}

