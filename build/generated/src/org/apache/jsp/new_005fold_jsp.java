package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005fold_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .jumbotron\n");
      out.write("            {\n");
      out.write("              width:75%;                \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"images/back.jpg\");\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("         \n");
      out.write("          </style>  \n");
      out.write("        </head>\n");
      out.write("      <body class=\"body\">\n");
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
      out.write("        \n");
      out.write("        <center>\n");
      out.write("            \n");
      out.write("            <div class=\"jumbotron\">  <b><center><p>Brand New Products</center></b> You need to get verified as an Authentic Seller before posting a new product. Please proceed to insert your Details. \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <!--<a href=\"#\"><div class=\"btn btn-info\">Register Here</div></a>-->\n");
      out.write("            <button type=\"button\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#myModal\">Register Here!</button>\n");
      out.write("   <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog modal-sm\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("           <div class=\"modal-header\">\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                  <table>\n");
      out.write("                      \n");
      out.write("                  <tr><td><label>ID Proof:</label> </td>\n");
      out.write("                   <td><select name=\"\" id=\"\">\n");
      out.write("                   <option value=\"0\">select ID </option>\n");
      out.write("                   <option>Unique Id</option>\n");
      out.write("                   <option>PAN card</option>\n");
      out.write("                   <option>Voter Id</option>\n");
      out.write("                   </select> </td></tr>\n");
      out.write("                  <tr><td><label>Registration number:</label></td>\n");
      out.write("                 <td> <input type=\"text\"/></td></tr>\n");
      out.write("                  </table>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("           </div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Register</button>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <div class=\"jumbotron\"> <b><center><p>Second Hand/Old Products</center></b> To Post an old product, please proceed directly to the Posting Interface.\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        <a href=\"prod_upld.jsp\"><div class=\"btn btn-info\">Publish Product</div></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
      out.write("           \n");
      out.write("        </center>\n");
      out.write("        \n");
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
