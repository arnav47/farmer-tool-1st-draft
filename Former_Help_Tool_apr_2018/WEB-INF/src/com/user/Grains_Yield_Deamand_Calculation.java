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

public class Grains_Yield_Deamand_Calculation extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
		{
	
	 RequestDispatcher rd=null;
	 String grains[]=req.getParameterValues("grains");
	
	 
	 
	
	 String noectr=req.getParameter("noectr");
	 
	 
	
	 
	 HttpSession ses=req.getSession();
String total_land=	ses.getAttribute("total_land").toString();


ses.setAttribute("noectr", noectr);
	 
String crops=	ses.getAttribute("crops").toString();

String Phani_id=	ses.getAttribute("Phani_id").toString();
int remain_total_land=	UserDAO.get_remain_total_land(Phani_id);

System.out.println("remain_total_land "+remain_total_land);

System.out.println("noectr "+noectr);

   if(Integer.parseInt(noectr)>remain_total_land)
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
			
			 ArrayList grain_demand_status=UserDAO.get_grain_demand_status_new_demand(grains[0].trim());
			 
			 double crop_predicted_demand_res=0;
			 if(grain_demand_status.get(0).equals("true"))
			 {
				 crop_predicted_demand_res=Double.parseDouble(grain_demand_status.get(1).toString());
			
			 }
			 else
			 {
			 ArrayList<Double> crop_demand=UserDAO.get_crop_demand(grains[0].trim());
				
			 
				double demand[]= convertDoubles(crop_demand);
				 crop_predicted_demand_res=LinearRegression.yield_predict(demand);
				
			 }
				System.out.println("predicted crop demand is "+crop_predicted_demand_res);
				
				
				
		
				
				
				
				
			
						
						 if(!(crop_yield.size()==0))
						 {
							
							 ses.setAttribute("grain", grains[0].trim());
							 ses.setAttribute("grain_predicted_yield", crop_predicted_yield_res);
								ses.setAttribute("total_grain_yield", total_crop_yield);
								ses.setAttribute("grain_predicted_demand", crop_predicted_demand_res);
								
								
							  rd=req.getRequestDispatcher("/jsp/user/report.jsp?no1=1");
								rd.forward(req, resp);
						 }
						 else
						 {
							  rd=req.getRequestDispatcher("/jsp/user/grains.jsp?no=2");
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
