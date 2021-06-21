package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_002dmanager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"ISO-8859-1\">\r\n");
      out.write("        <title>Quản lý Đơn hàng</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("        <link href=\"../css/admin.css\" rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .form-chiTiet input {\r\n");
      out.write("                border: 0;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/header.jsp", out, false);
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-9 animated bounce\">\r\n");
      out.write("                <h3 class=\"page-header form-inline\">Quản lý Đơn hàng</h3>\r\n");
      out.write("\r\n");
      out.write("                <form class=\"form-inline\" id=\"searchForm\" name=\"searchObject\">\r\n");
      out.write("\r\n");
      out.write("                    <select class=\"form-control\" id=\"trangThai\">\r\n");
      out.write("                        <option value=\"Đang chờ giao\">Đang chờ giao</option>\r\n");
      out.write("                        <option value=\"Đang giao\">Đang giao</option>\r\n");
      out.write("                        <option value=\"Chờ duyệt\">Chờ duyệt</option>\r\n");
      out.write("                        <option value=\"Hoàn thành\">Hoàn thành</option>\r\n");
      out.write("                        <option value=\"Đã bị hủy\">Đã bị hủy</option>\r\n");
      out.write("                        <!-- <option value=\"\">Tất cả</option> -->\r\n");
      out.write("                    </select>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" id=\"fromDate\"\r\n");
      out.write("                               placeholder=\"Từ ngày\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" id=\"toDate\"\r\n");
      out.write("                               placeholder=\"Đến ngày\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    &nbsp;&nbsp; &nbsp;&nbsp;\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" id=\"btnDuyetDonHang\">Duyệt\r\n");
      out.write("                        Đơn</button>\r\n");
      out.write("                    <div class=\"form-group\" style=\"float: right; margin-right: 20px\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"number\" id=\"searchById\"\r\n");
      out.write("                               placeholder=\"Nhập mã để tìm nhanh\"> <span\r\n");
      out.write("                               class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"\r\n");
      out.write("                               style=\"left: -30px; top: 4px\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <hr />\r\n");
      out.write("                <table class=\"table table-hover donHangTable\"\r\n");
      out.write("                       style=\"text-align: center\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Order ID</th>\r\n");
      out.write("                            <th>Date</th>\r\n");
      out.write("                            <th>Status</th>\r\n");
      out.write("                            <th>Total</th>                           \r\n");
      out.write("                            <th>Payment</th>\r\n");
      out.write("                            <th>Detail</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div  id=\"modal-register\" class=\"modal1\"  >\r\n");
      out.write("            <div onclick=\"registerHide()\" id=\"modal_overlay\" class=\"modal_overlay\"></div>\r\n");
      out.write("            <div class=\"modal_body\">\r\n");
      out.write("                <div class=\"modal_inner\">\r\n");
      out.write("                    <table class=\"table table-hover donHangTable\"\r\n");
      out.write("                           style=\"text-align: center\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Order ID</th>\r\n");
      out.write("                                <th>Date</th>\r\n");
      out.write("                                <th>Status</th>\r\n");
      out.write("                                <th>Total</th>                           \r\n");
      out.write("                                <th>Payment</th>\r\n");
      out.write("                                <th>Detail</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("            <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $(function () {\r\n");
      out.write("\r\n");
      out.write("                    if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.trangThai != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(") {\r\n");
      out.write("                        $(\"#trangThai\").val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.trangThai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("                        console.log('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.trangThai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("                    }\r\n");
      out.write("                    ;\r\n");
      out.write("\r\n");
      out.write("                    var from = $(\"#fromDate\").datepicker({\r\n");
      out.write("                        dateFormat: \"dd-mm-yy\",\r\n");
      out.write("                        changeMonth: true\r\n");
      out.write("                    }).on(\"change\", function () {\r\n");
      out.write("                        to.datepicker(\"option\", \"minDate\", getDate(this));\r\n");
      out.write("                    }), to = $(\"#toDate\").datepicker({\r\n");
      out.write("                        dateFormat: \"dd-mm-yy\",\r\n");
      out.write("                        changeMonth: true\r\n");
      out.write("                    }).on(\"change\", function () {\r\n");
      out.write("                        from.datepicker(\"option\", \"maxDate\", getDate(this));\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    function getDate(element) {\r\n");
      out.write("                        var date;\r\n");
      out.write("                        var dateFormat = \"dd-mm-yy\";\r\n");
      out.write("                        try {\r\n");
      out.write("                            date = $.datepicker.parseDate(dateFormat, element.value);\r\n");
      out.write("                        } catch (error) {\r\n");
      out.write("                            date = null;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        return date;\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("o");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listO}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr class=\"rem\"  >\r\n");
          out.write("                            <td id=\"cid\" class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.oid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.status==1?\"Shipped\":\"Processing\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>                           \r\n");
          out.write("                            <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.payid==1?\"COD\":\"Internet Banking\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>   \r\n");
          out.write("                            <td><a style=\"text-decoration: none\">Detail</a></td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("o");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listO}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr class=\"rem\"  >\r\n");
          out.write("                                    <td id=\"cid\" class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.oid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.status==1?\"Shipped\":\"Processing\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>                           \r\n");
          out.write("                                    <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.payid==1?\"COD\":\"Internet Banking\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>   \r\n");
          out.write("                                    <td><a style=\"text-decoration: none\">Detail</a></td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/js/donHangAjax.js");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
