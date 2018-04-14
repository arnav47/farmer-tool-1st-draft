/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author bharath
 *
 */
public class UserDAO
{
	
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static UserDAO UserDAO=null;
	public UserDAO()
	{
		
	}
	public static UserDAO getInstance()
	{
		if(UserDAO == null)
		{
			UserDAO= new UserDAO();
		}
		return UserDAO;
	}
	public static  boolean register_user(String name,String password,String email,String adhar,String address)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_user(user_name,password,email,address_ad,adhar_id) values('"+name+"','"+password+"','"+email+"','"+address+"','"+adhar+"')";
			
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
		return flag;
		
	}
	
	
	
	public static  boolean update_m_user_OTP(String adhid,String otp)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "update  m_user set otp='"+otp+"' where adhar_id='"+adhid+"'";
			
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
		return flag;
		
	}
	
	
	
	
	public static boolean checkUser(String usename,String pass)
	{
		boolean flag=false;
		
		try
		{
			DAO dao=DAO.getInstance();
			
			connection=dao.connector();
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where adhar_id='"+usename+"' and password='"+pass+"'");
			
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
	/**
	 * @param keyword
	 * @return 
	 */
	
	/**
	 * @param int1
	 */
	
	
	
	
	
	
	
	
	public static boolean checkUser_OTP(String adharid,String otp)
	{
		boolean flag=false;
		
		try
		{
			DAO dao=DAO.getInstance();
			
			connection=dao.connector();
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user where adhar_id='"+adharid+"' and otp='"+otp+"'");
			
			System.out.println("select * from m_user where adhar_id='"+adharid+"' and otp='"+otp+"'");
			
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
	/**
	 * @param keyword
	 * @return 
	 */
	
	/**
	 * @param int1
	 */
	
	
	
	
	
	
	
public static String get_crops_details(String sql) {
		
		String crop="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			//sql="select * from m_venue where venue_id='"+venue_id+"'";
			
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				crop=resultSet.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return crop;	
	
	}
	





public static String get_Phani_total_land_district(String phaniid) {
	
	String crop="";
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select * from m_phani_record where phahni_id='"+phaniid+"'";
		
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			crop=resultSet.getString(5)+"_"+resultSet.getString(6)+"_"+resultSet.getString(8);
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return crop;	

}


public static ArrayList get_crop_yield(String grain) {
	
	String crop="";
	ArrayList<Double> list=new ArrayList<Double>();
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select * from m_crop_yield where crop_name='"+grain+"'";
		
	System.out.println(sql);
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			list.add(Double.parseDouble(resultSet.getString(3).trim()));
			list.add(Double.parseDouble(resultSet.getString(4).trim()));
			list.add(Double.parseDouble(resultSet.getString(5).trim()));
			list.add(Double.parseDouble(resultSet.getString(6).trim()));
			list.add(Double.parseDouble(resultSet.getString(7).trim()));
			list.add(Double.parseDouble(resultSet.getString(8).trim()));
			list.add(Double.parseDouble(resultSet.getString(9).trim()));
			list.add(Double.parseDouble(resultSet.getString(10).trim()));
			list.add(Double.parseDouble(resultSet.getString(11).trim()));
			list.add(Double.parseDouble(resultSet.getString(12).trim()));
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return list;	

}






public static ArrayList get_crop_demand(String grain) {
	
	String crop="";
	ArrayList<Double> list=new ArrayList<Double>();
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select * from m_crop_demand where crop_name='"+grain+"'";
		
	System.out.println(sql);
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			list.add(Double.parseDouble(resultSet.getString(3).trim()));
			list.add(Double.parseDouble(resultSet.getString(4).trim()));
			list.add(Double.parseDouble(resultSet.getString(5).trim()));
			list.add(Double.parseDouble(resultSet.getString(6).trim()));
			list.add(Double.parseDouble(resultSet.getString(7).trim()));
			list.add(Double.parseDouble(resultSet.getString(8).trim()));
			list.add(Double.parseDouble(resultSet.getString(9).trim()));
			list.add(Double.parseDouble(resultSet.getString(10).trim()));
			list.add(Double.parseDouble(resultSet.getString(11).trim()));
			list.add(Double.parseDouble(resultSet.getString(12).trim()));
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return list;	

}







public static ArrayList get_vegetable_yield(String vegetable) {
	
	String crop="";
	ArrayList<Double> list=new ArrayList<Double>();
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select * from m_vegitable_yield where veg_name='"+vegetable+"'";
		
	System.out.println(sql);
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			list.add(Double.parseDouble(resultSet.getString(3).trim()));
			list.add(Double.parseDouble(resultSet.getString(4).trim()));
			list.add(Double.parseDouble(resultSet.getString(5).trim()));
			list.add(Double.parseDouble(resultSet.getString(6).trim()));
			list.add(Double.parseDouble(resultSet.getString(7).trim()));
			list.add(Double.parseDouble(resultSet.getString(8).trim()));
			list.add(Double.parseDouble(resultSet.getString(9).trim()));
			list.add(Double.parseDouble(resultSet.getString(10).trim()));
			list.add(Double.parseDouble(resultSet.getString(11).trim()));
			list.add(Double.parseDouble(resultSet.getString(12).trim()));
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return list;	

}







public static String get_m_vegetable_name(String id)
{
	String sql="";
	String vegname="";
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="select vegetable_name from m_vegetable where vegetable_id='"+id+"'";
		System.out.println(sql);
		resultSet = statement.executeQuery(sql);
		
		while(resultSet.next())
		{
			vegname=resultSet.getString(1);
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return vegname;
}








public static ArrayList get_vegetable_demand(String vegid,String month) {
	
	String crop="";
	ArrayList<Double> list=new ArrayList<Double>();
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select * from m_vegitable_demand where veg_name_id='"+vegid+"' and month='"+month+"'";
		
	System.out.println(sql);
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			
			list.add(Double.parseDouble(resultSet.getString(4).trim()));
			list.add(Double.parseDouble(resultSet.getString(5).trim()));
			list.add(Double.parseDouble(resultSet.getString(6).trim()));
			list.add(Double.parseDouble(resultSet.getString(7).trim()));
			list.add(Double.parseDouble(resultSet.getString(8).trim()));
			list.add(Double.parseDouble(resultSet.getString(9).trim()));
			list.add(Double.parseDouble(resultSet.getString(10).trim()));
			list.add(Double.parseDouble(resultSet.getString(11).trim()));
			list.add(Double.parseDouble(resultSet.getString(12).trim()));
			list.add(Double.parseDouble(resultSet.getString(13).trim()));
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return list;	

}





public static  boolean update_Grain_demand_status(String status,String cropname,String newdemand)
{
	boolean flag=false;
	String sql = "";
	int i=0;
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql = "update m_crop_demand set status='"+status+"',new_demand='"+newdemand+"' where crop_name='"+cropname+"'";
		
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
	return flag;
	
}



public static  boolean update_vegetable_demand_status(String status,String cropname,String newdemand,String vegetable_month)
{
	boolean flag=false;
	String sql = "";
	int i=0;
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql = "update m_vegitable_demand set status='"+status+"',new_demand='"+newdemand+"' where veg_name_id='"+cropname+"' and month='"+vegetable_month+"'";
		
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
	return flag;
	
}



public static  boolean update_land_remain(String phahni_id,String noland)
{
	boolean flag=false;
	String sql = "";
	int i=0;
	try
	{ 
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql = "update m_phani_record set land_remain=land_remain-"+Integer.parseInt(noland)+" where phahni_id='"+phahni_id+"'";
		
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
	return flag;
	
}


public static ArrayList get_vegetable_demand_status_new_demand(String vegid,String month) {
	
	String crop="";
	ArrayList list=new ArrayList();
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select * from m_vegitable_demand where veg_name_id='"+vegid+"' and month='"+month+"'";
		
	System.out.println(sql);
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			
			list.add(resultSet.getString(14).trim());
			list.add(resultSet.getString(15).trim());
			
		}
		
		System.out.println(list);
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return list;	

}



public static ArrayList get_grain_demand_status_new_demand(String grain) {
	
	String crop="";
	ArrayList list=new ArrayList();
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select * from m_crop_demand where crop_name='"+grain+"'";
		
	System.out.println(sql);
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			
			list.add(resultSet.getString(13).trim());
			list.add(resultSet.getString(14).trim());
			
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return list;	

}



public static int get_vegetable_harvesting_time(String vegetable) {
	
	int crop=0;
	ArrayList<Double> list=new ArrayList<Double>();
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select harvestingmonth from m_vegetable where vegetable_id='"+vegetable+"'";
		
	System.out.println(sql);
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			crop=resultSet.getInt(1);
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return crop;	

}


public static int get_remain_total_land(String Phani_id) {
	
	int crop=0;
	ArrayList<Double> list=new ArrayList<Double>();
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		
		
	String sql="select land_remain from m_phani_record  where phahni_id='"+Phani_id+"'";
		
	System.out.println(sql);
		
		resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			crop=resultSet.getInt(1);
		}
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return crop;	

}




}
