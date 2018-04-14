/**
 * 
 */
package com.user;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.dao.UserDAO;

/**
 * @author bharath
 *
 */
public class ULogin extends HttpServlet 
{
public static String lat; 
public static String lang;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		
		HttpSession ses=req.getSession();
		String adharid=req.getParameter("username");
		RequestDispatcher rd=null;
	String password=req.getParameter("password");
	
	boolean flag=UserDAO.checkUser(adharid, password);
	
	
	String rno= Randam_No.genarate_Random();
	UserDAO.update_m_user_OTP(adharid, rno);
	ses.setAttribute("adharid", adharid);
	if(flag)
	{
		
		rd=req.getRequestDispatcher("/otpLogin.jsp?otp="+rno+"");
		rd.forward(req, resp);
	}
	
	else
	{
		rd=req.getRequestDispatcher("/index.jsp?no=1");
		rd.forward(req, resp);
	}
	
	
	
	}
}
