package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDAO;

public class DeleteAdhar extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		
		try
		{
		
		HttpSession ses=null;
		RequestDispatcher rd=null;
		
		/*boolean flag=false;
		ses=req.getSession();*/
		
		
		
		
		String ad_no=req.getParameter("ID").toString();
		
		
		boolean flag=AdminDAO.deleteAdhar(ad_no);
		
		
		if(flag)
		{
		
			  req.setAttribute("message", "Adhar Deleted Successfulyy");
			
			 rd=req.getRequestDispatcher("jsp/admin/Adhardetailes.jsp?no=1");
				rd.forward(req, resp);
		}
		}catch (Exception e)
		{
			// TODO: handle exception
			
			
		}
}
}
