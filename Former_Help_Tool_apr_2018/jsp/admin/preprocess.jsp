<%@page import="com.admin.PreProcess"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
    <%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.AdminDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript">
function hideMessage()
{
	document.getElementById("message").style.display="none"; 
}
function startTimer() 
{
	var tim = window.setTimeout("hideMessage()", 5000);  // 5000 milliseconds = 5 seconds
}
</script>

<%
boolean flag=false;
ArrayList user_id=new ArrayList();
ArrayList venue_id=new ArrayList();
ArrayList tips=new ArrayList();
ResultSet rs=null;
AdminDAO.truncateTables();
rs=AdminDAO.getM_tips();
while(rs.next())
{
	user_id.add(rs.getInt(2));
	venue_id.add(rs.getInt(3));
	tips.add(rs.getString(4));
	
	flag=PreProcess.process(rs.getInt(2),rs.getInt(3),rs.getString(4));
}
rs.close();


%>

<style>
p 
{
	font-family: monospace;
	font-style: italic;
	font-variant: normal;
	font-weight: bolder;
	font-size: medium;
	line-height: 200%;
	word-spacing: 1.5ex;
	letter-spacing: 0.1ex;
	text-transform: capitalize;
	text-indent: 0ex;
	text-align:center;
	
	
} 
div
{
	border-top-style:dotted;
	border-right-style:solid;
	border-bottom-style:dotted;
	border-left-style:solid;
}
</style>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/button.css" type="text/css"/>
</head>
<% 
if(flag)
{
	%>
	<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:280px">
	<p>pre processing over ...!!</p>
	</div>
	<%
}

else
{
	%>
	<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:280px">
	<p>somthing wrong ...!!</p>
	</div>
	<%
}
%>
<body>



</body>
</html>