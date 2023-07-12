package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>ShopGrids - Bootstrap 5 eCommerce HTML Template.</title>\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/images/favicon.svg\" />\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/LineIcons.3.0.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tiny-slider.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/glightbox.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/signup.css\" />\n");
      out.write("</head>\n");
      out.write("<a href=\"https://front.codes/\" class=\"logo\" target=\"_blank\">\n");
      out.write("    <img src=\"https://assets.codepen.io/1462889/fcy.png\" alt=\"\">\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("<div class=\"section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row full-height justify-content-center\">\n");
      out.write("            <div class=\"col-12 text-center align-self-center py-5\">\n");
      out.write("                <div class=\"section pb-5 pt-5 pt-sm-2 text-center\">\n");
      out.write("                    <h6 class=\"mb-0 pb-3\"><span>Log In </span><span>Sign Up</span></h6>\n");
      out.write("                    <input class=\"checkbox\" type=\"checkbox\" id=\"reg-log\" name=\"reg-log\"/>\n");
      out.write("                    <label for=\"reg-log\"></label>\n");
      out.write("                    <div class=\"card-3d-wrap mx-auto\">\n");
      out.write("                        <div class=\"card-3d-wrapper\">\n");
      out.write("                            <form class=\"form-signin\" action=\"login\" method=\"post\">\n");
      out.write("                                <div class=\"card-front\">\n");
      out.write("                                    <div class=\"center-wrap\">\n");
      out.write("                                        <div class=\"section text-center\">\n");
      out.write("                                            <h4 class=\"mb-4 pb-3\">Log In</h4>\n");
      out.write("                                            <div>\n");
      out.write("                                                <p style=\"color: #f189b1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" name=\"username\" class=\"form-style\" placeholder=\"Username\" id=\"logemail\" autocomplete=\"off\">\n");
      out.write("                                                <i class=\"input-icon uil uil-at\"></i>\n");
      out.write("                                            </div>\t\n");
      out.write("                                            <div class=\"form-group mt-2\">\n");
      out.write("                                                <input type=\"password\" name=\"pass\" class=\"form-style\" placeholder=\"Password\" id=\"logpass\" autocomplete=\"off\">\n");
      out.write("                                                <i class=\"input-icon uil uil-lock-alt\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <button type=\"submit\" class=\"btn mt-4\" >submit</button>\n");
      out.write("                                            <p class=\"mb-0 mt-4 text-center\"><a href=\"#0\" class=\"link\">Forgot your password?</a></p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"card-back\">\n");
      out.write("                                <div class=\"center-wrap\">\n");
      out.write("                                    <form class=\"form-signin\" action=\"signup\" method=\"post\">\n");
      out.write("                                    <div class=\"section text-center\">\n");
      out.write("                                        <h4 class=\"mb-4 pb-3\">Sign Up</h4>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"fullname\" class=\"form-style\" placeholder=\"Your Full Name\" id=\"logname\" autocomplete=\"off\">\n");
      out.write("                                            <i class=\"input-icon uil uil-user\"></i>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"username\" class=\"form-style\" placeholder=\"Your user Name\" id=\"username\" autocomplete=\"off\">\n");
      out.write("                                            <i class=\"input-icon uil uil-user\"></i>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group mt-2\">\n");
      out.write("                                            <input type=\"email\" name=\"logemail\" class=\"form-style\" placeholder=\"Your Email\" id=\"logemail\" autocomplete=\"off\">\n");
      out.write("                                            <i class=\"input-icon uil uil-at\"></i>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"form-group mt-2\">\n");
      out.write("                                            <input type=\"password\" name=\"logpass\" class=\"form-style\" placeholder=\"Your Password\" id=\"logpass\" autocomplete=\"off\">\n");
      out.write("                                            <i class=\"input-icon uil uil-lock-alt\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group mt-2\">\n");
      out.write("                                            <input type=\"password\" name=\"re_logpass\" class=\"form-style\" placeholder=\"Confirm Your Password\" id=\"logpass\" autocomplete=\"off\">\n");
      out.write("                                            <i class=\"input-icon uil uil-lock-alt\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" href=\"#\" class=\"btn mt-4\">submit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                        </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
