package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("     <title>Admin Page</title>\n");
      out.write("      <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("      <script src=\"jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("    <div class=\"container\">\n");
      out.write("   <div class=\"panel panel-primary\">\n");
      out.write("    <div class=\"panel-heading\">\n");
      out.write("        <h3 class=\"panel-title\"><a href=\"validateuser.jsp\">User Validation</a></h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("       Validate the request of the Users who want to sell new products.\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("<div class=\"panel panel-primary\">\n");
      out.write("    <div class=\"panel-heading\">\n");
      out.write("        <h3 class=\"panel-title\"><a href=\"refundreq.jsp\">Refund Request Management</a></h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("        Review the request of the user who need a refund on the products they have bought.\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"panel panel-primary\">\n");
      out.write("    <div class=\"panel-heading\">\n");
      out.write("        <h3 class=\"panel-title\"><a href=\"blacklist.jsp\">Blacklist User (Seller)</a></h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("       Prohibit some users to sell their products. \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"panel panel-primary\">\n");
      out.write("    <div class=\"panel-heading\">\n");
      out.write("        <h3 class=\"panel-title\"><a href=\"#\">View all the users</a></h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("       View all the registered users on the website.\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"panel panel-primary\">\n");
      out.write("    <div class=\"panel-heading\">\n");
      out.write("        <h3 class=\"panel-title\"><a href=\"#\">Product history</a></h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("       View the list of products sold on a particular date/day.\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
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
      out.write("</body>\n");
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
