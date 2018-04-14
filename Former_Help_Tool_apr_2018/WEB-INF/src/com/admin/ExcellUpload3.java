/**
 * 
 */
package com.admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * @author bharath
 *
 */
public class ExcellUpload3 extends HttpServlet
{
public 	static String  exeltips="";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
			{
		boolean flag =false;
		FileItemFactory fileItemFactory = new DiskFileItemFactory();
		ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
		List fileItems = null;
		try {
			fileItems = servletFileUpload.parseRequest(req);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("size is "+fileItems.size());
		FileItem file1 = (FileItem) fileItems.get(0);
		FileItem file2 = (FileItem) fileItems.get(1);

		
		String datssettype1=file1.getString();
		
		String datssetname1=file2.getName();
		
		
		
		
		
		
		
			String fileName="";
			System.out.println("upload checkin data");
			fileName = req.getRealPath("") + "/dataset/"+datssetname1;
			
			exeltips=datssetname1;
			System.out.println("the file name is "+fileName);
			
			 OutputStream outputStream = new FileOutputStream(fileName);
				InputStream inputStream = file2.getInputStream();

				int readBytes = 0;
				byte[] buffer = new byte[10000];
				while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1)
				{
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();
			
 //======================Hadoop Storage starts============================
	            
	           /* try
	    		{
	    		 String filePath =req.getRealPath("") + "/" +"config.properties";

	    			
	    			System.out.println("filepath upload is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+filePath);
	    			FileInputStream fileInputStream = new FileInputStream(new File(
	    					filePath));
	    			Properties properties = new Properties();
	    			properties.load(fileInputStream);

	    			Configuration conf = new Configuration();
	    			conf.addResource(new Path(properties.getProperty("hadoopLoc")));
	    			FileSystem fs = FileSystem.get(conf);
	    			Path pt = new Path(properties.getProperty("hdfsLoc"));

	    			Path src = new Path(req.getRealPath("") + "/dataset/"+datssetname1);
	    			
	    		
	    			fs.copyFromLocalFile(src, pt);
	    			
	    			
	    			
	    		}
	    		catch (Exception e) 
	    		{
	    			resp.sendRedirect("admin404error.jsp");
	    		}
	            */
	            //======================Hadoop Storage ends============================
				
				
			 flag = Excellread.readexcell2(fileName,datssettype1);
		
	
		
			 if(flag)
			 {
				 RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/upload0.jsp?no=1");
					rd.forward(req, resp);
			 }
			 else
			 {
				 RequestDispatcher rd=req.getRequestDispatcher("/jsp/admin/upload0.jsp?no=2");
					rd.forward(req, resp);
			 }
						 
			 
			 
			
					}   
				
			}
		