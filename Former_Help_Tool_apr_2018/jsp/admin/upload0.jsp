<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

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
<body>
<a href="<%=request.getContextPath() %>/jsp/admin/upload.jsp"  target="afrm"><font style="font-family: Monotype Corsiva; font-size: 25px; color: 336BFF">upload Crop Data</font></a>
</br>
</br>
</br>
<a href="<%=request.getContextPath() %>/jsp/admin/upload1.jsp"  target="afrm"><font style="font-family: Monotype Corsiva; font-size: 25px; color:336BFF">upload Crops Demand Data</font></a>
</br>
</br>
</br>
<a href="<%=request.getContextPath() %>/jsp/admin/upload2.jsp"  target="afrm"><font style="font-family: Monotype Corsiva; font-size: 25px; color:336BFF">upload Vegetable Demand Data</font></a>
</br>
</br>
</br>
<a href="<%=request.getContextPath() %>/jsp/admin/upload3.jsp"  target="afrm"><font style="font-family: Monotype Corsiva; font-size: 25px; color:336BFF">upload Crops Yield Data</font></a>
</br>
</br>
</br>
<a href="<%=request.getContextPath() %>/jsp/admin/upload4.jsp"  target="afrm"><font style="font-family: Monotype Corsiva; font-size: 25px; color:336BFF">upload Vegetable Yield Data</font></a>


</body>
</html>