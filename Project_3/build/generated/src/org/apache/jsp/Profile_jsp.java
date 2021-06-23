package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://bootswatch.com/4/simplex/bootstrap.min.css\"/>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                padding-top: 68px;\n");
      out.write("                padding-bottom: 50px;\n");
      out.write("            }\n");
      out.write("            .image-container {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image {\n");
      out.write("                opacity: 1;\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("                height: auto;\n");
      out.write("                transition: .5s ease;\n");
      out.write("                backface-visibility: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle {\n");
      out.write("                transition: .5s ease;\n");
      out.write("                opacity: 0;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                -ms-transform: translate(-50%, -50%);\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image-container:hover .image {\n");
      out.write("                opacity: 0.3;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image-container:hover .middle {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <div class=\"container\">\n");
        out.write("            <div class=\"row\">\n");
        out.write("                <div class=\"col-12\">\n");
        out.write("                    <div class=\"card\">\n");
        out.write("\n");
        out.write("                        <div class=\"card-body\">\n");
        out.write("                            <div class=\"card-title mb-4\">\n");
        out.write("                                <div class=\"d-flex justify-content-start\">\n");
        out.write("                                    <div class=\"image-container\">\n");
        out.write("                                        <img src=\"data:image/png;base64,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\" id=\"imgProfile\" style=\"width: 150px; height: 150px\" class=\"img-thumbnail\" />\n");
        out.write("                                        <div class=\"middle\">\n");
        out.write("                                            <input type=\"button\" class=\"btn btn-secondary\" id=\"btnChangePicture\" value=\"Change\" />\n");
        out.write("                                            <input type=\"file\" style=\"display: none;\" id=\"profilePicture\" name=\"file\" />\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"userData ml-3\">\n");
        out.write("                                        <h2 class=\"d-block\" style=\"font-size: 1.5rem; font-weight: bold\"><a href=\"javascript:void(0);\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></h2>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"ml-auto\">\n");
        out.write("                                        <input type=\"button\" class=\"btn btn-primary d-none\" id=\"btnDiscard\" value=\"Discard Changes\" />\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            <div class=\"row\">\n");
        out.write("                                <div class=\"col-12\">\n");
        out.write("                                    <ul class=\"nav nav-tabs mb-4\" id=\"myTab\" role=\"tablist\">\n");
        out.write("                                        <li class=\"nav-item\">\n");
        out.write("                                            <a class=\"nav-link active\" id=\"basicInfo-tab\" data-toggle=\"tab\" href=\"#basicInfo\" role=\"tab\" aria-controls=\"basicInfo\" aria-selected=\"true\">Basic Info</a>\n");
        out.write("                                        </li>\n");
        out.write("\n");
        out.write("                                    </ul>\n");
        out.write("                                    <div class=\"tab-content ml-1\" id=\"myTabContent\">\n");
        out.write("                                        <div class=\"tab-pane fade show active\" id=\"basicInfo\" role=\"tabpanel\" aria-labelledby=\"basicInfo-tab\">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                            <div class=\"row\">\n");
        out.write("                                                <div class=\"col-sm-3 col-md-2 col-5\">\n");
        out.write("                                                    <label style=\"font-weight:bold;\">UserName</label>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"col-md-8 col-6\">\n");
        out.write("                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                            <hr />\n");
        out.write("\n");
        out.write("                                            <div class=\"row\">\n");
        out.write("                                                <div class=\"col-sm-3 col-md-2 col-5\">\n");
        out.write("                                                    <label style=\"font-weight:bold;\">Password</label>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"col-md-8 col-6\">\n");
        out.write("                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                            <hr />\n");
        out.write("\n");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"tab-pane fade\" id=\"connectedServices\" role=\"tabpanel\" aria-labelledby=\"ConnectedServices-tab\">\n");
        out.write("                                            Facebook, Google, Twitter Account that are connected to this account\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("    ");
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
