package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class otpLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Basics -->\r\n");
      out.write("\t\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t\r\n");
      out.write("\t <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("  <link href=\"css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type = \"text/javascript\">\r\n");
      out.write("function hideMessage()\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(\"message\").style.display=\"none\"; \r\n");
      out.write("}\r\n");
      out.write("function startTimer() \r\n");
      out.write("{\r\n");
      out.write("\tvar tim = window.setTimeout(\"hideMessage()\", 2000);  // 5000 milliseconds = 5 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- CSS -->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\t");

	String otp=request.getParameter("otp");
	int no=convert(request.getParameter("no"));
	if(no==1)
	{
	
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\talert(\"inavalid OTP....\")\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Begin Page Content -->\r\n");
      out.write("\t<div \tstyle=\"position: centre;  left: -10px;\"\t>\r\n");
      out.write("<img alt=\"\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/Images/top.png\" height=\"100px\" width=100%\">\r\n");
      out.write("</img>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"slider\">\r\n");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t <footer>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"feature\" name=\"feature\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<h2><font color=\"#FF0099\"size=\"5\">OTP Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></h2>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form name=\"loginform\" action=\"");
      out.print(request.getContextPath());
      out.write("/OtpLogin\" method=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"Your OTP is :<b> ");
      out.print(otp);
      out.write("</b>\");\r\n");
      out.write("</script>\r\n");
      out.write("<b>\r\n");
      out.write("  Enter OTP&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  :&nbsp<input type=\"text\" name=\"otpno\"></br></br>\r\n");
      out.write("<b>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<input style=\"background-color: #33CCFF;\" type=\"submit\" value=\"LOGIN\" onclick=\"return checkformvalidater()\">\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\" ><input style=\"background-color: #33CCFF;\" type=\"button\" value=\"Back\" onclick=\"return checkformvalidater()\"></a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- End Page Content -->\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
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
