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
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;



/**
 * @author bharath
 *
 */
public class OtpLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
			{
		RequestDispatcher rd=null;
		HttpSession ses=req.getSession();
		String adharid=ses.getAttribute("adharid").toString();
		
		
		System.out.println("----- "+adharid);
		String otp=req.getParameter("otpno"); 
		
	boolean flag=	UserDAO.checkUser_OTP(adharid, otp);
	
	if(flag)
	{
		
		
		rd=req.getRequestDispatcher("/jsp/user/userhome.jsp");
		rd.forward(req,resp);
	}
	else 
	{
		rd=req.getRequestDispatcher("otpLogin.jsp?no=1");
		rd.forward(req,resp);
	}
		
		

}
}