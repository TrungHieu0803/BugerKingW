package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-2.1.3.min.js\"></script>\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//raw.github.com/botmonster/jquery-bootpag/master/lib/jquery.bootpag.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .wrapper{\n");
      out.write("                margin: 60px auto;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                margin-bottom: 1.25em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Specific styling*/\n");
      out.write("            #content{\n");
      out.write("                padding: 15px;\n");
      out.write("                border: solid 1px #eee;\n");
      out.write("                max-width: 660px;\n");
      out.write("                margin: auto;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <h1>jQuery Bootpag Pagination Example</h1>\n");
      out.write("                        <p>Showcaes the jQueyr Bootpag pagination JS library for creating simple, quick JS based pagination.</p>\n");
      out.write("                        <p id=\"pagination-here\"></p>\n");
      out.write("                        <p id=\"content\">Dynamic page content</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $('#pagination-here').bootpag({\n");
      out.write("                total: 23,\n");
      out.write("                page: 1,\n");
      out.write("                maxVisible: 5,\n");
      out.write("                leaps: true,\n");
      out.write("                href: \"#result-page-{{number}}\",\n");
      out.write("            })\n");
      out.write("\n");
      out.write("//page click action\n");
      out.write("            $('#pagination-here').on(\"page\", function (event, num) {\n");
      out.write("                //show / hide content or pull via ajax etc\n");
      out.write("                $(\"#content\").html(\"Page \" + num);\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
