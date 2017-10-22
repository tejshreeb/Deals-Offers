package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/nav.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Roboto:300);\n");
      out.write("\n");
      out.write("            .login-page {\n");
      out.write("              width: 360px;\n");
      out.write("              padding: 8% 0 0;\n");
      out.write("              margin: auto;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            .form {\n");
      out.write("              position: relative;\n");
      out.write("              z-index: 1;\n");
      out.write("              background: #FFFFFF;\n");
      out.write("              max-width: 360px;\n");
      out.write("              margin: 0 auto 100px;\n");
      out.write("              padding: 45px;\n");
      out.write("              text-align: center;\n");
      out.write("              box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\n");
      out.write("            }\n");
      out.write("            .form input {\n");
      out.write("              font-family: \"Roboto\", sans-serif;\n");
      out.write("              outline: 0;\n");
      out.write("              background: #f2f2f2;\n");
      out.write("              width: 100%;\n");
      out.write("              border: 0;\n");
      out.write("              margin: 0 0 15px;\n");
      out.write("              padding: 15px;\n");
      out.write("              box-sizing: border-box;\n");
      out.write("              font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .form button {\n");
      out.write("              font-family: \"Roboto\", sans-serif;\n");
      out.write("              text-transform: uppercase;\n");
      out.write("              outline: 0;\n");
      out.write("              background: #4CAF50;\n");
      out.write("              width: 100%;\n");
      out.write("              border: 0;\n");
      out.write("              padding: 15px;\n");
      out.write("              color: #FFFFFF;\n");
      out.write("              font-size: 14px;\n");
      out.write("              -webkit-transition: all 0.3 ease;\n");
      out.write("              transition: all 0.3 ease;\n");
      out.write("              cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .form button:hover,.form button:active,.form button:focus {\n");
      out.write("              background: #43A047;\n");
      out.write("            }\n");
      out.write("            .form .message {\n");
      out.write("              margin: 15px 0 0;\n");
      out.write("              color: #b3b3b3;\n");
      out.write("              font-size: 12px;\n");
      out.write("            }\n");
      out.write("            .form .message a {\n");
      out.write("              color: #4CAF50;\n");
      out.write("              text-decoration: none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            .container {\n");
      out.write("              position: relative;\n");
      out.write("              z-index: 1;\n");
      out.write("              max-width: 300px;\n");
      out.write("              margin: 0 auto;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            .container:before, .container:after {\n");
      out.write("              content: \"\";\n");
      out.write("              display: block;\n");
      out.write("              clear: both;\n");
      out.write("            }\n");
      out.write("            .container .info {\n");
      out.write("              margin: 50px auto;\n");
      out.write("              text-align: center;\n");
      out.write("            }\n");
      out.write("            .container .info h1 {\n");
      out.write("              margin: 0 0 15px;\n");
      out.write("              padding: 0;\n");
      out.write("              font-size: 36px;\n");
      out.write("              font-weight: 300;\n");
      out.write("              color: #1a1a1a;\n");
      out.write("            }\n");
      out.write("            .container .info span {\n");
      out.write("              color: #4d4d4d;\n");
      out.write("              font-size: 12px;\n");
      out.write("            }\n");
      out.write("            .container .info span a {\n");
      out.write("              color: #000000;\n");
      out.write("              text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .container .info span .fa {\n");
      out.write("              color: #EF3B3A;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                \n");
      out.write("              background: #76b852; /* fallback for old browsers */\n");
      out.write("              background-image: url(\"images/back.jpg\");\n");
      out.write("            }\n");
      out.write("        </style>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>nav</title>\n");
      out.write("\t  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <script src=\"js/jquery.js\"></script>\n");
      out.write("\t  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("          <style>\n");
      out.write("          #logopic\n");
      out.write("           {\n");
      out.write("               float:left;\n");
      out.write("               padding:2%;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span> \n");
      out.write("      </button>\n");
      out.write("\t  <!--<a href=\"#\" class=\"pull-left\"><img src=\"images/logo.jpg\"></a> -->\n");
      out.write("          \n");
      out.write("         <a href=\"index.jsp\"> <img id=\"logopic\" src=\"images/fevicon.png\" height=\"10%\" width=\"15%\" ></a>\n");
      out.write("          \n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\"> Deals & Offers</a>\n");
      out.write("\t  <!-- make a image of small size and place it in following line\n");
      out.write("\t\t<a href='#' class='pull-left brand-font'><img src=\"images/logo.jpg\">Deals & Offers</a>\n");
      out.write("\t  -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <!--<ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("      </ul>-->\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t<!--\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>  -->\n");
      out.write("                <li><a href=\"new_old.jsp\" ><b><u> Sell Product </u></b></a></li>\n");
      out.write("        <!--<li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>-->\n");
      out.write("\t\t\n");
      out.write("\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t<li> <a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Log IN </a> </li>\n");
      out.write("\t\t\t\t<li> <a href=\"registration.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign UP</a> </li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\"login-page\">\n");
      out.write("        <div class=\"form\">\n");
      out.write("         \n");
      out.write("            <form class=\"login-form\" action=\"adminlogintask.jsp\" method=\"post\">\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Email\" name=\"email\"/>\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\"/>\n");
      out.write("            <a href=\"admin_home.jsp\"><button type=\"submit\">login</button></a>\n");
      out.write("            \n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("    \n");
      out.write("    .footer\n");
      out.write("     {     \n");
      out.write("       background-color:lightgrey;\n");
      out.write("       height: 7%;\n");
      out.write("       right: 0;\n");
      out.write("       bottom: 0%;\n");
      out.write("       left: 0;\n");
      out.write("       position: static;\n");
      out.write("     }\n");
      out.write("     </style>\n");
      out.write("     </head>\n");
      out.write("\n");
      out.write("  <div class=\"footer\" >\n");
      out.write("    <div class=\"row\">\n");
      out.write("          <div class=\"col-md-2\"><a href=\"index.jsp\">Home</a></div>\n");
      out.write("          <div  class=\"col-md-2\"><a href=\"#\">About Us</a></div>\n");
      out.write("          <div  class=\"col-md-2\"><a href=\"#\">Contact Us</a></div>\n");
      out.write("          <div  class=\"col-md-2\"><a href=\"admin_login.jsp\">Admin Login</a></div>\n");
      out.write("          <div  class=\"col-md-4\">Connect with us</div>\n");
      out.write("          <center><div class=\"col-md-12\"> S@cpyright</div> </center>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("  </div>");
      out.write("\n");
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
