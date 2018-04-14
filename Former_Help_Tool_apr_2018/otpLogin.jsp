<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

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

	<!-- Basics -->
	
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	
	 <link href="css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/animate.css">
  <link href="css/animate.min.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet" />
<script type = "text/javascript">
function hideMessage()
{
	document.getElementById("message").style.display="none"; 
}
function startTimer() 
{
	var tim = window.setTimeout("hideMessage()", 2000);  // 5000 milliseconds = 5 seconds
}
</script>


	<!-- CSS -->
	

	
</head>
	<%
	String otp=request.getParameter("otp");
	int no=convert(request.getParameter("no"));
	if(no==1)
	{
	%>
	<script type="text/javascript">
	alert("inavalid OTP....")
	</script>
	<%
	}
	%>

	
<body>
	
	<!-- Begin Page Content -->
	<div 	style="position: centre;  left: -10px;"	>
<img alt="" src="<%=request.getContextPath()%>/Res/Images/top.png" height="100px" width=100%">
</img>
</div>
	
	
	<div class="slider">
    <div id="about-slider">
      <div id="carousel-slider" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators visible-xs">
          <li data-target="#carousel-slider" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-slider" data-slide-to="1"></li>
          <li data-target="#carousel-slider" data-slide-to="2"></li>
        </ol>

        <div class="carousel-inner">
          <div class="item active">
            <img src="img/slide.jpg" class="img-responsive" alt="">
            <div class="carousel-caption">
              <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.3s">
               <!--  <h2><span>Clean & Modern Design Template</span></h2> -->
              </div>
              <div class="col-md-10 col-md-offset-1">
                <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.6s">
                 <!--  <p>Lorem ipsum dolor sit amet consectetur adipisicing</p> -->
                </div>
              </div>
              <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.9s">
                <form class="form-inline">
                  <div class="form-group">
                    <!-- <button type="livedemo" name="Live Demo" class="btn btn-primary btn-lg" required="required">Live Demo</button> -->
                  </div>
                  <div class="form-group">
                   <!--  <button type="getnow" name="Get Now" class="btn btn-primary btn-lg" required="required">Get Now</button> -->
                  </div>
                </form>
              </div>
            </div>
          </div>
	
	
	
	 <footer>
    <div class="container">
    
    <div id="feature" name="feature">
		<div class="container">
			<div class="row">
				<div class="text-center">
					<h2><font color="#FF0099"size="5">OTP Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></h2>
					
					<form name="loginform" action="<%=request.getContextPath()%>/OtpLogin" method="post">
<center>

<script type="text/javascript">
alert("Your OTP is : <%=otp%>");
</script>
<b>
  Enter OTP&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp<input type="text" name="otpno"></br></br>
<b>


<input style="background-color: #33CCFF;" type="submit" value="LOGIN" onclick="return checkformvalidater()">

</center>
</form>
<a href="<%=request.getContextPath()%>/index.jsp" ><input style="background-color: #33CCFF;" type="button" value="Back" onclick="return checkformvalidater()"></a>
					
			</div>
		</div>
	</div> 
	
	</div>
	
	
		
	</div>
	
	
	<!-- End Page Content -->
	
</body>

</html>
	
	
	
	
	
		
	