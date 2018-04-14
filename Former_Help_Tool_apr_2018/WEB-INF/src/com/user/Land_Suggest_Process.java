/**
 * 
 */
package com.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.admin.ExcellUpload;
import com.admin.ExcellUpload2;
import com.dao.UserDAO;

/**
 * @author bharath
 *
 */
public class Land_Suggest_Process extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		HttpSession ses=req.getSession();
		RequestDispatcher rd=null;
	
		String crops="";
		String place="";
	
		
		System.out.println("------------------"+place);
		String land[]=req.getParameterValues("land");
		System.out.println("------------------"+land[0]);
		
		
		
		String lnddet=UserDAO.get_Phani_total_land_district(land[0]);
		
		place=lnddet.split("_")[1].trim();
		
		String total_land=lnddet.split("_")[0];
		
		String remain_total_land=lnddet.split("_")[2];
		
		ses.setAttribute("Phani_id", land[0]);
		ses.setAttribute("total_land", total_land);
		ses.setAttribute("remain_total_land", remain_total_land);
		//System.out.println("------------------"+land[1]);
	String sql="";
		ArrayList<String> list= Find_Seasons.getSeason();
		
		for(int i=0;i<land.length;i++)
		{
		
			
			if(list.get(0).toString().equals("Kharif"))
					{
				sql="select kharif from dist_wise_crops where district='"+place+"'";
					}
			else if(list.get(0).toString().equals("Rabi"))
			{
		sql="select rabi from dist_wise_crops where district='"+place+"'";
			}
			else if(list.get(0).toString().equals("Summer"))
			{
		sql="select summer from dist_wise_crops where district='"+place+"'";
			}
		
		
		
		
			crops=UserDAO.get_crops_details(sql);

	
		
		}
		System.out.println("crops "+crops);
		
		
		 if(!crops.equals(""))
		 {
			 
			 ses.setAttribute("crops", crops);
			  rd=req.getRequestDispatcher("/jsp/user/crop_yield_selection.jsp?crops="+crops+"");
				rd.forward(req, resp);
		 }
		 else
		 {
			  rd=req.getRequestDispatcher("/jsp/user/crop_yield_selection.jsp?no=2");
				rd.forward(req, resp);
		 }
			
	}
}
