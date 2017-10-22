package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\n");
      out.write(" \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("    #div1{\n");
      out.write("        background-color:  #2b669a;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    #main{\n");
      out.write("        margin: 0% 15% 1% 15% ;\n");
      out.write("        background-image: url(\"images/bg.jpg\");\n");
      out.write("    }\n");
      out.write("    .body{\n");
      out.write("        /*background-image: url(\"images/bg.jpg\");*/\n");
      out.write("    }\n");
      out.write(" body {\n");
      out.write("    /*padding-top:50px;*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("form { margin: 0px 10px; }\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("  margin-top: 2px;\n");
      out.write("  margin-bottom: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container { max-width: 360px; }\n");
      out.write("\n");
      out.write(".divider {\n");
      out.write("  text-align: center;\n");
      out.write("  margin-top: 20px;\n");
      out.write("  margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".divider hr {\n");
      out.write("  margin: 7px 0px;\n");
      out.write("  width: 35%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left { float: left; }\n");
      out.write("\n");
      out.write(".right { float: right; }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("<br>\n");
      out.write("               <div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"panel panel-primary\">\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t<form method=\"POST\" action=\"#\" role=\"form\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Feedback</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\" for=\"signupName\">Product name</label>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"signupName\" type=\"text\" maxlength=\"50\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\" for=\"signupEmail\">Product Id</label>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"signupEmail\" type=\"text\" maxlength=\"50\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\" for=\"signupEmail\">Refrance Id</label>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"signupEmail\" type=\"text\" maxlength=\"50\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                           \n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("  \n");
      out.write("         </div> \n");
      out.write("         \n");
      out.write("           <div id=\"div1\" class=\"col-md-12\">\n");
      out.write("            \n");
      out.write("<div class =\"panel panel-info\">\n");
      out.write("              <div class =\"panel-heading\">\n");
      out.write("                    <h4 class =\"panel-title\">\n");
      out.write("                        <a href=\"#data1\" data-toggle=\"collapse\" data-parent=\"#accordion\"><center>Are you Satisfied with our product and service..?</center></a>\n");
      out.write("                    </h4>\n");
      out.write("              </div>\n");
      out.write("        <div id=\"data1\" class=\"panel-collapse collapse\">\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("               \n");
      out.write("                \n");
      out.write("              \n");
      out.write("                \n");
      out.write("             <!--selection of option as yes or no-->   \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("        <div class=\"span12\">\n");
      out.write("    \t\t<div class=\"\" id=\"loginModal\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                <h3>Please select one option</h3>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                <div class=\"well\">\n");
      out.write("                  <ul class=\"nav nav-tabs\">\n");
      out.write("                    \n");
      out.write("                    <li class=\"active\"><a href=\"Yes\" data-toggle=\"tab\">Yes</a></li>\n");
      out.write("                    <li><a href=\"No\" data-toggle=\"tab\">No</a></li>\n");
      out.write("                     \n");
      out.write("                  </ul>\n");
      out.write("                  <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                    <div class=\"tab-pane active in\" id=\"login\">\n");
      out.write("                      <form class=\"form-horizontal\" action='' method=\"POST\">\n");
      out.write("                        <fieldset>\n");
      out.write("                          <!--<div id=\"legend\">\n");
      out.write("                            <legend class=\"\">Yes</legend><br>\n");
      out.write("                          </div> -->   \n");
      out.write("                          <div id=\"yes\"  class=\"control-group\">\n");
      out.write("                            <!-- review -->\n");
      out.write("                            <label class=\"control-label\"  for=\"Review\">Write a Review</label><br>\n");
      out.write("                       \n");
      out.write("                        <textarea value=\"Review\" rows=\"4\" class=\"input-xlarge\">\n");
      out.write("                        </textarea>\n");
      out.write("     \n");
      out.write("                          </div>\n");
      out.write("     \n");
      out.write("                         \n");
      out.write("                          <div  class=\"control-group\">\n");
      out.write("                            <!-- Button -->\n");
      out.write("                            <div class=\"controls\">\n");
      out.write("                             <br> <button class=\"btn btn-success\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </fieldset>\n");
      out.write("                      </form>                \n");
      out.write("                    </div>\n");
      out.write("                    <div  id=\"no\"  class=\"tab-pane fade\" id=\"create\">\n");
      out.write("                       \n");
      out.write("                            <form id=\"tab\">\n");
      out.write("                        \n");
      out.write("                          <h4>claim refund </h4>\n");
      out.write("                       <label class=\"control-label\"  for=\"Review\">Write a Review</label><br>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                        <textarea value=\"Review\" rows=\"4\" class=\"input-xlarge\">\n");
      out.write("                        </textarea>\n");
      out.write("                        \n");
      out.write("     \n");
      out.write("                        <div>\n");
      out.write("                          <button class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                      </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                                        \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("\t</div>\n");
      out.write("         \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("     \n");
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
