<%@page import="com.dao.AdminDAO"%>
<%@ page import="java.sql.*" %>
<html>
<head>
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
int no=convert(request.getParameter("no"));
if(no==1)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:280px">
	<p>Succeefully uploaded Data ...!!</p>
</div>
<%}
if(no==2)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:280px">
	<p>OOP's Old Password is Wrong ...!!</p>
</div>
<%
}
if(no==3)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:280px">
	<p>OOP's Your New Password Does't Match With Confirm ...!!</p>
</div>
<%}%>
<body onload="startTimer()">
<center>
</br>
</br>
</br>
</br>
</br>
<form  action="<%=request.getContextPath()%>/ExcellUpload" enctype="multipart/form-data" method="post">
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a><font style="font-family: Monotype Corsiva; font-size: 35px; color: black">upload District wise Crops Dataset</font></a>
</br>
</br>
</br>
</br>

	<div style="position:absolute;top:250px;left:510px;">	   						

<a><font style="font-family: Monotype Corsiva; font-size: 20px; color: black">upload Crops Data :</font></a> <input type="file" name="reviewfile" value="Choosefile" class="gradientbuttons">
</br>
</br>
<input type="submit"  value="upload" name="checkin" class="gradientbuttons">
</div>

</br>


</form>
</center>
</body>
</html>