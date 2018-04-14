package org.apache.jsp.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Sign In form</title>\r\n");
      out.write("  <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">   -->\r\n");
      out.write("   \r\n");
      out.write("<!--  <link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  \r\n");
      out.write("  <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/menu.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    body \r\n");
      out.write("    {\r\n");
      out.write("      background-image:url('bg.jpg');\r\n");
      out.write("    size:550px;\r\n");
      out.write("        background-repeat: no-repeat;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"navbar-brand\" style=\"position: fixed; top: -15px; left: 290px; \">\r\n");
      out.write("           <h1><b>A Profile-Based Big Data Architecture for\r\n");
      out.write("Agricultural Context</b></h1>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("<nav class=\"menu animated flipInX\">\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"ul\">\r\n");
      out.write("      \r\n");
      out.write("     <div class =\"link\">  \r\n");
      out.write("         <a class=\"a\" href=\"");
      out.print(request.getContextPath() );
      out.write("/jsp/user/PhaniDetails.jsp\" target=\"afrm\"><h3>LandDetails </h3>  \r\n");
      out.write("        \r\n");
      out.write("        <div class =\"link\">  \r\n");
      out.write("         <a class=\"a\" href=\"");
      out.print(request.getContextPath() );
      out.write("/jsp/user/suggestion.jsp\" target=\"afrm\"><h3>Crop Suggestion</h3>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <div class =\"link\">  \r\n");
      out.write("         <a  class=\"a\" href=\"index.jsp\"><h3>Logout</h3>\r\n");
      out.write("    \r\n");
      out.write("<div style=\"position:absolute;top:-150px;left:300px;\">\r\n");
      out.write("\t<iframe align=\"middle\"  style=\"margin-left: 60px;\" \r\n");
      out.write("\tframeborder=\"0\" scrolling=\"auto\" name=\"afrm\" height=\"470px\" width=\"850px\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
