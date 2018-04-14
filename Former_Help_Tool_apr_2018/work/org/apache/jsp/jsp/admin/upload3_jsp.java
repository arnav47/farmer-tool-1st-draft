package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.AdminDAO;
import java.sql.*;

public final class upload3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function hideMessage()\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(\"message\").style.display=\"none\"; \r\n");
      out.write("}\r\n");
      out.write("function startTimer() \r\n");
      out.write("{\r\n");
      out.write("\tvar tim = window.setTimeout(\"hideMessage()\", 5000);  // 5000 milliseconds = 5 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("p \r\n");
      out.write("{\r\n");
      out.write("\tfont-family: monospace;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("\tfont-variant: normal;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("\tfont-size: medium;\r\n");
      out.write("\tline-height: 200%;\r\n");
      out.write("\tword-spacing: 1.5ex;\r\n");
      out.write("\tletter-spacing: 0.1ex;\r\n");
      out.write("\ttext-transform: capitalize;\r\n");
      out.write("\ttext-indent: 0ex;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("} \r\n");
      out.write("div\r\n");
      out.write("{\r\n");
      out.write("\tborder-top-style:dotted;\r\n");
      out.write("\tborder-right-style:solid;\r\n");
      out.write("\tborder-bottom-style:dotted;\r\n");
      out.write("\tborder-left-style:solid;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/button.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

int no=convert(request.getParameter("no"));
if(no==1)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:280px\">\r\n");
      out.write("\t<p>Succeefully uploaded Data ...!!</p>\r\n");
      out.write("</div>\r\n");
}
if(no==2)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:280px\">\r\n");
      out.write("\t<p>OOP's Old Password is Wrong ...!!</p>\r\n");
      out.write("</div>\r\n");

}
if(no==3)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:280px\">\r\n");
      out.write("\t<p>OOP's Your New Password Does't Match With Confirm ...!!</p>\r\n");
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("<center>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("<form  action=\"");
      out.print(request.getContextPath());
      out.write("/ExcellUpload4\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a><font style=\"font-family: Monotype Corsiva; font-size: 35px; color: black\">upload Crops Yield Data</font></a>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<div style=\"position:absolute;top:250px;left:50px;\">\r\n");
      out.write("<a><font style=\"font-family: Monotype Corsiva; font-size: 20px; color: black\">upload Crops  Yield Data :</font></a></br> <input type=\"file\" name=\"reviewfile\" value=\"Choosefile\" class=\"gradientbuttons\">\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\"  value=\"upload\" name=\"tips\" class=\"gradientbuttons\">\r\n");
      out.write("</div>\r\n");
      out.write("</br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
