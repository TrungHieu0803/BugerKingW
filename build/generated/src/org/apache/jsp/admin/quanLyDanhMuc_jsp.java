package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quanLyDanhMuc_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"ISO-8859-1\">\r\n");
      out.write("        <title>Quản lý danh mục</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/header.jsp", out, false);
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--            <div class=\"col-md-9 animated bounce\">\r\n");
      out.write("                <h3 class=\"page-header\">Quản lý Danh Mục</h3>\r\n");
      out.write("\r\n");
      out.write("                <button class=\"btn btn-success btnThemDanhMuc\">Thêm mới danh mục</button>\r\n");
      out.write("\r\n");
      out.write("                <hr/>\r\n");
      out.write("                       <ul class=\"breadcrumb\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <span class=\"glyphicon glyphicon-home\">&nbsp;</span>Home</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">Dashboard</a>\r\n");
      out.write("                        </li> \r\n");
      out.write("                      </ul> \r\n");
      out.write("                <table class=\"table table-hover danhMucTable\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Mã danh mục</th>\r\n");
      out.write("                            <th>Tên Danh mục</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"pagination\">\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row col-md-6\">\r\n");
      out.write("                <form class=\"danhMucForm\" id=\"form\">\r\n");
      out.write("\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div class=\"modal fade\" id=\"danhMucModal\" tabindex=\"-1\"\r\n");
      out.write("                             role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("                             aria-hidden=\"true\" data-backdrop=\"static\" data-keyboard=\"false\">\r\n");
      out.write("                            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                                <div class=\"modal-content\">\r\n");
      out.write("                                    <div class=\"modal-header\">\r\n");
      out.write("                                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Tạo mới/Cập nhật danh mục</h5>\r\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("                                                aria-label=\"Close\">\r\n");
      out.write("                                            <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"modal-body\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"id\">ID:</label> <input type=\"text\"\r\n");
      out.write("                                                                               class=\"form-control\" id=\"id\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"name\">Tên danh mục:</label> <input type=\"text\"\r\n");
      out.write("                                                                                           class=\"form-control\" id=\"tenDanhMuc\" placeholder=\"Nhập vào tên danh mục\" required />\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"modal-footer\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("                                                    data-dismiss=\"modal\">Hủy</button>\r\n");
      out.write("                                            <input class=\"btn btn-primary\" id=\"btnSubmit\" type=\"button\"\r\n");
      out.write("                                                   value=\"Xác nhận\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>-->\r\n");
      out.write("        <button type=\"button\" onclick=\"deleteP()\"  class=\"btn btn-danger\">DELETE</button>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script> \r\n");
      out.write("        <script src=\"../js/admin_main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
