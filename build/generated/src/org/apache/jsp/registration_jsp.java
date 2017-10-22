package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("      <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Sign Up Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("    <style>\n");
      out.write("/*      *, *:before, *:after {\n");
      out.write("        -moz-box-sizing: border-box;\n");
      out.write("        -webkit-box-sizing: border-box;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("      }*/\n");
      out.write("\n");
      out.write("        .body {\n");
      out.write("          font-family: 'Nunito', sans-serif;\n");
      out.write("          color: #384047;\n");
      out.write("          background-color:#8DC26F;\n");
      out.write("          background-image: url(\"images/back.jpg\");\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("          max-width: 300px;\n");
      out.write("          margin: 10px auto;\n");
      out.write("          padding: 10px 20px;\n");
      out.write("          background: #f4f7f8;\n");
      out.write("          border-radius: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("          margin: 0 0 30px 0;\n");
      out.write("          text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"password\"],\n");
      out.write("        input[type=\"date\"],\n");
      out.write("        input[type=\"datetime\"],\n");
      out.write("        input[type=\"email\"],\n");
      out.write("        input[type=\"number\"],\n");
      out.write("        input[type=\"search\"],\n");
      out.write("        input[type=\"tel\"],\n");
      out.write("        input[type=\"time\"],\n");
      out.write("        input[type=\"url\"],\n");
      out.write("        textarea,\n");
      out.write("        select {\n");
      out.write("          background: rgba(255,255,255,0.1);\n");
      out.write("          border: none;\n");
      out.write("          font-size: 16px;\n");
      out.write("          height: auto;\n");
      out.write("          margin: 0;\n");
      out.write("          outline: 0;\n");
      out.write("          padding: 15px;\n");
      out.write("          width: 100%;\n");
      out.write("          background-color: #e8eeef;\n");
      out.write("          color: #8a97a0;\n");
      out.write("          box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;\n");
      out.write("          margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"radio\"],\n");
      out.write("        input[type=\"checkbox\"] {\n");
      out.write("          margin: 0 4px 8px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        select {\n");
      out.write("          padding: 6px;\n");
      out.write("          height: 32px;\n");
      out.write("          border-radius: 2px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("          padding: 19px 39px 18px 39px;\n");
      out.write("          color: #FFF;\n");
      out.write("          background-color: #4bc970;\n");
      out.write("          font-size: 18px;\n");
      out.write("          text-align: center;\n");
      out.write("          font-style: normal;\n");
      out.write("          border-radius: 5px;\n");
      out.write("          width: 100%;\n");
      out.write("          border: 1px solid #3ac162;\n");
      out.write("          border-width: 1px 1px 3px;\n");
      out.write("          box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;\n");
      out.write("          margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        fieldset {\n");
      out.write("          margin-bottom: 30px;\n");
      out.write("          border: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        label {\n");
      out.write("          display: block;\n");
      out.write("          margin-bottom: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("/*        label.light {\n");
      out.write("          font-weight: 300;\n");
      out.write("          display: inline;\n");
      out.write("        }*/\n");
      out.write("\n");
      out.write("        \n");
      out.write("        @media screen and (min-width: 480px) {\n");
      out.write("\n");
      out.write("          form {\n");
      out.write("            max-width: 480px;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"body\">\n");
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
      out.write("      <form action=\"userRegistration.jsp\" method=\"post\">\n");
      out.write("       <h1>Sign Up</h1>\n");
      out.write("        \n");
      out.write("        <fieldset>\n");
      out.write("          \n");
      out.write("          <label for=\"Username\">Username:</label>\n");
      out.write("          <input type=\"text\" id=\"name\" name=\"name\">\n");
      out.write("          \n");
      out.write("          <label for=\"Email\">Email:</label>\n");
      out.write("          <input type=\"email\" id=\"email\" name=\"email\">\n");
      out.write("          \n");
      out.write("          <label for=\"password\">Password:</label>\n");
      out.write("          <input type=\"password\" id=\"password\" name=\"pass\">\n");
      out.write("          \n");
      out.write("          <label for=\"confirm-password\">Confirm Password:</label>\n");
      out.write("          <input type=\"password\" id=\"c_pass\" name=\"c_pass\">\n");
      out.write("          \n");
      out.write("          <label for=\"contact\">Contact:</label>\n");
      out.write("          <input type=\"text\" id=\"contact\" name=\"contact\">\n");
      out.write("          \n");
      out.write("          <label for=\"desc\">Address:</label>\n");
      out.write("          <input type=\"text\" id=\"address\" name=\"address\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </fieldset>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <button type=\"submit\">Sign Up</button>\n");
      out.write("        <center><a href=\"login.jsp\">Login</a></center>\n");
      out.write("      </form>\n");
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
      out.write("          <div  class=\"col-md-2\"><a href=\"\">Admin Login</a></div>\n");
      out.write("          <div  class=\"col-md-4\">Connect with us</div>\n");
      out.write("          <center><div class=\"col-md-12\"> S@cpyright</div> </center>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("  </div>");
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
