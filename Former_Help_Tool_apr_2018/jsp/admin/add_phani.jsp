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
  
    <form class="login-form" action="<%=request.getContextPath()%>/Phani_Create?myform=Add"   method="post">
      <input type="text" name="Phani_Id" placeholder="Phani_Id"/>
      <br>
      <br>
    
      <input type="text" name="Adhar_No" id="Adhar_No" placeholder="Adhar_No" maxlength="12" onblur="check_adhar();"/>
      <br>
      <br>
    
     
      <script type="text/javascript">
      
      function check_adhar()
      {
    	  if (document.getElementById('Adhar_No').value.length < 12) {
    		    alert('please enter at least 12 NOS');
    		    return false;
    		}
    	  
      }
      </script>
     
     
      <input type="text"   placeholder="Survey_No"  name="Survey_No" value="" /><br>
      <br>
    
        <input type="text"   placeholder="District"  name="District" value="" />
        <br>
      <br>
    
    <select name="Soil_Type" >
    
    <option value="Alluvial" >Alluvial soils</option>
    <option value="Black">Black soils</option>
    <option value="Red">Red and Yellow soils</option>
    <option value="Laterite">Laterite soils</option>
    <option value="Arid">Arid and desert soils</option>
    <option value="Saline">Saline and alkaline soils</option>
    <option value="Peaty">Peaty and marshy soils</option>
    <option value="Forest">Forest and mountain soils</option>
   
   </select>  
   <br>
      <br>
    
    <input type="text"  placeholder="RAIN FALL" name="RAIN_FALL" /> 
    <br>
      <br>
    
      <input type="text"  placeholder="Total_Land" name="Total_Land" value=""  /> 
      <br>
      <br>
    
    
 <button>create</button>
 
 
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
	 String id= request.getParameter("Phani_Id");
	 
	 System.out.println("==== "+id);
	 ResultSet rs=null;
	 boolean flag=false;
	 rs=AdminDAO.getPhani_detailes_edit(id);
	 ArrayList list=new ArrayList();
	 
	 while(rs.next())
	 {
		 list.add(rs.getInt(1));
		 list.add(rs.getString(2));
		 list.add(rs.getString(3));
		 list.add(rs.getString(4));
		 list.add(rs.getString(5));
		/*  list.add(rs.getString(6)); 
 */		 
		 System.out.println(list);
	 }
	 
%>
   
    <center>
      <div class="login-page">
  <div class="form">
  
    <form class="login-form" action="<%=request.getContextPath()%>/EditPhani?myform=Update"   method="post">
     <%-- <input type="hidden"  name="a_id" value="<%=list.get(0)%>"/> --%>
   
      <input type="text" name="Phani_Id" value="<%=list.get(0)%>" placeholder="Phani_Id"/>
       <br>
      <br>
      <input type="text" name="Adhar_No" value="<%=list.get(1)%>" placeholder="Adhar_No"/>
    <br>
      <br>
      <input type="text"   placeholder="Survey_No"  name="Survey_No" value="<%=list.get(2)%>" />
    
      <br>
      <br>
     
     <%-- <input type="text"   placeholder="Soil_Type"  name="Soil_Type" value="<%=list.get(3)%>" /> --%>
    
     <select name="Soil_Type" >
     
      <option value="Alluvial" >Alluvial soils</option>
    <option value="Black">Black soils</option>
    <option value="Red">Red and Yellow soils</option>
    <option value="Laterite">Laterite soils</option>
    <option value="Arid">Arid and desert soils</option>
    <option value="Saline">Saline and alkaline soils</option>
    <option value="Peaty">Peaty and marshy soils</option>
    <option value="Forest">Forest and mountain soils</option>
     
     
     
     </select>
       <br>
      <br>
      <input type="text"    placeholder="Total_Land" name="Total_Land" value="<%=list.get(4)%>" /> 
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
