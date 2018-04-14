/**
 * 
 */
package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDAO;

/**
 * @author bharath
 *
 */
public class Login extends HttpServlet 
{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		
		HttpSession ses=null;
		RequestDispatcher rd=null;
		String adminname="";
		String pass="";
		boolean flag=false;
		ses=req.getSession();
		
		adminname=req.getParameter("adminname").toString();
		
		pass=req.getParameter("pass").toString();
		
		AdminDAO dao=new AdminDAO();
		flag=dao.checkAdmin(adminname, pass);
		
		if(flag)
		{
		ses.setAttribute("name", adminname);
			rd=req.getRequestDispatcher("jsp/admin/adminhome.jsp");
			rd.forward(req, resp);
		}
		
		else
		{
			rd=req.getRequestDispatcher("/index.jsp?no=1");
			rd.forward(req, resp);
		}
	
	}
}
