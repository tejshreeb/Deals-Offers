package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sell_005fanalytics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/nav.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Sell Analytics</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
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
      out.write("<div class=\"container\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <ul class=\"nav nav-tabs\">\n");
      out.write("    <li class=\"active\"><a data-toggle=\"tab\" href=\"#home\">Total Order Received</a></li>\n");
      out.write("    <li><a data-toggle=\"tab\" href=\"#menu1\">Item Dispatched</a></li>\n");
      out.write("    <li><a data-toggle=\"tab\" href=\"#menu2\">Delieverd Items</a></li>\n");
      out.write("    <li><a data-toggle=\"tab\" href=\"#menu3\">Stock Management</a></li>\n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("  <div class=\"tab-content\">\n");
      out.write("    <div id=\"home\" class=\"tab-pane fade in active\">\n");
      out.write("      <h3>Total Order Received</h3>\n");
      out.write("      <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>order_id</th>\n");
      out.write("        <th>Customer Name</th>\n");
      out.write("        <th>Contact Number</th>\n");
      out.write("        <th>Delievery Address</th>\n");
      out.write("        <th>Quantity</th>\n");
      out.write("        <th>Date</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("<!--    <tbody>\n");
      out.write("      <tr>\n");
      out.write("        <td>John</td>\n");
      out.write("        <td>Doe</td>\n");
      out.write("        <td>john@example.com</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>Mary</td>\n");
      out.write("        <td>Moe</td>\n");
      out.write("        <td>mary@example.com</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>July</td>\n");
      out.write("        <td>Dooley</td>\n");
      out.write("        <td>july@example.com</td>\n");
      out.write("      </tr>\n");
      out.write("    </tbody>-->\n");
      out.write("  </table>\n");
      out.write("          </div>\n");
      out.write("    <div id=\"menu1\" class=\"tab-pane fade\">\n");
      out.write("      <h3>Item Dispatched</h3>\n");
      out.write("      <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>order_id</th>\n");
      out.write("        <th>track_id</th>\n");
      out.write("        <th>dispatched on</th>\n");
      out.write("        <th>Expected Delievery Date</th>\n");
      out.write("\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    </table>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"menu2\" class=\"tab-pane fade\">\n");
      out.write("      <h3>Delieverd Items</h3>\n");
      out.write("      <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>order_id</th>\n");
      out.write("        <th>Customer Name</th>\n");
      out.write("        <th>Pending Revenue</th>\n");
      out.write("        <th>Delievery Date</th>\n");
      out.write("       \n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    </table>\n");
      out.write("          </div>\n");
      out.write("    <div id=\"menu3\" class=\"tab-pane fade\">\n");
      out.write("      <h3>Stock Management</h3>\n");
      out.write("      <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>order_id</th>\n");
      out.write("        <th>Customer Name</th>\n");
      out.write("        <th>Contact Number</th>\n");
      out.write("        <th>Delievery Address</th>\n");
      out.write("        <th>Quantity</th>\n");
      out.write("        <th>Date</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    </table>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
}
