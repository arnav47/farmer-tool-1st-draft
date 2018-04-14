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
AdminDAO.truncateFrequent();


ArrayList user_id=new ArrayList();
ArrayList venue_id=new ArrayList();
ResultSet rs=null;
boolean flag=false;

rs=AdminDAO.getVenueId_UserId();
while(rs.next())
{
	user_id.add(rs.getInt(1));
	venue_id.add(rs.getInt(2));
}
rs.close();
for(int i=0;i<user_id.size();i++)
{
	flag=AdminDAO.update_m_freq(user_id.get(i).toString(), venue_id.get(i).toString());
}


		
%>
</head>
<body>

<div  align="right" style="position:absolute;top:50px;left:25px;width: 600px;height: 300px;">
			
<p>

	<table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px">
		
		<tr>
			
			<td colspan="6" align="center">
			<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">Frequent Details</font>
			</td>
									
		</tr>
				
				<tr>
			
			<th><font color="blue" size="" style="font-family: cursive;">User_Id</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Venue_Id</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Freq_No</font></th>
			
		</tr>
							
		<%
		
		if(flag)
		{
			rs=AdminDAO.getm_freq();
			
			
			while(rs.next())
			{
		%>
		


			<tr align="center">
						<td><%=rs.getInt(2)%></td>
						<td><%=rs.getInt(3)%></td>
						<td><%=rs.getInt(4)%></td>
						
			</tr>
<%
		}
    
}
%>
  	 </table>
  	 </p>
   </div>
</body>
</html>