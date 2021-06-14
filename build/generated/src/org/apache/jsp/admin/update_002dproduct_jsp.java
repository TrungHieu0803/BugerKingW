package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Product</title>\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"../js/admin_main.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/sidebar.jsp", out, false);
      out.write("\n");
      out.write("            <form class=\"form-horizontal\" action=\"/BugerKingW/ProductManager?service=update\" method=\"POST\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <!-- Form Name -->\n");
      out.write("                    <h1 style=\"color: green\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("\n");
      out.write("                <!-- Text input-->\n");
      out.write("                <input name=\"old_pid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"display: none\">\n");
      out.write("                                                       \n");
      out.write("                <!-- Text input-->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"product_name\">Product Name</label>  \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input id=\"product_name\" name=\"pname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Text input-->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"product_price\">Price</label>  \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input id=\"product_price\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Select Basic -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Text input-->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"image\">Image</label>  \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input id=\"Description\" name=\"image\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"product_category\">Category</label>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <select  id=\"product_category\" name=\"product_category\" class=\"form-control\">\n");
      out.write("                            <option value=1 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateID == 1 ? \"selected\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                Buger\n");
      out.write("                            </option>\n");
      out.write("                            <option value=2 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateID == 2 ? \"selected\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                Snack\n");
      out.write("                            </option>\n");
      out.write("                            <option value=3 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateID == 3 ? \"selected\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                Drink\n");
      out.write("                            </option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Textarea -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"product_description\">Description</label>\n");
      out.write("                    <div class=\"col-md-4\">                     \n");
      out.write("                        <textarea class=\"form-control\"  id=\"product_description\" name=\"description\"  rows=\"9\" cols=\"70\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Textarea -->\n");
      out.write("\n");
      out.write("                <div  class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"percentage_discount\">                        \n");
      out.write("                        <button  style=\"text-align: center\" type=\"submit\" class=\"btn btn-success\">Update</button>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
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
