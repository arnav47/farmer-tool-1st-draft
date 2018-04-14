package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.dao.AdminDAO;
import java.sql.ResultSet;
import java.io.PrintWriter;

public final class add_005fphani_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <center>\r\n");
      out.write("  \r\n");
      out.write("    <form class=\"login-form\" action=\"");
      out.print(request.getContextPath());
      out.write("/Phani_Create?myform=Add\"   method=\"post\">\r\n");
      out.write("      <input type=\"text\" name=\"Phani_Id\" placeholder=\"Phani_Id\"/>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("    \r\n");
      out.write("      <input type=\"text\" name=\"Adhar_No\" id=\"Adhar_No\" placeholder=\"Adhar_No\" maxlength=\"12\" onblur=\"check_adhar();\"/>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
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
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("      <input type=\"text\"   placeholder=\"Survey_No\"  name=\"Survey_No\" value=\"\" /><br>\r\n");
      out.write("      <br>\r\n");
      out.write("    \r\n");
      out.write("        <input type=\"text\"   placeholder=\"District\"  name=\"District\" value=\"\" />\r\n");
      out.write("        <br>\r\n");
      out.write("      <br>\r\n");
      out.write("    \r\n");
      out.write("    <select name=\"Soil_Type\" >\r\n");
      out.write("    \r\n");
      out.write("    <option value=\"Alluvial\" >Alluvial soils</option>\r\n");
      out.write("    <option value=\"Black\">Black soils</option>\r\n");
      out.write("    <option value=\"Red\">Red and Yellow soils</option>\r\n");
      out.write("    <option value=\"Laterite\">Laterite soils</option>\r\n");
      out.write("    <option value=\"Arid\">Arid and desert soils</option>\r\n");
      out.write("    <option value=\"Saline\">Saline and alkaline soils</option>\r\n");
      out.write("    <option value=\"Peaty\">Peaty and marshy soils</option>\r\n");
      out.write("    <option value=\"Forest\">Forest and mountain soils</option>\r\n");
      out.write("   \r\n");
      out.write("   </select>  \r\n");
      out.write("   <br>\r\n");
      out.write("      <br>\r\n");
      out.write("    \r\n");
      out.write("    <input type=\"text\"  placeholder=\"RAIN FALL\" name=\"RAIN_FALL\" /> \r\n");
      out.write("    <br>\r\n");
      out.write("      <br>\r\n");
      out.write("    \r\n");
      out.write("      <input type=\"text\"  placeholder=\"Total_Land\" name=\"Total_Land\" value=\"\"  /> \r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" <button>create</button>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<div>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    </form>\r\n");
      out.write("    </center>\r\n");
      out.write("  \r\n");
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
	 

      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <center>\r\n");
      out.write("      <div class=\"login-page\">\r\n");
      out.write("  <div class=\"form\">\r\n");
      out.write("  \r\n");
      out.write("    <form class=\"login-form\" action=\"");
      out.print(request.getContextPath());
      out.write("/EditPhani?myform=Update\"   method=\"post\">\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("      <input type=\"text\" name=\"Phani_Id\" value=\"");
      out.print(list.get(0));
      out.write("\" placeholder=\"Phani_Id\"/>\r\n");
      out.write("       <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <input type=\"text\" name=\"Adhar_No\" value=\"");
      out.print(list.get(1));
      out.write("\" placeholder=\"Adhar_No\"/>\r\n");
      out.write("    <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <input type=\"text\"   placeholder=\"Survey_No\"  name=\"Survey_No\" value=\"");
      out.print(list.get(2));
      out.write("\" />\r\n");
      out.write("    \r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("     \r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("     <select name=\"Soil_Type\" >\r\n");
      out.write("     \r\n");
      out.write("      <option value=\"Alluvial\" >Alluvial soils</option>\r\n");
      out.write("    <option value=\"Black\">Black soils</option>\r\n");
      out.write("    <option value=\"Red\">Red and Yellow soils</option>\r\n");
      out.write("    <option value=\"Laterite\">Laterite soils</option>\r\n");
      out.write("    <option value=\"Arid\">Arid and desert soils</option>\r\n");
      out.write("    <option value=\"Saline\">Saline and alkaline soils</option>\r\n");
      out.write("    <option value=\"Peaty\">Peaty and marshy soils</option>\r\n");
      out.write("    <option value=\"Forest\">Forest and mountain soils</option>\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("     </select>\r\n");
      out.write("       <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <input type=\"text\"    placeholder=\"Total_Land\" name=\"Total_Land\" value=\"");
      out.print(list.get(4));
      out.write("\" /> \r\n");
      out.write("     <br>\r\n");
      out.write("      <br>\r\n");
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
