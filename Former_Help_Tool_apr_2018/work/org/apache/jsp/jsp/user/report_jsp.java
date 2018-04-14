package org.apache.jsp.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import com.dao.AdminDAO;

public final class report_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String adharid=session.getAttribute("adharid").toString();

int no=convert(request.getParameter("no"));

int no1=convert(request.getParameter("no1"));
if(no==1)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"Enter valid Land In Acers\")\r\n");
      out.write("</script>\r\n");

}

if(no==2)
{

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("alert(\"No crops selected...\")\r\n");
      out.write("</script>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");

					

								



      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <form class=\"login-form\" action=\"");
      out.print(request.getContextPath());
      out.write("/Yield_Demand_Calculation\"   method=\"get\">\r\n");
      out.write("\r\n");
      out.write("<div  align=\"right\" style=\"position:absolute;top:50px;left:25px;width: 600px;height: 300px;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("<p>\r\n");
      out.write("\r\n");

if(no1==1)
{

	String grain=session.getAttribute("grain").toString();
	String grain_predicted_yield=session.getAttribute("grain_predicted_yield").toString();
	String total_grain_yield=session.getAttribute("total_grain_yield").toString();
	String grain_predicted_demand=session.getAttribute("grain_predicted_demand").toString();


	
if(Double.parseDouble(total_grain_yield)<Double.parseDouble(grain_predicted_demand))
{

      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">GRAINS REPORT\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write(" </center>\r\n");
      out.write("\t<table border=\"1\"  id=\"results\"  cellpadding=\"5px\" cellspacing=\"1px\" width=\"500px;\" height=\"2px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td colspan=\"10\" align=\"center\">\r\n");
      out.write("\t\t\t<font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">you can grow the ");
      out.print(grain);
      out.write(" \r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(grain);
      out.write(" predicted yield is: ");
      out.print(grain_predicted_yield );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(grain);
      out.write(" total grain yield is:");
      out.print(total_grain_yield );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(grain);
      out.write("  predicted demand is:");
      out.print(grain_predicted_demand );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</table>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<center>\r\n");
      out.write("<font color=\"blue\" >Do You Wish Finalize the Crop ?</font>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/New_Demand_Update?status=yes&product=Grain\">YES</a> OR <a href=\"");
      out.print(request.getContextPath());
      out.write("/New_Demand_Update?status=no\">NO</a>\r\n");
      out.write("</center>\r\n");

}

else
{
	


      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">GRAINS REPORT</font>\r\n");
      out.write("</center>\r\n");
      out.write("<table border=\"1\"  id=\"results\"  cellpadding=\"5px\" cellspacing=\"1px\" width=\"500px;\" height=\"2px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td colspan=\"10\" align=\"center\">\r\n");
      out.write("\t\t\t<td colspan=\"10\" align=\"center\">\r\n");
      out.write("\t\t\t<font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">you should not  grow the ");
      out.print(grain);
      out.write(" Please select other Grain\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(grain);
      out.write(" predicted yield is: ");
      out.print(grain_predicted_yield );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(grain);
      out.write(" total grain yield is:");
      out.print(total_grain_yield );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(grain);
      out.write("  predicted demand is:");
      out.print(grain_predicted_demand );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<center>\r\n");
      out.write("<font color=\"blue\" >You can select the other Crop ?</font>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/crop_yield_selection.jsp\">CLICKHERE</a> \r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t ");

  	 
}
}

  else if(no1==2)
  {

	  String vegetable=session.getAttribute("vegetable").toString();						
	  String vegitable_predicted_yield=session.getAttribute("vegitable_predicted_yield").toString();
	  String total_vegetable_yield=session.getAttribute("total_vegetable_yield").toString();
	  String vegetable_predicted_demand=session.getAttribute("vegetable_predicted_demand").toString();
if(Double.parseDouble(total_vegetable_yield)<Double.parseDouble(vegetable_predicted_demand))
{

      out.write("\r\n");
      out.write(" \r\n");
      out.write(" <br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write(" <center>\r\n");
      out.write(" <font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">VEGETABLE REPORT\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t<table border=\"1\"  id=\"results\"  cellpadding=\"5px\" cellspacing=\"1px\" width=\"500px;\" height=\"2px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td colspan=\"10\" align=\"center\">\r\n");
      out.write("\t\t\t<font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">you can grow the ");
      out.print(vegetable);
      out.write(".\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(vegetable);
      out.write("  predicted yield is: ");
      out.print(vegitable_predicted_yield );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(vegetable);
      out.write("  yield is:");
      out.print(total_vegetable_yield );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(vegetable);
      out.write(" predicted demand is:");
      out.print(vegetable_predicted_demand );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<center>\r\n");
      out.write("<font color=\"blue\" >Do You Wish Finalize the Crop ?</font>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/New_Demand_Update?status=yes&product=vegetable\">YES</a> OR <a href=\"");
      out.print(request.getContextPath());
      out.write("/New_Demand_Update?status=no\">NO</a>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");

}

else
{
	


      out.write("\r\n");
      out.write("<center>\r\n");
      out.write(" <font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">VEGETABLE REPORT\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("<table border=\"1\"  id=\"results\"  cellpadding=\"5px\" cellspacing=\"1px\" width=\"500px;\" height=\"2px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td colspan=\"10\" align=\"center\">\r\n");
      out.write("\t\t<font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">you should not  grow the ");
      out.print(vegetable);
      out.write(" Please select other Vegetable\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(vegetable);
      out.write("  predicted yield is: ");
      out.print(vegitable_predicted_yield );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(vegetable);
      out.write("  yield is:");
      out.print(total_vegetable_yield );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>");
      out.print(vegetable);
      out.write("  demand is:");
      out.print(vegetable_predicted_demand );
      out.write("</b>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<font color=\"blue\" >You can select the other Crop ?</font>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/crop_yield_selection.jsp\">CLICKHERE</a> \r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t ");

  	 
}
  }





if(no1==3)
{
	String phan_id=session.getAttribute("Phani_id").toString();
  	 
      out.write("\r\n");
      out.write("  \t \r\n");
      out.write("  <table border=\"1\"  id=\"results\"  cellpadding=\"5px\" cellspacing=\"1px\" width=\"500px;\" height=\"2px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td colspan=\"10\" align=\"center\">\r\n");
      out.write("\t\t<font color=\"maroon\" style=\"font-style: bold;font-family: monotype corsiva\" size=\"6\">your transaction code is..\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      out.print("TR-NO "+phan_id );
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<center>\r\n");
      out.write("<font color=\"blue\" >You can select the other Crop ?</font>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/jsp/user/crop_yield_selection.jsp\">CLICKHERE</a> \r\n");
      out.write("</center>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  ");

}
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
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
