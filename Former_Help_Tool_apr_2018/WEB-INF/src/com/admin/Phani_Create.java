package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDAO;

public class Phani_Create extends HttpServlet
{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		
		HttpSession ses=null;
		RequestDispatcher rd=null;
		
		boolean flag=false;
		ses=req.getSession();
		
		
		String phani_id;
		String adha_no;
		String sur_no;
		String soil_type;
		String total_land;
		String District;
		String rainfall;
		
		String myform=req.getParameter("myform");
		
		
		if(myform.equals("Add"))
		{
			phani_id=req.getParameter("Phani_Id").toString();
		
			adha_no=req.getParameter("Adhar_No").toString();
		
			sur_no=req.getParameter("Survey_No").toString();
		
			soil_type=req.getParameter("Soil_Type").toString();
			total_land=req.getParameter("Total_Land").toString();
			District=req.getParameter("District").toString();
			rainfall=req.getParameter("RAIN_FALL").toString();
		
		flag=AdminDAO.add_Phani_Detailes(phani_id, adha_no, sur_no, soil_type, total_land,District,rainfall);
		
		if(flag)
		{
		
			rd=req.getRequestDispatcher("jsp/admin/PhaniDetails.jsp?no=1");
			rd.forward(req, resp);
		}
		
		else
		{
			rd=req.getRequestDispatcher("jsp/admin/PhaniDetails.jsp?no=2");
			rd.forward(req, resp);
		}
		}
		
		
		
		else if(myform.equals("Update"))
		{
			
			
			
			
			
			phani_id=req.getParameter("Phani_Id").toString();
			
			adha_no=req.getParameter("Adhar_No").toString();
			
			sur_no=req.getParameter("Survey_No").toString();
			
			soil_type=req.getParameter("Soil_Type").toString();
			total_land=req.getParameter("Total_Land").toString();
			District=req.getParameter("District").toString();
			
			flag=AdminDAO.update_Phani_Detailes(phani_id, adha_no, sur_no, soil_type, total_land,District);
			
			if(flag)
			{
			
				rd=req.getRequestDispatcher("jsp/admin/PhaniDetails.jsp?no=1");
				rd.forward(req, resp);
			}
			
			else
			{
				rd=req.getRequestDispatcher("jsp/admin/PhaniDetails.jsp?no=2");
				rd.forward(req, resp);
			}
			
			
			
			
			
			
			
		}
	
	}
	
}
