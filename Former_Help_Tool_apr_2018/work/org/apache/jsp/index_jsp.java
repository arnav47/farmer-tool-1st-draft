package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
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

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("  <title>Day - HTML Bootstrap Template</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap -->\r\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("  <link href=\"css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("  <!-- =======================================================\r\n");
      out.write("    Theme Name: Day\r\n");
      out.write("    Theme URL: https://bootstrapmade.com/day-multipurpose-html-template-for-free/\r\n");
      out.write("    Author: BootstrapMade\r\n");
      out.write("    Author URL: https://bootstrapmade.com\r\n");
      out.write("  ======================================================= -->\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    function checkvariability()\r\n");
      out.write("    {\r\n");
      out.write("    \tdocument.getElementById(\"feature\").style.display=\"none\";\r\n");
      out.write("    \tdocument.getElementById(\"gallery\").style.display=\"none\";\r\n");
      out.write("    \tdocument.getElementById(\"register\").style.display=\"none\";\r\n");
      out.write("    \t\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    function checkvariabilityy2()\r\n");
      out.write("    {\r\n");
      out.write("    \tdocument.getElementById(\"feature\").style.display=\"none\";\r\n");
      out.write("    \tdocument.getElementById(\"gallery\").style.display=\"\";\r\n");
      out.write("    \r\n");
      out.write("    \tdocument.getElementById(\"register\").style.display=\"none\";\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    function checkvariability1()\r\n");
      out.write("    {\r\n");
      out.write("    \tdocument.getElementById(\"feature\").style.display=\"\";\r\n");
      out.write("    \tdocument.getElementById(\"gallery\").style.display=\"none\";\r\n");
      out.write("    \tdocument.getElementById(\"register\").style.display=\"none\";\r\n");
      out.write("    \t\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    function checkvariability3()\r\n");
      out.write("    {\r\n");
      out.write("    \tdocument.getElementById(\"feature\").style.display=\"none\";\r\n");
      out.write("    \tdocument.getElementById(\"gallery\").style.display=\"none\";\r\n");
      out.write("    \tdocument.getElementById(\"register\").style.display=\"\";\r\n");
      out.write("    \t\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");

int no=convert(request.getParameter("no"));
if(no==1)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"inavalid user id and password....\")\r\n");
      out.write("</script>\r\n");

}

if(no==2)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"User Registred sucessfully....\")\r\n");
      out.write("</script>\r\n");

}

if(no==3)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"User Registred Failure....\")\r\n");
      out.write("</script>\r\n");

}

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <header id=\"header\">\r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-static-top\" role=\"banner\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("           <center>   \r\n");
      out.write("          <div class=\"navbar-brand\" style=\"position: fixed; top: -15px; left: 290px; \">\r\n");
      out.write("            <a href=\"index.html\"><h1><b>A Profile-Based Big Data Architecture for\r\n");
      out.write("Agricultural Context</b></h1></a>\r\n");
      out.write("          </div>\r\n");
      out.write("          </center>    \r\n");
      out.write("        </div>\r\n");
      out.write("        </br></br> </br></br>\r\n");
      out.write("        <div class=\"navbar-collapse collapse\">\r\n");
      out.write("          <div class=\"menu\">\r\n");
      out.write("            <ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("              <li role=\"presentation\"><a href=\"#header\" onclick=\"checkvariability();\" class=\"active\">Home</a></li>\r\n");
      out.write("              <li role=\"presentation\"><a href=\"#feature\" onclick=\"checkvariability1();\" >Admin Login</a></li>\r\n");
      out.write("           \r\n");
      out.write("              <li role=\"presentation\"><a href=\"#gallery\" onclick=\"checkvariabilityy2();\">UserLogin</a></li>\r\n");
      out.write("              \r\n");
      out.write("               <li role=\"presentation\"><a href=\"#register\" onclick=\"checkvariability3();\">User Registration</a></li>\r\n");
      out.write("                           <!--  <li role=\"presentation\"><a href=\"contact.html\">Gallery</a></li>  -->\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--/.container-->\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!--/nav-->\r\n");
      out.write("  </header>\r\n");
      out.write("  <!--/header-->\r\n");
      out.write("\r\n");
      out.write("  <div class=\"slider\">\r\n");
      out.write("    <div id=\"about-slider\">\r\n");
      out.write("      <div id=\"carousel-slider\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("        <!-- Indicators -->\r\n");
      out.write("        <ol class=\"carousel-indicators visible-xs\">\r\n");
      out.write("          <li data-target=\"#carousel-slider\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("          <li data-target=\"#carousel-slider\" data-slide-to=\"1\"></li>\r\n");
      out.write("          <li data-target=\"#carousel-slider\" data-slide-to=\"2\"></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("          <div class=\"item active\">\r\n");
      out.write("            <img src=\"img/slide.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.3s\">\r\n");
      out.write("               <!--  <h2><span>Clean & Modern Design Template</span></h2> -->\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\r\n");
      out.write("                 <!--  <p>Lorem ipsum dolor sit amet consectetur adipisicing</p> -->\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.9s\">\r\n");
      out.write("                <form class=\"form-inline\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <!-- <button type=\"livedemo\" name=\"Live Demo\" class=\"btn btn-primary btn-lg\" required=\"required\">Live Demo</button> -->\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                   <!--  <button type=\"getnow\" name=\"Get Now\" class=\"btn btn-primary btn-lg\" required=\"required\">Get Now</button> -->\r\n");
      out.write("                  </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"item\">\r\n");
      out.write("            <img src=\"img/slide1.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"1.0s\">\r\n");
      out.write("              <!--   <h2>Fully Responsive</h2> -->\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\r\n");
      out.write("                  <!-- <p>Lorem ipsum dolor sit amet consectetur adipisicing</p> -->\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"1.6s\">\r\n");
      out.write("                <form class=\"form-inline\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                  <!--   <button type=\"livedemo\" name=\"purchase\" class=\"btn btn-primary btn-lg\" required=\"required\">Live Demo</button> -->\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <!-- <button type=\"getnow\" name=\"subscribe\" class=\"btn btn-primary btn-lg\" required=\"required\">Get Now</button> -->\r\n");
      out.write("                  </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"item\">\r\n");
      out.write("            <img src=\"img/slide2.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.3s\">\r\n");
      out.write("               <!--  <h2>Modern Design</h2> -->\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.6s\">\r\n");
      out.write("                <!--   <p>Lorem ipsum dolor sit amet consectetur adipisicing</p> -->\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"wow fadeInUp\" data-wow-offset=\"0\" data-wow-delay=\"0.9s\">\r\n");
      out.write("                <form class=\"form-inline\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                   <!--  <button type=\"livedemo\" name=\"purchase\" class=\"btn btn-primary btn-lg\" required=\"required\">Live Demo</button> -->\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                  <!--   <button type=\"getnow\" name=\"subscribe\" class=\"btn btn-primary btn-lg\" required=\"required\">Get Now</button> -->\r\n");
      out.write("                  </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <a class=\"left carousel-control hidden-xs\" href=\"#carousel-slider\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("        <a class=\" right carousel-control hidden-xs\" href=\"#carousel-slider\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--/#carousel-slider-->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--/#about-slider-->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!--/#slider-->\r\n");
      out.write("\r\n");
      out.write("  <footer>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"feature\" name=\"feature\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<h2><font color=\"#FF0099\"size=\"5\">Admin Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></h2>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form name=\"loginform\" action=\"");
      out.print(request.getContextPath());
      out.write("/Login\" method=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("<b>\r\n");
      out.write("  USER ID&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp<input type=\"text\" name=\"adminname\"></br></br>\r\n");
      out.write("<b>\r\n");
      out.write(" PASSWORD&nbsp&nbsp :  <input type=\"password\" name=\"pass\"><br><br></br></b>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<input style=\"background-color: #33CCFF;\" type=\"submit\" value=\"LOGIN\" onclick=\"return checkformvalidater()\">\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"gallery\" name=\"gallery\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<h2><font color=\"#FF0099\"size=\"5\">User Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></h2>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<form name=\"loginform1\" action=\"");
      out.print(request.getContextPath());
      out.write("/ULogin\" method=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("  <b>Adhar No :&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\"name=\"username\" id=\"username\" placeholder=\"Adhar No\" onblur=\"check_adhar1();\"></b><br><br>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("      \r\n");
      out.write("      function check_adhar1()\r\n");
      out.write("      {\r\n");
      out.write("    \t  if (document.getElementById('username').value.length < 12) {\r\n");
      out.write("    \t\t    alert('please enter at least 12 NOS');\r\n");
      out.write("    \t\t    return false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t  \r\n");
      out.write("      }\r\n");
      out.write("      </script>\r\n");
      out.write(" <b>Password : &nbsp;&nbsp;<input type=\"password\" name=\"password\"></b><br><br>\r\n");
      out.write(" \r\n");
      out.write("<input style=\"background-color: #33CCFF;\" type=\"submit\" value=\"LOGIN\" onclick=\"return checkformvalidater()\">\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"register\" name=\"register\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<h2><font color=\"#FF0099\"size=\"5\">User Registration Form&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></h2>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<form class=\"loginform1\" action=\"");
      out.print(request.getContextPath());
      out.write("/Register\" method=\"post\">\r\n");
      out.write("     USER Name&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp <input type=\"text\" placeholder=\"name\" name=\"username\"/>\r\n");
      out.write("     </br></br>\r\n");
      out.write("    PASSWORD&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp    <input type=\"password\" placeholder=\"password\" name=\"pasword\"/>\r\n");
      out.write("      </br></br>\r\n");
      out.write("      ADHAR NO&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp  <input type=\"text\" placeholder=\"Adhar No\" name=\"Adhar\" id=\"Adhar\" onblur=\"check_adhar();\"/>\r\n");
      out.write("      \r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("      \r\n");
      out.write("      function check_adhar()\r\n");
      out.write("      {\r\n");
      out.write("    \t  if (document.getElementById('Adhar').value.length < 12) {\r\n");
      out.write("    \t\t    alert('please enter at least 12 NOS');\r\n");
      out.write("    \t\t    return false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t  \r\n");
      out.write("      }\r\n");
      out.write("      </script>\r\n");
      out.write("      </br></br>\r\n");
      out.write("      ADDRESS&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp  <input type=\"text\" placeholder=\"Address\" name=\"Address\"/>\r\n");
      out.write("      </br></br>\r\n");
      out.write("   <input style=\"background-color: #33CCFF;\" type=\"submit\" value=\"Create\" onclick=\"return checkformvalidater()\">\r\n");
      out.write("      \r\n");
      out.write("    </form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"sub-footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"social-icon\">\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("          <ul class=\"social-network\">\r\n");
      out.write("          \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("        <div class=\"copyright\">\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"credits\">\r\n");
      out.write("           \r\n");
      out.write("          \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("  <script src=\"js/jquery.js\"></script>\r\n");
      out.write("  <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"js/wow.min.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("    wow = new WOW({}).init();\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
