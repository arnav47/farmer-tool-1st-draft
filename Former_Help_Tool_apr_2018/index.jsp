<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      

<!DOCTYPE html>
<html lang="en">


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
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
  <title>Day - HTML Bootstrap Template</title>

  <!-- Bootstrap -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/animate.css">
  <link href="css/animate.min.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet" />
  <!-- =======================================================
    Theme Name: Day
    Theme URL: https://bootstrapmade.com/day-multipurpose-html-template-for-free/
    Author: BootstrapMade
    Author URL: https://bootstrapmade.com
  ======================================================= -->
   <script type="text/javascript">
    
    function checkvariability()
    {
    	document.getElementById("feature").style.display="none";
    	document.getElementById("gallery").style.display="none";
    	document.getElementById("register").style.display="none";
    	
    }
   
   
    </script>
    
    
    
    <script type="text/javascript">
    
    function checkvariabilityy2()
    {
    	document.getElementById("feature").style.display="none";
    	document.getElementById("gallery").style.display="";
    
    	document.getElementById("register").style.display="none";
    	
    	
    }
    
    </script>
    
    <script type="text/javascript">
    
    function checkvariability1()
    {
    	document.getElementById("feature").style.display="";
    	document.getElementById("gallery").style.display="none";
    	document.getElementById("register").style.display="none";
    	
    }
   
    </script>
    
     <script type="text/javascript">
    
    function checkvariability3()
    {
    	document.getElementById("feature").style.display="none";
    	document.getElementById("gallery").style.display="none";
    	document.getElementById("register").style.display="";
    	
    }
   
    </script>
    
    
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

if(no==2)
{
%>
<script type="text/javascript">
alert("User Registred sucessfully....")
</script>
<%
}

if(no==3)
{
%>
<script type="text/javascript">
alert("User Registred Failure....")
</script>
<%
}
%>
</head>

<body>
  <header id="header">
    <nav class="navbar navbar-default navbar-static-top" role="banner">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
           <center>   
          <div class="navbar-brand" style="position: fixed; top: -15px; left: 290px; ">
            <a href="index.html"><h1><b>A Profile-Based Big Data Architecture for
Agricultural Context</b></h1></a>
          </div>
          </center>    
        </div>
        </br></br> </br></br>
        <div class="navbar-collapse collapse">
          <div class="menu">
            <ul class="nav nav-tabs" role="tablist">
              <li role="presentation"><a href="#header" onclick="checkvariability();" class="active">Home</a></li>
              <li role="presentation"><a href="#feature" onclick="checkvariability1();" >Admin Login</a></li>
           
              <li role="presentation"><a href="#gallery" onclick="checkvariabilityy2();">UserLogin</a></li>
              
               <li role="presentation"><a href="#register" onclick="checkvariability3();">User Registration</a></li>
                           <!--  <li role="presentation"><a href="contact.html">Gallery</a></li>  -->
            </ul>
          </div>
        </div>
      </div>
      <!--/.container-->
    </nav>
    <!--/nav-->
  </header>
  <!--/header-->

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

          <div class="item">
            <img src="img/slide1.jpg" class="img-responsive" alt="">
            <div class="carousel-caption">
              <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="1.0s">
              <!--   <h2>Fully Responsive</h2> -->
              </div>
              <div class="col-md-10 col-md-offset-1">
                <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.6s">
                  <!-- <p>Lorem ipsum dolor sit amet consectetur adipisicing</p> -->
                </div>
              </div>
              <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="1.6s">
                <form class="form-inline">
                  <div class="form-group">
                  <!--   <button type="livedemo" name="purchase" class="btn btn-primary btn-lg" required="required">Live Demo</button> -->
                  </div>
                  <div class="form-group">
                    <!-- <button type="getnow" name="subscribe" class="btn btn-primary btn-lg" required="required">Get Now</button> -->
                  </div>
                </form>
              </div>
            </div>
          </div>
          <div class="item">
            <img src="img/slide2.jpg" class="img-responsive" alt="">
            <div class="carousel-caption">
              <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.3s">
               <!--  <h2>Modern Design</h2> -->
              </div>
              <div class="col-md-10 col-md-offset-1">
                <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.6s">
                <!--   <p>Lorem ipsum dolor sit amet consectetur adipisicing</p> -->
                </div>
              </div>
              <div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.9s">
                <form class="form-inline">
                  <div class="form-group">
                   <!--  <button type="livedemo" name="purchase" class="btn btn-primary btn-lg" required="required">Live Demo</button> -->
                  </div>
                  <div class="form-group">
                  <!--   <button type="getnow" name="subscribe" class="btn btn-primary btn-lg" required="required">Get Now</button> -->
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>

        <a class="left carousel-control hidden-xs" href="#carousel-slider" data-slide="prev">
					<i class="fa fa-angle-left"></i>
				</a>

        <a class=" right carousel-control hidden-xs" href="#carousel-slider" data-slide="next">
					<i class="fa fa-angle-right"></i>
				</a>
      </div>
      <!--/#carousel-slider-->
    </div>
    <!--/#about-slider-->
  </div>
  <!--/#slider-->

  <footer>
    <div class="container">
    
    <div id="feature" name="feature">
		<div class="container">
			<div class="row">
				<div class="text-center">
					<h2><font color="#FF0099"size="5">Admin Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></h2>
					
					<form name="loginform" action="<%=request.getContextPath()%>/Login" method="post">
<center>
<b>
  USER ID&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp<input type="text" name="adminname"></br></br>
<b>
 PASSWORD&nbsp&nbsp :  <input type="password" name="pass"><br><br></br></b>


<input style="background-color: #33CCFF;" type="submit" value="LOGIN" onclick="return checkformvalidater()">
</center>
</form>
					
			</div>
		</div>
	</div> 
	
	</div>
	
	<div id="gallery" name="gallery">
		<div class="container">
			<div class="row">
				<div class="text-center">
					<h2><font color="#FF0099"size="5">User Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></h2>
					
				<form name="loginform1" action="<%=request.getContextPath()%>/ULogin" method="post">
<center>
  <b>Adhar No :&nbsp;&nbsp;&nbsp;&nbsp; <input type="text"name="username" id="username" placeholder="Adhar No" onblur="check_adhar1();"></b><br><br>
  <script type="text/javascript">
      
      function check_adhar1()
      {
    	  if (document.getElementById('username').value.length < 12) {
    		    alert('please enter at least 12 NOS');
    		    return false;
    		}
    	  
      }
      </script>
 <b>Password : &nbsp;&nbsp;<input type="password" name="password"></b><br><br>
 
<input style="background-color: #33CCFF;" type="submit" value="LOGIN" onclick="return checkformvalidater()">
</center>
</form>
	</div>
		</div>
	</div> 
	</div>
	
	
	
	
	
	
	
	<div id="register" name="register">
		<div class="container">
			<div class="row">
				<div class="text-center">
					<h2><font color="#FF0099"size="5">User Registration Form&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></h2>
					
				<form class="loginform1" action="<%=request.getContextPath()%>/Register" method="post">
     USER Name&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp <input type="text" placeholder="name" name="username"/>
     </br></br>
    PASSWORD&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp    <input type="password" placeholder="password" name="pasword"/>
      </br></br>
      ADHAR NO&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp  <input type="text" placeholder="Adhar No" name="Adhar" id="Adhar" onblur="check_adhar();"/>
      
      <script type="text/javascript">
      
      function check_adhar()
      {
    	  if (document.getElementById('Adhar').value.length < 12) {
    		    alert('please enter at least 12 NOS');
    		    return false;
    		}
    	  
      }
      </script>
      </br></br>
      ADDRESS&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp  <input type="text" placeholder="Address" name="Address"/>
      </br></br>
   <input style="background-color: #33CCFF;" type="submit" value="Create" onclick="return checkformvalidater()">
      
    </form>
	</div>
		</div>
	</div> 
	</div>
	
	
	
     
    </div>
  </footer>

  <div class="sub-footer">
    <div class="container">
      <div class="social-icon">
        <div class="col-md-4">
          <ul class="social-network">
          
          </ul>
        </div>
      </div>

      <div class="col-md-4 col-md-offset-4">
        <div class="copyright">
         
          <div class="credits">
           
          
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <script src="js/jquery.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="js/bootstrap.min.js"></script>
  <script src="js/wow.min.js"></script>
  <script>
    wow = new WOW({}).init();
  </script>
</body>

</html>
