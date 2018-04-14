<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.AdminDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
       <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
       
       
       <%! 
public int convert(String str) 
{ 
	int conv=0; 
	if(str==null) 
	{ 
		str="0"; 
	} 
	else if((str.trim()).equals("null")) 
	{ 
		str="0"; 
	} 
	else if(str.equals("")) 
	{ 
		str="0"; 
	} 
	try
	{ 
		conv=Integer.parseInt(str); 
	} 
	catch(Exception e) 
	{ 
	} 
	return conv; 
	} 
%>
<%

ResultSet rs=null;
boolean flag=false;
rs=AdminDAO.Phani_detailes();


	

int no=convert(request.getParameter("no"));
if(no==1)
{
%>
<script type="text/javascript">
alert("Phani Added Sucessfully....")
</script>
<%
}

if(no==2)
{
%>
<script type="text/javascript">
alert("Phani Deleted Sucessfully....")
</script>
<%
}
%>

<%

if(no==4)
{
%>
<script type="text/javascript">
alert("PAHANI Extracted Sucessfully....")
</script>
<%
}

if(no==5)
{
%>
<script type="text/javascript">
alert("PAHANI Extracted Failure....")
</script>
<%
}
%>


</head>
<body>

<div  align="right" style="position:absolute;top:50px;left:25px;width: 600px;height: 300px;">
			
<p>

	<table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px">
		
		<tr>
			
			<td colspan="6" align="center">
			<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">Phani Details</font>
			</td>
									
		</tr>
				
				<tr>
			<th><font color="blue" size="" style="font-family: cursive;">Adhar No</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Survey No</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Total Land</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Soil Type</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Edit</font></th>
			<th><font color="blue" size="" style="font-family: cursive;">Delete</font></th>
			
		</tr>
							
		<%
		
		
			
		while(rs.next())
		{
		%>
		


			<tr align="center">
						<td><%=rs.getString(2)%></td>
						
						<td><%=rs.getString(3)%></td>
						<td><%=rs.getString(5)%></td>
						<td><%=rs.getString(4)%></td>
						<td><a href="<%=request.getContextPath() %>/jsp/admin/add_phani.jsp?no=3&Phani_Id=<%=rs.getInt(1)%>">Edit</a></td>
						<td><a href="<%=request.getContextPath() %>/DeletePhani?Phani_Id=<%=rs.getInt(1)%> onClick="return confirm('Are you sure you want to delete the Adhar?')">Delete</a></td>
			</tr>
<%
		
    
}
%>
  	 </table>
  	 <div class="login-page">
  
  	
  	 <a href="<%=request.getContextPath() %>/jsp/admin/add_phani.jsp?no=2"><button>Add Phani</button></a>
  	 
  	  <a href="<%=request.getContextPath() %>/Extract_Adhar?extract=Extract_Phani"><button>Extract Phani</button></a>
  	
  	 
  	 </div>
  	
  	 
</div>


















  	   <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>
</body>
</html>