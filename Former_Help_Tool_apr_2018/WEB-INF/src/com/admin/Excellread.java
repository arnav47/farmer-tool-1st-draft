package com.admin;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dao.AdminDAO;



public class Excellread 
{
public static boolean readexcell(String path)
{
	
	ArrayList district=new ArrayList<>();
	ArrayList karif=new ArrayList<>();
	ArrayList rabi=new ArrayList<>();
	ArrayList summer=new ArrayList<>();
	boolean flag=false;
	
	
	
	
	
	try
    {
		Thread.sleep(1000);
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
       // Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
            //For each row, iterate through all the columns
            
            
            //loc_id.add(row.getCell(0));
          
           
            district.add(row.getCell(0));
            karif.add(row.getCell(1));
            rabi.add(row.getCell(2));
            summer.add(row.getCell(3));
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}
            }
            
          
           
   
        
        System.out.println("district   "+district);
        System.out.println("karif   "+karif);

        System.out.println("rabi   "+rabi);
        System.out.println("summer   "+summer);
     
        
        
       
            
        
        
        	
        for(int i=0;i<district.size();i++)
        {
        
        	flag=AdminDAO.addDataDetails(district.get(i).toString(), karif.get(i).toString(),rabi.get(i).toString(),summer.get(i).toString());
        }
        
        
       
     
        district.clear();
        karif.clear();
        rabi.clear();
        summer.clear();
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}











public static boolean readexcell1(String path)
{
	
	ArrayList crops=new ArrayList<>();
	ArrayList d_2008=new ArrayList<>();
	ArrayList d_2009=new ArrayList<>();
	ArrayList d_2010=new ArrayList<>();
	ArrayList d_2011=new ArrayList<>();
	ArrayList d_2012=new ArrayList<>();
	ArrayList d_2013=new ArrayList<>();
	ArrayList d_2014=new ArrayList<>();
	ArrayList d_2015=new ArrayList<>();
	ArrayList d_2016=new ArrayList<>();
	ArrayList d_2017=new ArrayList<>();
	
	boolean flag=false;
	
	
	
	
	
	try
    {
		Thread.sleep(1000);
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
       // Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
            //For each row, iterate through all the columns
            
            
            //loc_id.add(row.getCell(0));
            
        
           
            crops.add(row.getCell(0));
            d_2008.add(row.getCell(1));
            d_2009.add(row.getCell(2));
            d_2010.add(row.getCell(3));
            d_2011.add(row.getCell(4));
            d_2012.add(row.getCell(5));
            d_2013.add(row.getCell(6));
            d_2014.add(row.getCell(7));
            d_2015.add(row.getCell(8));
            d_2016.add(row.getCell(9));
            d_2017.add(row.getCell(10));
           
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}
           
            
            
            	
          
        }
        
        
      
        	for(int i=0;i<crops.size();i++)
            {
            
        		flag=AdminDAO.add_demand_datset(crops.get(i).toString(), d_2008.get(i).toString(),d_2009.get(i).toString(),d_2010.get(i).toString(),d_2011.get(i).toString(),d_2012.get(i).toString(),d_2013.get(i).toString(),d_2014.get(i).toString(),d_2015.get(i).toString(),d_2016.get(i).toString(),d_2017.get(i).toString());
            }
       
        	crops.clear();
        	d_2008.clear();
            d_2009.clear();
            d_2010.clear();
            d_2011.clear();
            d_2012.clear();
            d_2013.clear();
            d_2014.clear();
            d_2015.clear();
            d_2016.clear();
            d_2017.clear();
            
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}




public static boolean readexcell2(String path,String vegname)
{
	
	ArrayList month=new ArrayList<>();
	ArrayList d_2008=new ArrayList<>();
	ArrayList d_2009=new ArrayList<>();
	ArrayList d_2010=new ArrayList<>();
	ArrayList d_2011=new ArrayList<>();
	ArrayList d_2012=new ArrayList<>();
	ArrayList d_2013=new ArrayList<>();
	ArrayList d_2014=new ArrayList<>();
	ArrayList d_2015=new ArrayList<>();
	ArrayList d_2016=new ArrayList<>();
	ArrayList d_2017=new ArrayList<>();
	
	boolean flag=false;
	
	
	
	
	
	try
    {
		Thread.sleep(1000);
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
       // Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
            //For each row, iterate through all the columns
            
            
            //loc_id.add(row.getCell(0));
            
        
           
            month.add(row.getCell(0));
            d_2008.add(row.getCell(1));
            d_2009.add(row.getCell(2));
            d_2010.add(row.getCell(3));
            d_2011.add(row.getCell(4));
            d_2012.add(row.getCell(5));
            d_2013.add(row.getCell(6));
            d_2014.add(row.getCell(7));
            d_2015.add(row.getCell(8));
            d_2016.add(row.getCell(9));
            d_2017.add(row.getCell(10));
           
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}
           
            
            
            	
          
        }
        
        
      
        	for(int i=0;i<month.size();i++)
            {
            
        		flag=AdminDAO.add_vegetable_demand_datset(month.get(i).toString(), d_2008.get(i).toString(),d_2009.get(i).toString(),d_2010.get(i).toString(),d_2011.get(i).toString(),d_2012.get(i).toString(),d_2013.get(i).toString(),d_2014.get(i).toString(),d_2015.get(i).toString(),d_2016.get(i).toString(),d_2017.get(i).toString(),vegname);
            }
       
        	month.clear();
        	d_2008.clear();
            d_2009.clear();
            d_2010.clear();
            d_2011.clear();
            d_2012.clear();
            d_2013.clear();
            d_2014.clear();
            d_2015.clear();
            d_2016.clear();
            d_2017.clear();
            
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}













public static boolean readexcell_yield_veg(String path)
{
	
	ArrayList vegitable=new ArrayList<>();
	ArrayList d_2008=new ArrayList<>();
	ArrayList d_2009=new ArrayList<>();
	ArrayList d_2010=new ArrayList<>();
	ArrayList d_2011=new ArrayList<>();
	ArrayList d_2012=new ArrayList<>();
	ArrayList d_2013=new ArrayList<>();
	ArrayList d_2014=new ArrayList<>();
	ArrayList d_2015=new ArrayList<>();
	ArrayList d_2016=new ArrayList<>();
	ArrayList d_2017=new ArrayList<>();
	
	boolean flag=false;
	
	
	
	
	
	try
    {
		Thread.sleep(1000);
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
       // Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
            //For each row, iterate through all the columns
            
            
            //loc_id.add(row.getCell(0));
            
        
           
            vegitable.add(row.getCell(0));
            d_2008.add(row.getCell(1));
            d_2009.add(row.getCell(2));
            d_2010.add(row.getCell(3));
            d_2011.add(row.getCell(4));
            d_2012.add(row.getCell(5));
            d_2013.add(row.getCell(6));
            d_2014.add(row.getCell(7));
            d_2015.add(row.getCell(8));
            d_2016.add(row.getCell(9));
            d_2017.add(row.getCell(10));
           
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}
           
            
            
            	
          
        }
        
        
      
        	for(int i=0;i<vegitable.size();i++)
            {
            
        		flag=AdminDAO.add_vegetable_yield_datset(vegitable.get(i).toString(), d_2008.get(i).toString(),d_2009.get(i).toString(),d_2010.get(i).toString(),d_2011.get(i).toString(),d_2012.get(i).toString(),d_2013.get(i).toString(),d_2014.get(i).toString(),d_2015.get(i).toString(),d_2016.get(i).toString(),d_2017.get(i).toString());
            }
       
        	vegitable.clear();
        	d_2008.clear();
            d_2009.clear();
            d_2010.clear();
            d_2011.clear();
            d_2012.clear();
            d_2013.clear();
            d_2014.clear();
            d_2015.clear();
            d_2016.clear();
            d_2017.clear();
            
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}





public static boolean readexcell_yield_crop(String path)
{
	
	ArrayList vegitable=new ArrayList<>();
	ArrayList d_2008=new ArrayList<>();
	ArrayList d_2009=new ArrayList<>();
	ArrayList d_2010=new ArrayList<>();
	ArrayList d_2011=new ArrayList<>();
	ArrayList d_2012=new ArrayList<>();
	ArrayList d_2013=new ArrayList<>();
	ArrayList d_2014=new ArrayList<>();
	ArrayList d_2015=new ArrayList<>();
	ArrayList d_2016=new ArrayList<>();
	ArrayList d_2017=new ArrayList<>();
	
	boolean flag=false;
	
	
	
	
	
	try
    {
		Thread.sleep(1000);
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
       // Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
            //For each row, iterate through all the columns
            
            
            //loc_id.add(row.getCell(0));
            
        
           
            vegitable.add(row.getCell(0));
            d_2008.add(row.getCell(1));
            d_2009.add(row.getCell(2));
            d_2010.add(row.getCell(3));
            d_2011.add(row.getCell(4));
            d_2012.add(row.getCell(5));
            d_2013.add(row.getCell(6));
            d_2014.add(row.getCell(7));
            d_2015.add(row.getCell(8));
            d_2016.add(row.getCell(9));
            d_2017.add(row.getCell(10));
           
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}
           
            
            
            	
          
        }
        
        
      
        	for(int i=0;i<vegitable.size();i++)
            {
            
        		flag=AdminDAO.add_crop_yield_datset(vegitable.get(i).toString(), d_2008.get(i).toString(),d_2009.get(i).toString(),d_2010.get(i).toString(),d_2011.get(i).toString(),d_2012.get(i).toString(),d_2013.get(i).toString(),d_2014.get(i).toString(),d_2015.get(i).toString(),d_2016.get(i).toString(),d_2017.get(i).toString());
            }
       
        	vegitable.clear();
        	d_2008.clear();
            d_2009.clear();
            d_2010.clear();
            d_2011.clear();
            d_2012.clear();
            d_2013.clear();
            d_2014.clear();
            d_2015.clear();
            d_2016.clear();
            d_2017.clear();
            
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}







public static boolean extract_adhar(String path)
{
	
	ArrayList ad_no=new ArrayList<>();
	ArrayList name=new ArrayList<>();
	ArrayList contact=new ArrayList<>();
	ArrayList address=new ArrayList<>();
	ArrayList DOB=new ArrayList<>();
	
	boolean flag=false;
	
	
	
	
	
	try
    {
		
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
       // Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
           
        DataFormatter dt=new DataFormatter();
           
            ad_no.add(dt.formatCellValue(row.getCell(0)));
            name.add(dt.formatCellValue(row.getCell(1)));
            contact.add(dt.formatCellValue(row.getCell(2)));
            address.add(dt.formatCellValue(row.getCell(3)));
            DOB.add(dt.formatCellValue(row.getCell(4)));
          
           
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}
           
            
            
            	
          
        }
        
        
      
        	for(int i=0;i<ad_no.size();i++)
            {
            
        		flag=AdminDAO.add_Adhar_Detailes(ad_no.get(i).toString(), name.get(i).toString(),DOB.get(i).toString(),address.get(i).toString(),contact.get(i).toString());
            }
       
        	ad_no.clear();
        	name.clear();
        	DOB.clear();
        	address.clear();
        	contact.clear();
           
            
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}




public static boolean extract_phani(String path)
{
	ArrayList phani_id=new ArrayList<>();
	ArrayList ad_no=new ArrayList<>();
	ArrayList surv_no=new ArrayList<>();
	ArrayList soil_type=new ArrayList<>();
	ArrayList land=new ArrayList<>();
	ArrayList distr=new ArrayList<>();
	ArrayList rainfall=new ArrayList<>();
	boolean flag=false;
	
	
	
	
	
	try
    {
		
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
       // Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
           
        DataFormatter dt=new DataFormatter();
           
        phani_id.add(dt.formatCellValue(row.getCell(0)));
        ad_no.add(dt.formatCellValue(row.getCell(1)));
        surv_no.add(dt.formatCellValue(row.getCell(2)));
        soil_type.add(dt.formatCellValue(row.getCell(3)));
        land.add(dt.formatCellValue(row.getCell(4)));
        distr.add(dt.formatCellValue(row.getCell(5)));
        rainfall.add(dt.formatCellValue(row.getCell(6)));
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}
           
            
            
            	
          
        }
        
        
      
        	for(int i=0;i<ad_no.size();i++)
            {
            
        		flag=AdminDAO.add_Phani_Detailes(phani_id.get(i).toString(), ad_no.get(i).toString(),surv_no.get(i).toString(),soil_type.get(i).toString(),land.get(i).toString(),distr.get(i).toString(),rainfall.get(i).toString());
            }
       
        	phani_id.clear();
        	ad_no.clear();
        	surv_no.clear();
        	soil_type.clear();
        	land.clear();
        	distr.clear();
            
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}




}
