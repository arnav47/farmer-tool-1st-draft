

<!DOCTYPE html>
<html >
 
<head>
<meta charset="UTF-8">
<title>Sign In form</title>
  <!-- <link rel="stylesheet" type="text/css" href="style.css">   -->
   
<!--  <link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'> -->

 <meta name="viewport" content="width=device-width, initial-scale=1">  
  <!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> -->
  <link href="<%=request.getContextPath()%>/css/menu.css" rel="stylesheet" type="text/css" />
   <style type="text/css">

    body 
    {
      background-image:url('bg.jpg');
    
        background-repeat: no-repeat;
    }

</style>

</head>


</head>

<body>

 <div class="navbar-brand" style="position: fixed; top: -15px; left: 290px; ">
           <h1><b>A Profile-Based Big Data Architecture for
Agricultural Context</b></h1>
          </div>
<div class="container">
<nav class="menu animated flipInX">

		<ul class="ul">
      
     <div class ="link">     
      <a class="a" href="<%=request.getContextPath() %>/jsp/admin/Adhardetailes.jsp" target="afrm"><h3>Adhar Details</h3>
				
			</a>
			</div>
			 <div class ="link">   
     <a  class="a" href="<%=request.getContextPath() %>/jsp/admin/userprofile.jsp" target="afrm"><h3>User Details</h3>
     </a>
			</div>
     
      <div class ="link">   
      <a class="a" href="<%=request.getContextPath() %>/jsp/admin/upload0.jsp"  target="afrm"><h3>upload Datasets to hadoop</h3>
      </a>
			</div>
      
       <div class ="link">   
      <a class="a" href="<%=request.getContextPath() %>/jsp/admin/PhaniDetails.jsp" target="afrm">  <h3>Phani Details</h3>
      
      </a>
			</div>
   
     <div class ="link">   
      <a class="a" href="<%=request.getContextPath() %>/jsp/admin/changepass.jsp" target="afrm"><h3>Change Password</h3>
      </a>
			</div>
      
       <div class ="link">    <div class ="link">   
         <a class="a" href="index.jsp"><h3>Logout</h3>
			</div>
               

</ul>
	</nav>
</div>


<div style="position:absolute;top:150px;left:300px;">
	<iframe align="middle"  style="margin-left: 60px;" 
	frameborder="0" scrolling="auto" name="afrm" height="470px" width="850px"></iframe>
</div>


<!-- <div style="position:absolute;top:140px;left:210px;">
<iframe frameborder="0" scrolling="auto" name="afrm" height="470" width="850"></iframe>
</div> -->
</body>
</html>
    
    
    
    
    




















