package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.dao.AdminDAO;
import java.sql.ResultSet;
import java.io.PrintWriter;

public final class add_005fadhar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html >\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\">\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <style type=\"text/css\">\r\n");
      out.write("html { height: 100% }\r\n");
      out.write("body { height: 100%; margin: 0; padding: 0 }\r\n");
      out.write("#map_canvas { height: 100% }\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyC6v5-2uaq_wusHDktM9ILcqIrlPtnZgEk&sensor=false\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");

int no=convert(request.getParameter("no"));
if(no==1)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"inavalid user id and password....\")\r\n");
      out.write("</script>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onload=\"initialize();\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");

    
 if(no==2)
    	
{
	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("  <center>\r\n");
      out.write("   \r\n");
      out.write("    <form class=\"login-form\" action=\"");
      out.print(request.getContextPath());
      out.write("/Adhar_Create?myform=Add\"   method=\"post\">\r\n");
      out.write("      <input type=\"text\" name=\"Adhar_No\" placeholder=\"Adhar No\" id=\"Adhar_No\" maxlength=\"12\" onblur=\"check_adhar();\"/><br><br>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("      \r\n");
      out.write("      function check_adhar()\r\n");
      out.write("      {\r\n");
      out.write("    \t  if (document.getElementById('Adhar_No').value.length < 12) {\r\n");
      out.write("    \t\t    alert('please enter at least 12 NOS');\r\n");
      out.write("    \t\t    return false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t  \r\n");
      out.write("      }\r\n");
      out.write("      </script>\r\n");
      out.write("      <input type=\"text\" name=\"Name\" placeholder=\"Name\"/><br><br>\r\n");
      out.write("     \r\n");
      out.write("      <input type=\"text\"   placeholder=\"DOB\"  name=\"DOB\" value=\"\" />\r\n");
      out.write("    <br>\r\n");
      out.write("      <br>\r\n");
      out.write("    \r\n");
      out.write("      <input type=\"text\"    placeholder=\"Address\" name=\"Address\" value=\"\"  /> <br><br>\r\n");
      out.write("      <input type=\"text\"    placeholder=\"contact\" name=\"contact\" value=\"\"  /> <br><br>\r\n");
      out.write("    \r\n");
      out.write(" <button>create</button><br><br>\r\n");
      out.write("<div>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    </form>\r\n");
      out.write(" </center>\r\n");
      out.write("  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/index.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");

    
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
	 

      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <center>\r\n");
      out.write("      <div class=\"login-page\">\r\n");
      out.write("  <div class=\"form\">\r\n");
      out.write("  \r\n");
      out.write("    <form class=\"login-form\" action=\"");
      out.print(request.getContextPath());
      out.write("/EditAdhar?myform=Update\"   method=\"post\">\r\n");
      out.write("     <input type=\"hidden\"  name=\"a_id\" value=\"");
      out.print(list.get(0));
      out.write("\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("     <br>\r\n");
      out.write("      <input type=\"text\" name=\"Adhar_No\" value=\"");
      out.print(list.get(1));
      out.write("\" placeholder=\"Adhar No\"/>\r\n");
      out.write("       <br>\r\n");
      out.write("     <br>\r\n");
      out.write("     \r\n");
      out.write("      <input type=\"text\" name=\"Name\" value=\"");
      out.print(list.get(2));
      out.write("\" placeholder=\"Name\"/>\r\n");
      out.write("       <br>\r\n");
      out.write("     <br>\r\n");
      out.write("     \r\n");
      out.write("      <input type=\"text\"   placeholder=\"DOB\"  name=\"DOB\" value=\"");
      out.print(list.get(5));
      out.write("\" />\r\n");
      out.write("       <br>\r\n");
      out.write("     <br>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("      <input type=\"text\"    placeholder=\"Address\" name=\"Address\" value=\"");
      out.print(list.get(4));
      out.write("\"  /> \r\n");
      out.write("       <br>\r\n");
      out.write("     <br>\r\n");
      out.write("      \r\n");
      out.write("      <input type=\"text\"    placeholder=\"contact\" name=\"contact\" value=\"");
      out.print(list.get(3));
      out.write("\" /> \r\n");
      out.write("       <br>\r\n");
      out.write("     <br>\r\n");
      out.write("    \r\n");
      out.write(" <button>update</button>\r\n");
      out.write("<div>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    </center>\r\n");
      out.write("    \r\n");
      out.write("      ");

    
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
