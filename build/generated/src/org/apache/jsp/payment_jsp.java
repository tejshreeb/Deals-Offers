package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <div id=\"div1\" class=\"col-md-12\">\n");
      out.write("             \n");
      out.write("             <h3>Payment Method</h3>\n");
      out.write("             <br>\n");
      out.write("             <h4> Proceed through Paypal...</h4>\n");
      out.write("             <br><br>\n");
      out.write("          ");

    String paypal_url="https://www.sandbox.paypal.com/cgi-bin/webscr"; // Test Paypal API URL
    String paypal_id="batch4323-facilitator@gmail.com"; // Business email ID
    
      out.write("\n");
      out.write("    <h4>Welcome, Guest</h4>\n");
      out.write("\n");
      out.write("    <div class=\"product\">            \n");
      out.write("        <div class=\"image\">\n");
      out.write("            <img src=\"http://www.phpgang.com/wp-content/uploads/gang.jpg\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"name\">\n");
      out.write("            PHPGang Payment\n");
      out.write("        </div>\n");
      out.write("        <div class=\"price\">\n");
      out.write("            Price:$10\n");
      out.write("        </div>\n");
      out.write("        <div class=\"btn\">\n");
      out.write("        <form action=\"");
      out.print(paypal_url);
      out.write("\" method=\"post\" name=\"frmPayPal1\">\n");
      out.write("        <input type=\"hidden\" name=\"business\" value=\"");
      out.print(paypal_id);
      out.write("\">\n");
      out.write("        <input type=\"hidden\" name=\"cmd\" value=\"_xclick\">\n");
      out.write("        <input type=\"hidden\" name=\"item_name\" value=\"PHPGang Payment\">\n");
      out.write("        <input type=\"hidden\" name=\"item_number\" value=\"1\">\n");
      out.write("        <input type=\"hidden\" name=\"credits\" value=\"510\">\n");
      out.write("        <input type=\"hidden\" name=\"userid\" value=\"1\">\n");
      out.write("        <input type=\"hidden\" name=\"amount\" value=\"10\">\n");
      out.write("        <input type=\"hidden\" name=\"cpp_header_image\" value=\"http://www.phpgang.com/wp-content/uploads/gang.jpg\">\n");
      out.write("        <input type=\"hidden\" name=\"no_shipping\" value=\"1\">\n");
      out.write("        <input type=\"hidden\" name=\"currency_code\" value=\"USD\">\n");
      out.write("        <input type=\"hidden\" name=\"handling\" value=\"0\">\n");
      out.write("        <input type=\"hidden\" name=\"cancel_return\" value=\"http://demo.phpgang.com/payment_with_paypal/cancel.php\">\n");
      out.write("        <input type=\"hidden\" name=\"return\" value=\"http://demo.phpgang.com/payment_with_paypal/success.php\">\n");
      out.write("        <input type=\"image\" src=\"https://www.sandbox.paypal.com/en_US/i/btn/btn_buynowCC_LG.gif\" border=\"0\" name=\"submit\" alt=\"PayPal - The safer, easier way to pay online!\">\n");
      out.write("        <img alt=\"\" border=\"0\" src=\"https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif\" width=\"1\" height=\"1\">\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <br><br><br>\n");
      out.write("         <center> <div class=\"btn btn-success\">Buy</div> </center>\n");
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
