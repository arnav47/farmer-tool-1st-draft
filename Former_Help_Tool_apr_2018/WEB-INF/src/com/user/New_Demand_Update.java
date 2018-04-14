package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;

public class New_Demand_Update extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
		{
	
	 HttpSession session=req.getSession();
	 RequestDispatcher  rd=null;
	String status= req.getParameter("status");
	String product= req.getParameter("product");
	
	if(status.equals("yes"))
	{
		
		
		System.out.println(product);
		
		if(product.equals("Grain"))
		{
		String grain=session.getAttribute("grain").toString();
		String grain_predicted_demand=session.getAttribute("grain_predicted_demand").toString();
		UserDAO.update_Grain_demand_status("true", grain, grain_predicted_demand);
		
		}
		if(product.equals("vegetable"))
		{
			
			
			String vegetable_id=session.getAttribute("vegetable_id").toString();
			String vegetable_month=session.getAttribute("month").toString();
		  String vegetable=session.getAttribute("vegetable").toString();	
		  String vegetable_predicted_demand=session.getAttribute("vegetable_predicted_demand").toString();
		  
			UserDAO.update_vegetable_demand_status("true", vegetable_id, vegetable_predicted_demand,vegetable_month);
		  
		  
		}
		String phan_id=session.getAttribute("Phani_id").toString();
		String total_land=session.getAttribute("noectr").toString();
		UserDAO.update_land_remain(phan_id,total_land);
		
		
		
		  rd=req.getRequestDispatcher("/jsp/user/report.jsp?no1=3");
			rd.forward(req, resp);
		
	}
	 
	else if(status.equals("no"))
	{
		  rd=req.getRequestDispatcher("/jsp/user/crop_yield_selection.jsp");
			rd.forward(req, resp);
	}
	 
	
	
}
}
