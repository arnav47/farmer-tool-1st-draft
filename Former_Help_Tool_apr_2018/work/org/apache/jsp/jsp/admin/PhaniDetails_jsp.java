package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import com.dao.AdminDAO;

public final class PhaniDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("       <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\">\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       ");
      out.write('\r');
      out.write('\n');


ResultSet rs=null;
boolean flag=false;
rs=AdminDAO.Phani_detailes();


	

int no=convert(request.getParameter("no"));
if(no==1)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"Phani Added Sucessfully....\")\r\n");
      out.write("</script>\r\n");

}

if(no==2)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"Phani Deleted Sucessfully....\")\r\n");
      out.write("</script>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");


if(no==4)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"PAHANI Extracted Sucessfully....\")\r\n");
      out.write("</script>\r\n");

}

if(no==5)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"PAHANI Extracted Failure....\")\r\n");
      out.write("</script>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div  align=\"right\" style=\"position:absolute;top:50px;left:25px;width: 600px;height: 300px;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("<p>\r\n");
      out.write("\r\n");
      out.write("\t<table border=\"1\"  id=\"results\"  cellpadding=\"5px\" cellspacing=\"1px\" width=\"500px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td colspan=\"6\" align=\"center\">\r\n");
      out.write("\t\t\t<font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">Phani Details</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<th><font color=\"blue\" size=\"\" style=\"font-family: cursive;\">Adhar No</font></th>\r\n");
      out.write("\t\t\t<th><font color=\"blue\" size=\"\" style=\"font-family: cursive;\">Survey No</font></th>\r\n");
      out.write("\t\t\t<th><font color=\"blue\" size=\"\" style=\"font-family: cursive;\">Total Land</font></th>\r\n");
      out.write("\t\t\t<th><font color=\"blue\" size=\"\" style=\"font-family: cursive;\">Soil Type</font></th>\r\n");
      out.write("\t\t\t<th><font color=\"blue\" size=\"\" style=\"font-family: cursive;\">Edit</font></th>\r\n");
      out.write("\t\t\t<th><font color=\"blue\" size=\"\" style=\"font-family: cursive;\">Delete</font></th>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t");

		
		
			
		while(rs.next())
		{
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"");
      out.print(request.getContextPath() );
      out.write("/jsp/admin/add_phani.jsp?no=3&Phani_Id=");
      out.print(rs.getInt(1));
      out.write("\">Edit</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"");
      out.print(request.getContextPath() );
      out.write("/DeletePhani?Phani_Id=");
      out.print(rs.getInt(1));
      out.write(" onClick=\"return confirm('Are you sure you want to delete the Adhar?')\">Delete</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");

		
    
}

      out.write("\r\n");
      out.write("  \t </table>\r\n");
      out.write("  \t <div class=\"login-page\">\r\n");
      out.write("  \r\n");
      out.write("  \t\r\n");
      out.write("  \t <a href=\"");
      out.print(request.getContextPath() );
      out.write("/jsp/admin/add_phani.jsp?no=2\"><button>Add Phani</button></a>\r\n");
      out.write("  \t \r\n");
      out.write("  \t  <a href=\"");
      out.print(request.getContextPath() );
      out.write("/Extract_Adhar?extract=Extract_Phani\"><button>Extract Phani</button></a>\r\n");
      out.write("  \t\r\n");
      out.write("  \t \r\n");
      out.write("  \t </div>\r\n");
      out.write("  \t\r\n");
      out.write("  \t \r\n");
      out.write("</div>\r\n");
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
      out.write("  \t   <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/index.js\"></script>\r\n");
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
