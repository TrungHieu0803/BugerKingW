package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dmanager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>Quản lý sản phẩm</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .modal-open {\r\n");
      out.write("                overflow: scroll;\r\n");
      out.write("            }\r\n");
      out.write("            .image{\r\n");
      out.write("                height: 200px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/admin.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                <h3 class=\"page-header\">Quản lý Sản Phẩm</h3>\r\n");
      out.write("                <h4 class=\"mb-sm-4 mb-3\">\r\n");
      out.write("                    <button  type=\"button\" onclick=\"location.href = 'admin/add-product.jsp'\" class=\"btn btn-success\">Thêm Sản Phẩm</button>\r\n");
      out.write("                </h4>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table table-hover sanPhamTable \"\r\n");
      out.write("                       style=\"text-align: center;\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th >ID</th>\r\n");
      out.write("                            <th>Name</th>\r\n");
      out.write("                            <th>Image</th>\r\n");
      out.write("                            <th>Price</th>\r\n");
      out.write("                            <th>Update/Delete</th>\r\n");
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
      out.write("            <ul class=\"pagination\">\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script> \r\n");
      out.write("        <!--        <script src=\"../js/admin_main.js\"></script>-->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("                                        function deleteProduct(pid, btn) {\r\n");
      out.write("                                            var r = confirm(\"Do you want delete this product?\");\r\n");
      out.write("                                            if (r === true) {\r\n");
      out.write("                                                btn.parentElement.parentElement.style.display = \"none\";\r\n");
      out.write("                                                jQuery.ajax({\r\n");
      out.write("                                                    url: \"/BugerKingW/ProductManager\",\r\n");
      out.write("                                                    type: \"GET\",\r\n");
      out.write("                                                    data: {pid: pid,\r\n");
      out.write("                                                        service: \"delete\"},\r\n");
      out.write("                                                    success: function () {\r\n");
      out.write("                                                        console.log(\"deleted\");\r\n");
      out.write("                                                    }, error: function () {\r\n");
      out.write("\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("                                        }\r\n");
      out.write("                                        function changeStatus(pid, value) {\r\n");
      out.write("                                            console.log($(value).val());\r\n");
      out.write("                                            if($(value).val()===1){\r\n");
      out.write("                                                value.parentElement.innerHTML = \"Name:<input  onclick=\"+\"changeStatus('\"+pid+\"', this)\"+\" type='checkbox' value=\"+\"0\"+\" >\\n\\\r\n");
      out.write("                                                                                  <span class='slider'></span>\";\r\n");
      out.write("                                                console.log(value.parentElement.innerHTML);\r\n");
      out.write("                                            }else{\r\n");
      out.write("                                                value.parentElement.innerHTML = \"Name:<input  onclick=\"+\"changeStatus('\"+pid+\"', this)\"+\" type='checkbox' value=\"+\"1\"+\" >\\n\\\r\n");
      out.write("                                                                                  <span class='slider'></span> \";\r\n");
      out.write("                                            }\r\n");
      out.write("                                           \r\n");
      out.write("                                           \r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("//                                            var status = $(value).val();\r\n");
      out.write("//                                            jQuery.ajax({\r\n");
      out.write("//                                                url: \"/BugerKingW/ProductManager\",\r\n");
      out.write("//                                                type: \"GET\",\r\n");
      out.write("//                                                data: {pid: pid,\r\n");
      out.write("//                                                    status: status,\r\n");
      out.write("//                                                    service: \"changeStatus\"},\r\n");
      out.write("//                                                success: function (result) {\r\n");
      out.write("//                                                    $(value).val(result);\r\n");
      out.write("//                                                    console.log(result);\r\n");
      out.write("//                                                }, error: function () {\r\n");
      out.write("//\r\n");
      out.write("//                                                }\r\n");
      out.write("//                                            });\r\n");
      out.write("                                        }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr class=\"rem1\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\r\n");
          out.write("                            <td id=\"pid\" class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td class=\"invert\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td  class=\"invert-image image\">\r\n");
          out.write("                                <img  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\" \" class=\"img-responsive\">\r\n");
          out.write("                            </td>                           \r\n");
          out.write("                            <td class=\"invert\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <button type=\"button\" onclick=\"location.href = 'ProductManager?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&service=dataforupdate'\" class=\"btn btn-primary\"> UPDATE</button>\r\n");
          out.write("                                <br>\r\n");
          out.write("                                <br>\r\n");
          out.write("\r\n");
          out.write("                                <button type=\"button\" onclick=\"deleteProduct('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', this)\"  class=\"btn btn-danger\">DELETE</button>\r\n");
          out.write("\r\n");
          out.write("                            </td>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <label class=\"switch\">\r\n");
          out.write("                                    <input  onclick=\"changeStatus('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', this)\" type=\"checkbox\" ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" >\r\n");
          out.write("                                           <span class=\"slider\"></span>\r\n");
          out.write("                                    </label>\r\n");
          out.write("                                </td>\r\n");
          out.write("                            </tr>\r\n");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.status==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked value=\"1\"");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
