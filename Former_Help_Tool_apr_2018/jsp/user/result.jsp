<%@page import="com.dao.UserDAO"%>
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
ResultSet rs=null;
HttpSession ses=null;
ses=request.getSession();
ArrayList<Integer> venue_list=(ArrayList<Integer>)ses.getAttribute("venue_list");
double user_dist=Double.parseDouble(ses.getAttribute("userdist").toString());
%>
</head>
<body>

<div  align="right" style="position:absolute;top:50px;left:25px;width: 600px;height: 300px;">
			
<p>

	<table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px">
		
		<tr>
			
			<td colspan="6" align="center">
			<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">Recomanded Venue Details</font>
			</td>
									
		</tr>
				
				<tr>
			
			<th><font color="blue" size="" style="font-family: cursive;">Rank</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Venue_Name</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Venue_Location</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Tags</font></th>
			
			
			
		</tr>
							
		<%
		
		for(int i=0;i<venue_list.size();i++)	
		{
		
		
			rs=UserDAO.get_m_venue(venue_list.get(i));
			
			
			while(rs.next())
			{
				
				if(venue_list.get(i)==rs.getInt(1))
				{
					
					if(rs.getDouble(9)<=user_dist)
					{
					
					
		%>
		


			<tr align="center">
			
						<td><%=i+1%></td>
						<td><%=rs.getString(2)%></td>
						<td><%=rs.getString(5)%></td>
						<td><%=rs.getString(6)%></td>
							
						
			</tr>
<%
				}
				}
			}
}
%>
  	 </table>
  	 </p>
   </div>
</body>
</html>