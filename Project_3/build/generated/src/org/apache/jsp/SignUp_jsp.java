package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <!--Made with love by Mutiullah Samim -->\n");
      out.write("\n");
      out.write("        <!--Bootsrap 4 CDN-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!--Fontawesome CDN-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!--Custom styles-->\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"d-flex justify-content-center h-100\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header\">\n");
      out.write("                        <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                        <h3>Sign Up</h3>\n");
      out.write("                        <div class=\"d-flex justify-content-end social_icon\">\n");
      out.write("                            <span><i class=\"fab fa-facebook-square\"></i></span>\n");
      out.write("                            <span><i class=\"fab fa-google-plus-square\"></i></span>\n");
      out.write("                            <span><i class=\"fab fa-twitter-square\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <form  onsubmit=\"return validateForm()\" action=\"signup\" method=\"post\">\n");
      out.write("                            <div class=\"input-group form-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input id=\"username\" name=\"user\" type=\"text\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group form-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input id=\"password\" name=\"pass\" type=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group form-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input id=\"re-password\" name=\"re-pass\" type=\"password\" class=\"form-control\" placeholder=\"Re-password\">\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\" value=\"Login\" class=\"btn float-right login_btn\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<!--        <script>\n");
      out.write("            function validateForm() {\n");
      out.write("                var user = document.getElementById(\"username\").value;\n");
      out.write("                var pass = document.getElementById(\"password\").value;\n");
      out.write("                var re-pass = document.getElementById(\"re-password\").value;\n");
      out.write("                var regex1 = /[^$#@%^&*]{7,}/;\n");
      out.write("                var regex2 = /(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}/;\n");
      out.write("                if (user.match(regex1) && pass.match(regex2) && pass === re-pass) {\n");
      out.write("                    return true;\n");
      out.write("                } else {\n");
      out.write("                    alert(\"invalid username or password\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>-->\n");
      out.write("    </body>\n");
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
