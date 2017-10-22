package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class refundreq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Refund Request Management</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("     \n");
      out.write("            .panel-table .panel-body{\n");
      out.write("  padding:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-body .table-bordered{\n");
      out.write("  border-style: none;\n");
      out.write("  margin:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-body .table-bordered > thead > tr > th:first-of-type {\n");
      out.write("    text-align:center;\n");
      out.write("    width: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-body .table-bordered > thead > tr > th:last-of-type,\n");
      out.write(".panel-table .panel-body .table-bordered > tbody > tr > td:last-of-type {\n");
      out.write("  border-right: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-body .table-bordered > thead > tr > th:first-of-type,\n");
      out.write(".panel-table .panel-body .table-bordered > tbody > tr > td:first-of-type {\n");
      out.write("  border-left: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-body .table-bordered > tbody > tr:first-of-type > td{\n");
      out.write("  border-bottom: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-body .table-bordered > thead > tr:first-of-type > th{\n");
      out.write("  border-top: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-footer .pagination{\n");
      out.write("  margin:0; \n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write("used to vertically center elements, may need modification if you're not using default sizes.\n");
      out.write("*/\n");
      out.write(".panel-table .panel-footer .col{\n");
      out.write(" line-height: 34px;\n");
      out.write(" height: 34px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-heading .col h3{\n");
      out.write(" line-height: 30px;\n");
      out.write(" height: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-table .panel-body .table-bordered > tbody > tr > td{\n");
      out.write("  line-height: 34px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("      \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("    \n");
      out.write("        <center>\n");
      out.write("    <h1>Refund Request</h1>\n");
      out.write("    <h4> Following users have requested a refund</h4>\n");
      out.write("        </center>\n");
      out.write("    \n");
      out.write("        <div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("\n");
      out.write("            <div class=\"panel panel-default panel-table\">\n");
      out.write("              <div class=\"panel-heading\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col col-xs-6\">\n");
      out.write("                    <h3 class=\"panel-title\">Pending Requests</h3>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col col-xs-6 text-right\">\n");
      out.write("                    <!--<button type=\"button\" class=\"btn btn-sm btn-primary btn-create\">Create New</button>-->\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("                <table class=\"table table-striped table-bordered table-list\">\n");
      out.write("                  <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        \n");
      out.write("                        <th class=\"hidden-xs\"> Referance ID</th>\n");
      out.write("                        <th>Username</th>\n");
      out.write("                        <th>Product Name</th>\n");
      out.write("                        <th>Product Price</th>\n");
      out.write("                        <th>Sold By</th>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        <th><center>Request</center></th>\n");
      out.write("                    </tr> \n");
      out.write("                  </thead>\n");
      out.write("                  <tbody>\n");
      out.write("                          <tr>\n");
      out.write("                            \n");
      out.write("                            <td class=\"hidden-xs\"><center>1</center></td>\n");
      out.write("                            <td>abc</td>\n");
      out.write("                            <td>name</td>\n");
      out.write("                            <td>price</td>\n");
      out.write("                            <td>Seller name</td>\n");
      out.write("                            <td>date</td>\n");
      out.write("                            <td align=\"center\">\n");
      out.write("                              <!--<a class=\"btn btn-default\">Accept</a>-->\n");
      out.write("                              <!--<a class=\"btn btn-danger\">Approve Refund</a>-->\n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                              <button type=\"button\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#myModal\">Approve Refund</button>\n");
      out.write("   <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog modal-sm\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("           <div class=\"modal-header\">\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                  <table>\n");
      out.write("                      \n");
      out.write("                 <!-- <tr><td><label>ID Proof:</label> </td>\n");
      out.write("                   <td><select name=\"\" id=\"\">\n");
      out.write("                   <option value=\"0\">select ID </option>\n");
      out.write("                   <option>Unique Id</option>\n");
      out.write("                   <option>PAN card</option>\n");
      out.write("                   <option>Voter Id</option>\n");
      out.write("                   </select> </td></tr>\n");
      out.write("                  <tr><td><label>Registration number:</label></td> -->\n");
      out.write("                 <!--<td> <input type=\"text\"/></td></tr>-->\n");
      out.write("                  </table>\n");
      out.write("                  \n");
      out.write("                  <h4> Refund Confirmation</h4>\n");
      out.write("                  <h3> Are you sure you want to refund the requested amount on account number \"----\" </h3>\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("           </div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Register</button>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("                              \n");
      out.write("                            </td>\n");
      out.write("                          </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                </table>\n");
      out.write("            \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                              \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("              <div class=\"panel-footer\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col col-xs-4\">Page 1 of 5\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col col-xs-8\">\n");
      out.write("                    <ul class=\"pagination hidden-xs pull-right\">\n");
      out.write("                      <li><a href=\"#\">1</a></li>\n");
      out.write("                      <li><a href=\"#\">2</a></li>\n");
      out.write("                      <li><a href=\"#\">3</a></li>\n");
      out.write("                      <li><a href=\"#\">4</a></li>\n");
      out.write("                      <li><a href=\"#\">5</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"pagination visible-xs pull-right\">\n");
      out.write("                        <li><a href=\"#\">«</a></li>\n");
      out.write("                        <li><a href=\"#\">»</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("</div></div></div>\n");
      out.write("        \n");
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
