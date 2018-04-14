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
String adharid=session.getAttribute("adharid").toString();
ResultSet rs=null;
boolean flag=false;
rs=AdminDAO.get_m_vegetables();

int no=convert(request.getParameter("no"));
if(no==1)
{
%>
<script type="text/javascript">
alert("Enter valid Land In Acers")
</script>
<%
}

if(no==2)
{
%>
<script type="text/javascript">
alert("No crops selected...")
</script>
<%
}
%>

</head>
<body>



 <form class="login-form" action="<%=request.getContextPath()%>/Yield_Demand_Calculation"   method="get">

<div  align="right" style="position:absolute;top:50px;left:25px;width: 600px;height: 300px;">
			
	<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">suitable crops and vegetable 
			your land specification are select the Grains OR Vegetable..
			</font>		
			<br>
			<br>
			<center>
			<b>IF You Want to Grow Vegetable </b><a href="<%=request.getContextPath() %>/jsp/user/vegetable.jsp" target="afrm">CLICK HERE</a><br>
			<br>
			<br>
			<b>IF You Want to Grow GRAINS  </b><a href="<%=request.getContextPath() %>/jsp/user/grains.jsp" target="afrm">CLICK HERE</a><br>
			
<p></center>
 
	
  
  
  </div>
</form>




  	   <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>
</body>
</html>