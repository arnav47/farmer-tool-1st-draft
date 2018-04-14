package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Extract_Adhar extends HttpServlet
{
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
			{

	
	
	String form=req.getParameter("extract");
	
	
	
	if(form.equals("Extract_Adhar"))
	{
	
	String fileName = req.getRealPath("") + "/Adhar_phani_Data/adhar_details.xlsx";
boolean flag=Excellread.extract_adhar(fileName);
	

if(flag)
{
	 RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/Adhardetailes.jsp?no=4");
		rd.forward(req, resp);
}
else
{
	RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/Adhardetailes.jsp?no=5");
		rd.forward(req, resp);
}
	}
	
	
	else if(form.equals("Extract_Phani"))
	{
	
	String fileName = req.getRealPath("") + "/Adhar_phani_Data/phani_details.xlsx";
boolean flag=Excellread.extract_phani(fileName);
	

if(flag)
{
	 RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/PhaniDetails.jsp?no=4");
		rd.forward(req, resp);
}
else
{
	RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/PhaniDetails.jsp?no=5");
		rd.forward(req, resp);
}
	}
	
	
	
}
}