package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDAO;


public class EditPhani extends HttpServlet
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
			{
				
		try
		{
		
		
		
		String ad_no;
		String ad_name;
		String dob;
		String ad_address;
		String contact;
				
				
       ad_no=request.getParameter("Phani_Id").toString();
		
		ad_name=request.getParameter("Adhar_No").toString();
		
		dob=request.getParameter("Survey_No").toString();
		
		ad_address=request.getParameter("Soil_Type").toString();
		contact=request.getParameter("Total_Land").toString();
		 
					
					
					boolean result = AdminDAO.Edit_Phani_Detailes(ad_no, ad_name, dob, ad_address,contact);
					
					System.out.println(result);
					RequestDispatcher rd;
					HttpSession hs = request.getSession(true);
					
					String utype=(String)hs.getAttribute("usertype");
					if(result)
					{
						request.setAttribute("message", "Updated Successfully");
						
						
						rd=request.getRequestDispatcher("jsp/admin/PhaniDetails.jsp?no=1");
						rd.forward(request, response);
						
						
							
						
						
					}
					else
					{
						rd=request.getRequestDispatcher("/index.jsp?no=1");
						rd.forward(request, response);
					}
		}catch (Exception e)
		{
			// TODO: handle exception
		}
				
				
}
}
