/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2018-06-22 00:14:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dash_002dboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Fortress QuizManager - Dash-board</title>\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("<meta content=\"\" name=\"keywords\">\r\n");
      out.write("<meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("<!-- Favicons -->\r\n");
      out.write("<link href=\"resources/img/favicon.png\" rel=\"icon\">\r\n");
      out.write("<!-- <link href=\"resources/img/apple-touch-icon.png\" rel=\"apple-touch-icon\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Libraries CSS Files -->\r\n");
      out.write("<!-- <link href=\"resources/lib/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"> -->\r\n");
      out.write("<link href=\"webjars/font-awesome/4.7.0/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/lib/ionicons/css/ionicons.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/lib/owlcarousel/assets/owl.carousel.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/lib/lightbox/css/lightbox.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Main Stylesheet File -->\r\n");
      out.write("<link href=\"resources/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS File -->\r\n");
      out.write("<link href=\"webjars/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!--==========================\r\n");
      out.write("    Header\r\n");
      out.write("  ============================-->\r\n");
      out.write("\t<header id=\"header\" style=\"background-color: #111;\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"logo\" class=\"pull-left\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t<a href=\"#intro\" class=\"scrollto\">QuizManager</a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t<!-- Uncomment below if you prefer to use an image logo -->\r\n");
      out.write("\t\t\t\t<!-- <a href=\"#intro\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<nav id=\"nav-menu-container\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav-menu\">\r\n");
      out.write("\t\t\t\t\t<li class=\"menu-active\"><a href=\"#intro\">Dash-Board</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"menu-has-children\"><a href=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Settings</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Change Password</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<!-- #nav-menu-container -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- #header -->\r\n");
      out.write("\r\n");
      out.write("\t<main id=\"main\"> <!--==========================\r\n");
      out.write("\r\n");
      out.write("      About Us Section\r\n");
      out.write("    ============================-->\r\n");
      out.write("\t<section id=\"services\"></section>\r\n");
      out.write("\r\n");
      out.write("\t<section id=\"about\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row about-cols\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 wow fadeInUp\">\r\n");
      out.write("\t\t\t\t\t<div class=\"about-col\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/img/apps.png\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ion-ios-speedometer-outline\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"users\">User Management</a>\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t<!-- <p>The module to manage all the application Users by performing a\r\n");
      out.write("\t\t\t\t\t\t\tsimple CRUD (Create, Update, Delete and Read) operations.</p> -->\r\n");
      out.write("\t\t\t\t\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("\t\t\t\t\t<div class=\"about-col\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/img/apps.png\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ion-ios-list-outline\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Student Management</a>\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t<!-- <p>The module to manage the Students who comes to take Exams by performing a\r\n");
      out.write("\t\t\t\t\t\t\tCRUD (Create, Update, Delete and Read) operations.</p> -->\r\n");
      out.write("\t\t\t\t\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 wow fadeInUp\" data-wow-delay=\"0.2s\">\r\n");
      out.write("\t\t\t\t\t<div class=\"about-col\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/img/apps.png\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ion-ios-eye-outline\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Exam Management</a>\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t<!-- <p>The module to manage the Exams which Students take by performing a\r\n");
      out.write("\t\t\t\t\t\t\tCRUD (Create, Update, Delete and Read) operations.</p> -->\r\n");
      out.write("\t\t\t\t\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 wow fadeInUp\" data-wow-delay=\"0.2s\">\r\n");
      out.write("\t\t\t\t\t<div class=\"about-col\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/img/apps.png\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ion-ios-eye-outline\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Question Management</a>\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t<!-- <p>The module to manage the Questions to be taken during Exams by performing a\r\n");
      out.write("\t\t\t\t\t\t\tCRUD (Create, Update, Delete and Read) operations.</p> -->\r\n");
      out.write("\t\t\t\t\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- #about --> </main>\r\n");
      out.write("\t<!--==========================\r\n");
      out.write("    Footer\r\n");
      out.write("  ============================-->\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t&copy; Copyright <strong>Fortess QuizManager</strong>. All Rights\r\n");
      out.write("\t\t\t\tReserved\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"credits\">\r\n");
      out.write("\t\t\t\tDesigned by <a href=\"#\"><strong>Bismark and Mihika</strong></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- #footer -->\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"#\" class=\"back-to-top\"><i class=\"fa fa-chevron-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- JavaScript Libraries -->\r\n");
      out.write("\t<script src=\"resources/lib/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/jquery/jquery-migrate.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/easing/easing.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/superfish/hoverIntent.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/superfish/superfish.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/wow/wow.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/counterup/counterup.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/isotope/isotope.pkgd.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/lightbox/js/lightbox.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/lib/touchSwipe/jquery.touchSwipe.min.js\"></script>\r\n");
      out.write("\t<!-- Contact Form JavaScript File -->\r\n");
      out.write("\t<script src=\"resources/contactform/contactform.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- JavaScript plugins -->\r\n");
      out.write("\t<script src=\"resources/js/main.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"webjars/jquery/3.3.1-1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}