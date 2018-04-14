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
public class Adhar_Create extends HttpServlet 
{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		
		HttpSession ses=null;
		RequestDispatcher rd=null;
		
		boolean flag=false;
		ses=req.getSession();
		
		
		String ad_no;
		String ad_name;
		String dob;
		String ad_address;
		String contact;
		
		
		String myform=req.getParameter("myform");
		
		
		if(myform.equals("Add"))
		{
		ad_no=req.getParameter("Adhar_No").toString();
		
		ad_name=req.getParameter("Name").toString();
		
		dob=req.getParameter("DOB").toString();
		
		ad_address=req.getParameter("Address").toString();
		contact=req.getParameter("contact").toString();
		
		
		flag=AdminDAO.add_Adhar_Detailes(ad_no, ad_name, dob, ad_address, contact);
		
		if(flag)
		{
		
			rd=req.getRequestDispatcher("jsp/admin/Adhardetailes.jsp?no=1");
			rd.forward(req, resp);
		}
		
		else
		{
			rd=req.getRequestDispatcher("/index.jsp?no=1");
			rd.forward(req, resp);
		}
		}
		
		
		
		else if(myform.equals("Update"))
		{
			
			
			
			
			
			ad_no=req.getParameter("Adhar_No").toString();
			
			ad_name=req.getParameter("Name").toString();
			
			dob=req.getParameter("DOB").toString();
			
			ad_address=req.getParameter("Address").toString();
			contact=req.getParameter("contact").toString();
			
			
			flag=AdminDAO.add_Adhar_Detailes(ad_no, ad_name, dob, ad_address, contact);
			
			if(flag)
			{
			
				rd=req.getRequestDispatcher("jsp/admin/Adhardetailes.jsp?no=1");
				rd.forward(req, resp);
			}
			
			else
			{
				rd=req.getRequestDispatcher("/index.jsp?no=1");
				rd.forward(req, resp);
			}
			
			
			
			
			
			
			
		}
	
	}
}
