<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.AdminDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>
<html >
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
<head>
  <meta charset="UTF-8">
  
  
  
  
      <link rel="stylesheet" href="<%=request.getContextPath() %>/css/style.css">
      
      
      
      
      
      
      <style type="text/css">
html { height: 100% }
body { height: 100%; margin: 0; padding: 0 }
#map_canvas { height: 100% }
</style>
<script type="text/javascript"
src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC6v5-2uaq_wusHDktM9ILcqIrlPtnZgEk&sensor=false">
</script>

     
  
</head>
<%
int no=convert(request.getParameter("no"));
if(no==1)
{
%>
<script type="text/javascript">
alert("inavalid user id and password....")
</script>
<%
}
%>



<body onload="initialize();">




 <%
    
 if(no==2)
    	
{
	 
%>

  <center>
   
    <form class="login-form" action="<%=request.getContextPath()%>/Adhar_Create?myform=Add"   method="post">
      <input type="text" name="Adhar_No" placeholder="Adhar No" id="Adhar_No" maxlength="12" onblur="check_adhar();"/><br><br>
      <script type="text/javascript">
      
      function check_adhar()
      {
    	  if (document.getElementById('Adhar_No').value.length < 12) {
    		    alert('please enter at least 12 NOS');
    		    return false;
    		}
    	  
      }
      </script>
      <input type="text" name="Name" placeholder="Name"/><br><br>
     
      <input type="text"   placeholder="DOB"  name="DOB" value="" />
    <br>
      <br>
    
      <input type="text"    placeholder="Address" name="Address" value=""  /> <br><br>
      <input type="text"    placeholder="contact" name="contact" value=""  /> <br><br>
    
 <button>create</button><br><br>
<div>
    
     
      </div>
    
    </form>
 </center>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>
    
    
    
    
    
    
    <%
    
}
 if(no==3)
{
	 String id= request.getParameter("ID");
	 
	 System.out.println("==== "+id);
	 ResultSet rs=null;
	 boolean flag=false;
	 rs=AdminDAO.getAdhar_detailes_edit(id);
	 ArrayList list=new ArrayList();
	 while(rs.next())
	 {
		 list.add(rs.getInt(1));
		 list.add(rs.getString(2));
		 list.add(rs.getString(3));
		 list.add(rs.getString(4));
		 list.add(rs.getString(5));
		 list.add(rs.getString(6));
	 }
	 
%>
   
    <center>
      <div class="login-page">
  <div class="form">
  
    <form class="login-form" action="<%=request.getContextPath()%>/EditAdhar?myform=Update"   method="post">
     <input type="hidden"  name="a_id" value="<%=list.get(0)%>"/>
    <br>
     <br>
      <input type="text" name="Adhar_No" value="<%=list.get(1)%>" placeholder="Adhar No"/>
       <br>
     <br>
     
      <input type="text" name="Name" value="<%=list.get(2)%>" placeholder="Name"/>
       <br>
     <br>
     
      <input type="text"   placeholder="DOB"  name="DOB" value="<%=list.get(5)%>" />
       <br>
     <br>
    
     
    
      <input type="text"    placeholder="Address" name="Address" value="<%=list.get(4)%>"  /> 
       <br>
     <br>
      
      <input type="text"    placeholder="contact" name="contact" value="<%=list.get(3)%>" /> 
       <br>
     <br>
    
 <button>update</button>
<div>
    
     
      </div>
    
    </form>
  </div>
</div>
    </center>
    
      <%
    
}
%>

</body>
</html>
