package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SubjectRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fragment/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container form-display\">\n");
      out.write("  <form action=\"SubjectRegistration\" method=\"POST\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"inputName\">Name</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputName\" name=\"name\" aria-describedby=\"emailHelp\" placeholder=\"Enter Name\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"inputSurname\">Surname</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputSurname\" name=\"surname\" placeholder=\"Enter Surname\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"inputPhone\">Phone Number</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputPhone\" name=\"phoneNumber\" placeholder=\"Enter Phone Number\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"inputEmailAddress\">Email Address</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"inputEmailAddress\" name=\"email\" placeholder=\"Enter Email Address\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <label>Subjects Name</label> <br>\n");
      out.write("    <div class=\"form-group form-check\">\n");
      out.write("      <input type=\"checkbox\" class=\"form-check-input\" name=\"chbxSubjects\" value=\"JavaScript\" >\n");
      out.write("      <label class=\"form-check-label\" >JavaScript</label> <br>\n");
      out.write("      <input type=\"checkbox\" class=\"form-check-input\" name=\"chbxSubjects\" value=\"Python\">\n");
      out.write("      <label class=\"form-check-label\" >Python</label> <br>\n");
      out.write("      <input type=\"checkbox\" class=\"form-check-input\" name=\"chbxSubjects\" value=\"C/C++\">\n");
      out.write("      <label class=\"form-check-label\" >C/C++</label>\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fragment/footer.jsp", out, false);
      out.write('\n');
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
