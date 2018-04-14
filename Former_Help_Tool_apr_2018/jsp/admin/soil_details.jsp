<%@page import="com.admin.Sentiment_process"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.AdminDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%
ArrayList Soil_Name=new ArrayList();

ResultSet rs=null;
boolean flag=false;

%>
</head>
<body>

<div  align="right" style="position:absolute;top:50px;left:25px;width: 600px;height: 300px;">
			
<p>

	<table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px">
		
		<tr>
			
			<td colspan="6" align="center">
			<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">Soil Details</font>
			</td>
									
		</tr>
				
				<tr>
			
			
			<th><font color="blue" size="" style="font-family: cursive;">Soil Name</font></th>
			
			
			
		</tr>
							
		<%
		
		
			rs=AdminDAO.getSoil();
			
			
			while(rs.next())
			{
		%>
		


			<tr align="center">
						<td><%=rs.getString(2)%></td>
						
						
			</tr>
<%
		}
    

%>
  	 </table>
  	 </p>
   </div>
</body>
</html>