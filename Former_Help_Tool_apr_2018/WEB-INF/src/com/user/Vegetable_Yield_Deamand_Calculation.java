package com.user;

import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.ArrayUtils;


import com.dao.UserDAO;

import com.prediction.LinearRegression;

public class Vegetable_Yield_Deamand_Calculation extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
		{
	
	 RequestDispatcher rd=null;
	
	 String vegetable[]=req.getParameterValues("vegetable");
	 
	 
	 System.out.println("vegetable "+vegetable[0]);
	 String noectr=req.getParameter("noectr");
	 
	 HttpSession ses=req.getSession();
String total_land=	ses.getAttribute("total_land").toString();
	 
ses.setAttribute("noectr", noectr);

String remain_total_land=	ses.getAttribute("remain_total_land").toString();
	 

System.out.println("remain_total_land "+remain_total_land);
	 if(Integer.parseInt(noectr)>Integer.parseInt(total_land) || Integer.parseInt(noectr)>Integer.parseInt(remain_total_land))
	 {
		 rd=req.getRequestDispatcher("/jsp/user/vegetable.jsp?no=1");
			rd.forward(req, resp);
	 }
	 else
	 {
		 
				
				//vegetable demand and yield calculation process............................................................
				
				/*
				 
				 *  calculate the vegetable yield
				 *   using linear regration
				      
				 
				 */
				ArrayList<Double> vegetable_yield=UserDAO.get_vegetable_yield(UserDAO.get_m_vegetable_name(vegetable[0].trim()));
					
				
				int hrvrstm=UserDAO.get_vegetable_harvesting_time(vegetable[0].trim());
				 
					double veg[]= convertDoubles(vegetable_yield);
					
					//predicted vegetable yield 
					double vegtble_predicted_yield_res=LinearRegression.yield_predict(veg);
					
					System.out.println("predicted vegetable yield is "+vegtble_predicted_yield_res);
				 
					
					
					//total vegetable yield (noof land acres*predicted vegetable yield  )
					double total_vegitable_yield=Math.round(Integer.parseInt(noectr)*vegtble_predicted_yield_res);
					
			
					System.out.println("total vegitable  yield "+total_vegitable_yield);
					
					
					
				
					
					
					
					String[] shortMonths = new DateFormatSymbols().getShortMonths();
					String mon="";
					
					
						 mon=shortMonths[Math.abs(12-Calendar.getInstance().get(Calendar.MONTH)-hrvrstm)].toLowerCase();
					

					
					
					System.out.println("month "+mon);
					
					/*
					 
					 *  predict vegetable  demand month wise 
					 *   using linear regration
					      
					 
					 */
					
					
					 ArrayList vegetable_demand_status=UserDAO.get_vegetable_demand_status_new_demand(vegetable[0].trim(),mon);
					 
					 System.out.println("   "+vegetable_demand_status);
					 
					 
					 double vegetable_predicted_demand_res=0;
					
					 if(vegetable_demand_status.get(0).equals("true"))
					 {
						 vegetable_predicted_demand_res=Double.parseDouble(vegetable_demand_status.get(1).toString());
					 }
					 else
					 {
					 ArrayList<Double> vegetable_demand=UserDAO.get_vegetable_demand(vegetable[0].trim(),mon);
						
					 ses.setAttribute("vegetable_id",vegetable[0].trim());
					 ses.setAttribute("month",mon);
					 
						double veg_demand[]= convertDoubles(vegetable_demand);
						 vegetable_predicted_demand_res=LinearRegression.yield_predict(veg_demand);
						
					 }	
					
					 
					 System.out.println("predicted vegetable demand is "+vegetable_predicted_demand_res);
						
						 if(!(vegetable_yield.size()==0))
						 {
						
								
								 ses.setAttribute("vegetable",UserDAO.get_m_vegetable_name(vegetable[0].trim()));
								ses.setAttribute("vegitable_predicted_yield", vegtble_predicted_yield_res);
								ses.setAttribute("total_vegetable_yield", total_vegitable_yield);
								ses.setAttribute("vegetable_predicted_demand", vegetable_predicted_demand_res);
								
								
								
								
							  rd=req.getRequestDispatcher("/jsp/user/report.jsp?no1=2");
								rd.forward(req, resp);
						 }
						 else
						 {
							  rd=req.getRequestDispatcher("/jsp/user/vegetable.jsp?no=2");
								rd.forward(req, resp);
						 }
						
						
						
						
						
						
						
			
			
	 }
	 
	 
	 
	 
}
 
 
 public static double[] convertDoubles(ArrayList<Double> doubles)
 {
     double[] ret = new double[doubles.size()];
     Iterator<Double> iterator = doubles.iterator();
     int i = 0;
     while(iterator.hasNext())
     {
         ret[i] = iterator.next();
         i++;
     }
     return ret;
 }
 
 
 public static void main(String[] args) 
 {
	/* ArrayList<Double> yield=UserDAO.get_crop_yield("Ragi");
	
	 
	double d[]= convertDoubles(yield);
	double predicted_res=LinearRegression.yield_predict(d);
	
	System.out.println(predicted_res);*/
	 
	 
	 
}
}
