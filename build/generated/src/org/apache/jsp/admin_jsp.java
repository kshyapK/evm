package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("        <html>\n");
      out.write("            <head>\n");
      out.write("              <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("              <link rel=\"stylesheet\" type=\"text/css\" href=\"cssstylesheet.css\">\n");
      out.write("              <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("              <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("              <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("              <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("              <link href=\"https://fonts.googleapis.com/css?family=Comfortaa|Gudea:700|Poiret+One\" rel=\"stylesheet\">\n");
      out.write("              <link rel=\"stylesheet\" href=\"css/adminStyle.css\" type=\"text/css\">\n");
      out.write("               <title>Administrator</title></head>\n");
      out.write("              <body>\n");
      out.write("               <div class=\"container-fluid\">\n");
      out.write("                 <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12\" style=\"height: 60px;background-color:#C0C0C0\">\n");
      out.write("               <h3>Dream Event</h3>\n");
      out.write("               </div></div>\n");
      out.write("               <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\" style=\"height:550px;background-color:gray\">\n");
      out.write("               <div class=\"row\" id=\"list\" style=\"background-color: aqua;height: 50px;padding: 12px;text-align: center\">\n");
      out.write("               <a href=\"SubscriberListServlet\">Subscribers</a>\n");
      out.write("           </div>\n");
      out.write("        <div class=\"row\" id=\"list\" style=\"background-color: aqua;height: 50px;padding: 12px;text-align: center;margin-top: 1px\">\n");
      out.write("                <a href=\"EnquiryListServlet\">Enquiries</a>\n");
      out.write("         </div>\n");
      out.write("                </div>\n");
      out.write("               <div class=\"col-md-10\" style=\"height:550px;background-color:white\" id=\"content\">\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("              <script>\n");
      out.write("                $(function() {\n");
      out.write("              $(\"#list >  a\").on(\"click\",function(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("              $(\"#content\").load(this.href); });});\n");
      out.write("               </script>\n");
      out.write("               </body>\n");
      out.write("               </html>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   \n");
      out.write("    \n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
