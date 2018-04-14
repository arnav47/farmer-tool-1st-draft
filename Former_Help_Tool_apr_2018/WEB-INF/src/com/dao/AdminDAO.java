/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;





import com.dao.DAO;


public class AdminDAO
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static AdminDAO adminDAO=null;
	public AdminDAO()
	{
		
	}
	public static AdminDAO getInstance()
	{
		if(adminDAO == null)
		{
			adminDAO= new AdminDAO();
		}
		return adminDAO;
	}
	public boolean checkAdmin(String admin,String pass)
	{
		boolean flag=false;
		
		try
		{
			DAO dao=DAO.getInstance();
			
			connection=dao.connector();
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_admin where admin_name='"+admin+"' and password='"+pass+"'");
			
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Admin Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrDAO-->checkAdmin(String admin,String pass): "+ e);
		}
		
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
	}
	
	
	
	
	public static boolean loginCHK1(String name, String pass) 
	{
		boolean flag=false;
		try
		{
			DAO database=DAO.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_admin where admin_name='"+name+"' and password='"+pass+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Admin Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO.loginCHK()....."+e);
		}
		
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
	}
	
	
	public static  boolean addDataDetails(String district,String karif, String rabi, String summer)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into dist_wise_crops(district,kharif,rabi,summer) values('"+district+"','"+karif+"','"+rabi+"','"+summer+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	
	
	
	public static  boolean add_Adhar_Detailes(String ad_no,String ad_name,String dob,String ad_address,String contact)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_adhar_record(ad_no,name,contact,address,DOB) values('"+ad_no+"','"+ad_name+"','"+contact+"','"+ad_address+"','"+dob+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	

	public static  boolean Edit_Adhar_Detailes(String ad_no,String ad_name,String dob,String ad_address,String contact)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "UPDATE m_adhar_record set name='"+ad_name+"',contact='"+contact+"',address='"+ad_address+"',DOB='"+dob+"' where ad_no='"+ad_no+"' ";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	public static  boolean Edit_Phani_Detailes(String ph_id,String ad_no,String sur_no,String soil,String land)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "UPDATE m_phani_record set ad_no='"+ad_no+"',survey_no='"+sur_no+"',soil_type='"+soil+"',total_land='"+land+"' where phahni_id='"+ph_id+"' ";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	
	public static boolean deleteAdhar(String ad_no)throws Exception
	{
		
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "delete m_adhar_record from m_adhar_record where ad_si_no='"+ad_no+"'";
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}


	
	
	public static boolean deletePhani(String ad_no)throws Exception
	{
		
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "delete from m_phani_record where phahni_id='"+ad_no+"'";
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}


	
	
	
	
	
	


	
	
	
	public static  boolean add_Phani_Detailes(String phani_id,String adha_no,String sur_no,String soil_type,String total_land,String district,String rainfall)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_phani_record(phahni_id,ad_no,survey_no,soil_type,total_land,district,rain_fall,land_remain) values('"+phani_id+"','"+adha_no+"','"+sur_no+"','"+soil_type+"','"+total_land+"','"+district+"','"+rainfall+"','"+total_land+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	public static  boolean update_Phani_Detailes(String phani_id,String adha_no,String sur_no,String soil_type,String total_land,String district)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "update m_phani_record set phahni_id='"+phani_id+"',survey_no='"+sur_no+"',soil_type='"+soil_type+"',total_land='"+total_land+"',district='"+district+"' where ad_no='"+adha_no+"'";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	
	
	
	public static  boolean update_Adhar_Detailes(String ad_no,String ad_name,String dob,String ad_address,String contact)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "update m_adhar_record set ad_no='"+ad_no+"',name='"+ad_name+"',contact='"+contact+"',address='"+ad_address+"',DOB='"+dob+"' where ";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static  boolean add_demand_datset(String crop, String d_2008, String d_2009, String d_2010, String d_2011, String d_2012, String d_2013, String d_2014, String d_2015, String d_2016, String d_2017)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_crop_demand(crop_name,d_2008,d_2009,d_2010,d_2011,d_2012,d_2013,d_2014,d_2015,d_2016,d_2017) values('"+crop+"','"+d_2008+"','"+d_2009+"','"+d_2010+"','"+d_2011+"','"+d_2012+"','"+d_2013+"','"+d_2014+"','"+d_2015+"','"+d_2016+"','"+d_2017+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	
	
	
	
	
	
	public static  boolean add_vegetable_demand_datset(String crop, String d_2008, String d_2009, String d_2010, String d_2011, String d_2012, String d_2013, String d_2014, String d_2015, String d_2016, String d_2017,String vegname)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_vegitable_demand(veg_name_id,month,d_2008,d_2009,d_2010,d_2011,d_2012,d_2013,d_2014,d_2015,d_2016,d_2017) values('"+vegname+"','"+crop+"','"+d_2008+"','"+d_2009+"','"+d_2010+"','"+d_2011+"','"+d_2012+"','"+d_2013+"','"+d_2014+"','"+d_2015+"','"+d_2016+"','"+d_2017+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static  boolean add_vegetable_yield_datset(String crop, String d_2008, String d_2009, String d_2010, String d_2011, String d_2012, String d_2013, String d_2014, String d_2015, String d_2016, String d_2017)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_vegitable_yield(veg_name,d_2008,d_2009,d_2010,d_2011,d_2012,d_2013,d_2014,d_2015,d_2016,d_2017) values('"+crop+"','"+d_2008+"','"+d_2009+"','"+d_2010+"','"+d_2011+"','"+d_2012+"','"+d_2013+"','"+d_2014+"','"+d_2015+"','"+d_2016+"','"+d_2017+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	
	
	
	
	
	
	
	public static  boolean add_crop_yield_datset(String crop, String d_2008, String d_2009, String d_2010, String d_2011, String d_2012, String d_2013, String d_2014, String d_2015, String d_2016, String d_2017)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_crop_yield(crop_name,d_2008,d_2009,d_2010,d_2011,d_2012,d_2013,d_2014,d_2015,d_2016,d_2017) values('"+crop+"','"+d_2008+"','"+d_2009+"','"+d_2010+"','"+d_2011+"','"+d_2012+"','"+d_2013+"','"+d_2014+"','"+d_2015+"','"+d_2016+"','"+d_2017+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return flag;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static ResultSet getProfile(String username)
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_admin where admin_name='"+username+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
	
	
	
	
	
	
	public static ResultSet getSoil()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_soil_type";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
	
	
	
	
	
	public static int truncateTables()
	{
		int id=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			
			String sql1="truncate table m_process";
			String sql2="truncate table m_sentimate_analysis";
			String sql3="truncate table m_user_venue_frequency";
			
			
			
			int k=statement.executeUpdate(sql1);
			int k1=statement.executeUpdate(sql2);
			int k2=statement.executeUpdate(sql3);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO-->getDataOwnerId(String username): ");
			e.printStackTrace();
		}
		return id;
	}
	
	
	
	
	
	
	
	
	public static ResultSet getuser_list()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_user";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
	
	
	public static ResultSet getAdhar_detailes()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_adhar_record";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static ResultSet Phani_detailes()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_phani_record";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
	public static ResultSet Phani_detailes_spce(String adharid)
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_phani_record  where ad_no='"+adharid+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
	
	
	
	public static ResultSet get_m_vegetables()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_vegetable";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
	
	
	
	public static ResultSet getAdhar_detailes_edit(String id)
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_adhar_record where ad_si_no='"+id+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static ResultSet getPhani_detailes_edit(String id)
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_phani_record where phahni_id='"+id+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean editProfile(String [] s) 
	{
		boolean flag=false;
		String sql = "";
		try
		{   
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "update m_admin set name='"+s[1]+"',address='"+s[2]+"',phone='"+s[3]+"',email='"+s[4]+"' where id='"+s[0]+"'";
			System.out.println("******* Edit Profile Info *********\n");
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Admin Edit Profile Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-editProfile() :");
			e.printStackTrace();
		}
		return flag;
	}
	public boolean chnagePass(int id,String cpass) 
	{
		boolean flag=false;
		String sql = "";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "update m_admin set password='"+cpass+"' where id='"+id+"'";
			System.out.println("******* Change Password Info *********\n");
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Admin Change Pass Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-chnagePass() : ");
			e.printStackTrace();
		}
		return flag;
	}
	
	
/* Get Server Details (Starts) */
	
	
	
	public ResultSet getUsers( )
	{
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user ");
		}
		catch(Exception e)
		{
			System.out.println("Exception in adminDAO-->getUsers(): "+ e);
		}
		return resultSet;
	}
	
	
	
	public String getUser(int id)
	{
		String name="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select u_name from m_user where u_code='"+id+"'");
			while(resultSet.next())
			{
				name=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in adminDAO-->getUser(int id): "+ e);
		}
		
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return name;
	}
	
/* Check User Existence (Starts) */
	
	

	
	public static boolean ChangePass1(String name,String pwd)
	{
		
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			String sql = "update m_admin set password = '"+pwd+"' where admin_name = '"+name+"' ";
			
		 statement.executeUpdate(sql);
			
			
			 
			System.out.println("Password Updated Successfully......");
		}
		catch(Exception e)
		{
			System.out.println("Exception in --> "+ e);
		}
		
		finally {
		    if (resultSet != null) {
		        try {
		        	resultSet.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (statement != null) {
		        try {
		        	statement.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (connection != null) {
		        try {
		        	connection.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		return true;
		
	}
	
	
	



}
