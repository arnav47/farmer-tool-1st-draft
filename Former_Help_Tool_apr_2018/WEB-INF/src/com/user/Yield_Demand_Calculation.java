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

public class Yield_Demand_Calculation extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
		{
	
	 RequestDispatcher rd=null;
	 String grains[]=req.getParameterValues("grains");
	 String vegetable[]=req.getParameterValues("vegetable");
	 
	 
	 System.out.println("vegetable "+vegetable[0]);
	 String noectr=req.getParameter("noectr");
	 
	 HttpSession ses=req.getSession();
String total_land=	ses.getAttribute("total_land").toString();
	 
String crops=	ses.getAttribute("crops").toString();
	 
	 if(Integer.parseInt(noectr)>Integer.parseInt(total_land))
	 {
		 rd=req.getRequestDispatcher("/jsp/user/crop_yield_selection.jsp?no=1&crops="+crops+"");
			rd.forward(req, resp);
	 }
	 else
	 {
		 
		 
		  //Grains demand and yield calculation process...................................................
		 
		 
		/*
		 
		 *  calculate the grains yield 
		 *   using linear regration
		      
		 
		 */
		 
		 
		 ArrayList<Double> crop_yield=UserDAO.get_crop_yield(grains[0].trim());
			
		 
			double d[]= convertDoubles(crop_yield);
			
			//predicted grains yield 
			double crop_predicted_yield_res=LinearRegression.yield_predict(d);
			
			
			
			System.out.println("predicted grains yield is "+crop_predicted_yield_res);
		 
			
			//total grains yield (noof land acres*predicted grains yield )
			double total_crop_yield=Math.round(Integer.parseInt(noectr)*crop_predicted_yield_res);
			
	
			
			
			System.out.println("total grains  yield "+total_crop_yield);
			
			
			
			/*
			 
			 *  predict grains demand 
			 *   using linear regration
			      
			 
			 */
			
			 ArrayList<Double> crop_demand=UserDAO.get_crop_demand(grains[0].trim());
				
			 
				double demand[]= convertDoubles(crop_demand);
				double crop_predicted_demand_res=LinearRegression.yield_predict(demand);
				
				System.out.println("predicted crop demand is "+crop_predicted_demand_res);
				
				
				
		
				
				
				
				
				//vegetable demand and yield calculation process............................................................
				
				
				
				
				
				
				/*
				 
				 *  calculate the vegetable yield 
				 *   using linear regration
				      
				 
				 */
				ArrayList<Double> vegetable_yield=UserDAO.get_vegetable_yield(UserDAO.get_m_vegetable_name(vegetable[0].trim()));
					
				 
					double veg[]= convertDoubles(vegetable_yield);
					
					//predicted vegetable yield 
					double vegtble_predicted_yield_res=LinearRegression.yield_predict(veg);
					
					System.out.println("predicted vegetable yield is "+vegtble_predicted_yield_res);
				 
					
					
					//total vegetable yield (noof land acres*predicted vegetable yield  )
					double total_vegitable_yield=Math.round(Integer.parseInt(noectr)*vegtble_predicted_yield_res);
					
			
					System.out.println("total vegitable  yield "+total_vegitable_yield);
					
					
					
				
					
					
					
					String[] shortMonths = new DateFormatSymbols().getShortMonths();
					String mon="";
					if(Calendar.getInstance().get(Calendar.MONTH)==12)
					{
						 mon=shortMonths[0].toLowerCase();
					}
					else
					{
						 mon=shortMonths[Calendar.getInstance().get(Calendar.MONTH)+1].toLowerCase();
					}

					
					
					System.out.println("month "+mon);
					
					/*
					 
					 *  predict vegetable  demand month wise 
					 *   using linear regration
					      
					 
					 */
					
					
					 ArrayList<Double> vegetable_demand=UserDAO.get_vegetable_demand(vegetable[0].trim(),mon);
						
					 
						double veg_demand[]= convertDoubles(vegetable_demand);
						double vegetable_predicted_demand_res=LinearRegression.yield_predict(veg_demand);
						
						System.out.println("predicted vegetable demand is "+vegetable_predicted_demand_res);
				
						
						 if(!(crop_yield.size()==0) && !(vegetable_yield.size()==0))
						 {
							
							 ses.setAttribute("grain", grains[0].trim());
							 ses.setAttribute("grain_predicted_yield", crop_predicted_yield_res);
								ses.setAttribute("total_grain_yield", total_crop_yield);
								ses.setAttribute("grain_predicted_demand", crop_predicted_demand_res);
								
								 ses.setAttribute("vegetable",UserDAO.get_m_vegetable_name(vegetable[0].trim()));
								ses.setAttribute("vegitable_predicted_yield", vegtble_predicted_yield_res);
								ses.setAttribute("total_vegetable_yield", total_vegitable_yield);
								ses.setAttribute("vegetable_predicted_demand", vegetable_predicted_demand_res);
								
								
								
								
							  rd=req.getRequestDispatcher("/jsp/user/report.jsp?");
								rd.forward(req, resp);
						 }
						 else
						 {
							  rd=req.getRequestDispatcher("/jsp/user/crop_yield_selection.jsp?no=2");
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
