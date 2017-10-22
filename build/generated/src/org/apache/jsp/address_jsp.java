package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class address_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("    #div1{\n");
      out.write("        background-color: lavender;\n");
      out.write("    }\n");
      out.write("    #div2{\n");
      out.write("        background-color: lavenderblush ;\n");
      out.write("    }\n");
      out.write("    #main{\n");
      out.write("        margin: 1% 15% 1% 15% ;\n");
      out.write("    }\n");
      out.write("    .body{\n");
      out.write("        background-image: url(\"images/bg.jpg\");\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write(".form-group input[type=\"checkbox\"] {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group input[type=\"checkbox\"] + .btn-group > label span {\n");
      out.write("    width: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group input[type=\"checkbox\"] + .btn-group > label span:first-child {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write(".form-group input[type=\"checkbox\"] + .btn-group > label span:last-child {\n");
      out.write("    display: inline-block;   \n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group input[type=\"checkbox\"]:checked + .btn-group > label span:first-child {\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write(".form-group input[type=\"checkbox\"]:checked + .btn-group > label span:last-child {\n");
      out.write("    display: none;   \n");
      out.write("}\n");
      out.write("\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body class=\"body\">\n");
      out.write("    \n");
      out.write("     ");
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
      out.write("    \n");
      out.write("  \n");
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
      out.write("            ");

              if(request.getSession().getAttribute("user_id")!=null)
                                {
            
      out.write("\n");
      out.write("              \n");
      out.write("                <li><a href=\"new_old.jsp\" ><b><u> Sell Product </u></b></a></li>\n");
      out.write("                ");

                                }   
              else{
                  
      out.write("\n");
      out.write("                    <li><a href=\"login.jsp\" ><b><u> Sell Product </u></b></a></li>\n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> \n");
      out.write("                            ");
 
                                if(request.getSession().getAttribute("name")!=null)
                                {
                                out.println(request.getSession().getAttribute("name"));
                                }
                            
      out.write("\n");
      out.write("                            <span class=\"caret\"></span></a>\n");
      out.write("            ");

           
            if(request.getSession().getAttribute("user_id")==null)
            {
           
      out.write("\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            \n");
      out.write("\t\t\t\t<li> <a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Log IN </a> </li>\n");
      out.write("\t\t\t\t<li> <a href=\"registration.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign UP</a> </li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("                ");

                   }
                      else  
                   {
                   
                       
      out.write("\n");
      out.write("                       <ul class=\"dropdown-menu\">\n");
      out.write("                         \n");
      out.write("                       \n");
      out.write("                      \n");
      out.write("\t\t\t\t<li> <a href=\"user_profile.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Edit Profile </a> </li>\n");
      out.write("                                \n");
      out.write("                         <li> <a href=\"logout.jsp\"> <span class=\"glyphicon glyphicon-user\"></span> Logout</a> </li>\n");
      out.write("                         ");

                                response.setHeader("Cache-Control", "No-Store"); 
                                 
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("                                              </li>\n");
      out.write("\n");
      out.write("                   ");

                   }
                    
      out.write("\n");
      out.write("\t\t\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("     \n");
      out.write("     <div id=\"main\"> \n");
      out.write("         \n");
      out.write("         <!--<div id=\"div1\" class=\"col-md-12\">\n");
      out.write("             \n");
      out.write("             <h3>Payment Method</h3>\n");
      out.write("             <br>\n");
      out.write("             <h4> Proceed through Paypal...</h4>\n");
      out.write("             <br><br>\n");
      out.write("             \n");
      out.write("   \n");
      out.write("         </div>-->\n");
      out.write("         \n");
      out.write("         <div id=\"div2\" class=\"col-md-12\">\n");
      out.write("         \n");
      out.write("        <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("            \n");
      out.write("           \n");
      out.write("\t\t <form class=\"form-horizontal\">\n");
      out.write("            <fieldset>\n");
      out.write("                <!-- Address form -->\n");
      out.write("         \n");
      out.write("                <h2> Delivary Address</h2>\n");
      out.write("         \n");
      out.write("                <!-- full-name input-->\n");
      out.write("                \n");
      out.write("                <div class=\"[ form-group ]\">\n");
      out.write("            <input type=\"checkbox\" name=\"fancy-checkbox-primary\" id=\"fancy-checkbox-primary\"\n");
      out.write("                   autocomplete=\"off\" />\n");
      out.write("            <div class=\"[ btn-group ]\">\n");
      out.write("               \n");
      out.write("                <div class =\"panel panel-info\">\n");
      out.write("              <div class =\"panel-heading\">\n");
      out.write("                    <h4 class =\"panel-title\">\n");
      out.write("                        <a href=\"#data1\" data-toggle=\"collapse\" data-parent=\"#accordion\"><center>Default Address</center></a>\n");
      out.write("                    </h4>\n");
      out.write("              </div>\n");
      out.write("        <div id=\"data1\" class=\"panel-collapse collapse\">\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                Address that is already registered by the user.\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("          <br>   \n");
      out.write("             \n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\">Full Name</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input id=\"full-name\" name=\"full-name\" type=\"text\" placeholder=\"full name\"\n");
      out.write("                        class=\"input-xlarge\">\n");
      out.write("                        <p class=\"help-block\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- address-line1 input-->\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\">Address Line 1</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input id=\"address-line1\" name=\"address-line1\" type=\"text\" placeholder=\"address line 1\"\n");
      out.write("                        class=\"input-xlarge\">\n");
      out.write("                        <p class=\"help-block\">Street address, P.O. box, company name, c/o</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- address-line2 input-->\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\">Address Line 2</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input id=\"address-line2\" name=\"address-line2\" type=\"text\" placeholder=\"address line 2\"\n");
      out.write("                        class=\"input-xlarge\">\n");
      out.write("                        <p class=\"help-block\">Apartment, suite , unit, building, floor, etc.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- city input-->\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\">City / Town</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input id=\"city\" name=\"city\" type=\"text\" placeholder=\"city\" class=\"input-xlarge\">\n");
      out.write("                        <p class=\"help-block\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- region input-->\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\">State / Province / Region</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input id=\"region\" name=\"region\" type=\"text\" placeholder=\"state / province / region\"\n");
      out.write("                        class=\"input-xlarge\">\n");
      out.write("                        <p class=\"help-block\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- postal-code input-->\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\">Zip / Postal Code</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input id=\"postal-code\" name=\"postal-code\" type=\"text\" placeholder=\"zip or postal code\"\n");
      out.write("                        class=\"input-xlarge\">\n");
      out.write("                        <p class=\"help-block\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("         <br><br><br>\n");
      out.write("         <center> <a href=\"payment.jsp\"><div class=\"btn btn-success\">Buy</div></a> </center>\n");
      out.write("     </div>\n");
      out.write("     </body>");
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
