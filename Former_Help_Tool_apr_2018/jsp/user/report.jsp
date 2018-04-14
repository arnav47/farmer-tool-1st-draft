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

int no=convert(request.getParameter("no"));

int no1=convert(request.getParameter("no1"));
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

<%
					

								


%>
</head>
<body>



 <form class="login-form" action="<%=request.getContextPath()%>/Yield_Demand_Calculation"   method="get">

<div  align="right" style="position:absolute;top:50px;left:25px;width: 600px;height: 300px;">
			
<p>

<%
if(no1==1)
{

	String grain=session.getAttribute("grain").toString();
	String grain_predicted_yield=session.getAttribute("grain_predicted_yield").toString();
	String total_grain_yield=session.getAttribute("total_grain_yield").toString();
	String grain_predicted_demand=session.getAttribute("grain_predicted_demand").toString();


	
if(Double.parseDouble(total_grain_yield)<Double.parseDouble(grain_predicted_demand))
{
%>
<center>
<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">GRAINS REPORT
			</font>
 </center>
	<table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px;" height="2px">
		
		<tr>
			
			<td colspan="10" align="center">
			<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">you can grow the <%=grain%> 
			</font>
			<br>
			<b><%=grain%> predicted yield is: <%=grain_predicted_yield %></b>
			<br>
			<b><%=grain%> total grain yield is:<%=total_grain_yield %></b>
			<br>
			<b><%=grain%>  predicted demand is:<%=grain_predicted_demand %></b>
			<br>
			
			</td>
									
		</tr>
				
				
</table>
<br><br><br>
<center>
<font color="blue" >Do You Wish Finalize the Crop ?</font>
<a href="<%=request.getContextPath()%>/New_Demand_Update?status=yes&product=Grain">YES</a> OR <a href="<%=request.getContextPath()%>/New_Demand_Update?status=no">NO</a>
</center>
<%
}

else
{
	

%>
<center>
<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">GRAINS REPORT</font>
</center>
<table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px;" height="2px">
		
		<tr>
			
			<td colspan="10" align="center">
			<td colspan="10" align="center">
			<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">you should not  grow the <%=grain%> Please select other Grain
			</font>
			<br>
			<b><%=grain%> predicted yield is: <%=grain_predicted_yield %></b>
			<br>
			<b><%=grain%> total grain yield is:<%=total_grain_yield %></b>
			<br>
			<b><%=grain%>  predicted demand is:<%=grain_predicted_demand %></b>
			<br>
			</td>
									
		</tr>
				
				
</table>

<br><br><br>
<center>
<font color="blue" >You can select the other Crop ?</font>
<a href="<%=request.getContextPath()%>/jsp/user/crop_yield_selection.jsp">CLICKHERE</a> 
</center>


  	 <%
  	 
}
}

  else if(no1==2)
  {

	  String vegetable=session.getAttribute("vegetable").toString();						
	  String vegitable_predicted_yield=session.getAttribute("vegitable_predicted_yield").toString();
	  String total_vegetable_yield=session.getAttribute("total_vegetable_yield").toString();
	  String vegetable_predicted_demand=session.getAttribute("vegetable_predicted_demand").toString();
if(Double.parseDouble(total_vegetable_yield)<Double.parseDouble(vegetable_predicted_demand))
{
%>
 
 <br>
<br>
<br>
 <center>
 <font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">VEGETABLE REPORT
			</font>
			</center>
	<table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px;" height="2px">
		
		<tr>
			
			<td colspan="10" align="center">
			<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">you can grow the <%=vegetable%>.
			</font>
			<br>
			<b><%=vegetable%>  predicted yield is: <%=vegitable_predicted_yield %></b>
			<br>
			<b><%=vegetable%>  yield is:<%=total_vegetable_yield %></b>
			<br>
			<b><%=vegetable%> predicted demand is:<%=vegetable_predicted_demand %></b>
			<br>
			</td>
									
		</tr>
				
				
</table>


<br><br><br>
<center>
<font color="blue" >Do You Wish Finalize the Crop ?</font>
<a href="<%=request.getContextPath()%>/New_Demand_Update?status=yes&product=vegetable">YES</a> OR <a href="<%=request.getContextPath()%>/New_Demand_Update?status=no">NO</a>
</center>

<%
}

else
{
	

%>
<center>
 <font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">VEGETABLE REPORT
			</font>
			</center>
<table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px;" height="2px">
		
		<tr>
			
			<td colspan="10" align="center">
		<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">you should not  grow the <%=vegetable%> Please select other Vegetable
			</font>
			<br>
			<b><%=vegetable%>  predicted yield is: <%=vegitable_predicted_yield %></b>
			<br>
			<b><%=vegetable%>  yield is:<%=total_vegetable_yield %></b>
			<br>
			<b><%=vegetable%>  demand is:<%=vegetable_predicted_demand %></b>
			<br>
			</td>
									
		</tr>
				
				
</table>

<center>
<font color="blue" >You can select the other Crop ?</font>
<a href="<%=request.getContextPath()%>/jsp/user/crop_yield_selection.jsp">CLICKHERE</a> 
</center>



  	 <%
  	 
}
  }





if(no1==3)
{
	String phan_id=session.getAttribute("Phani_id").toString();
  	 %>
  	 
  <table border="1"  id="results"  cellpadding="5px" cellspacing="1px" width="500px;" height="2px">
		
		<tr>
			
			<td colspan="10" align="center">
		<font color="maroon" style="font-style: bold;font-family: monotype corsiva" size="6">your transaction code is..
			</font>
			
			<%="TR-NO "+phan_id %>
			</td>
									
		</tr>
				
				
</table>
<br>
<br>
<br>
<center>
<font color="blue" >You can select the other Crop ?</font>
<a href="<%=request.getContextPath()%>/jsp/user/crop_yield_selection.jsp">CLICKHERE</a> 
</center>
  
  
  <%
}
  %>
  

  
  </div>
</form>




  	   <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>
</body>
</html>