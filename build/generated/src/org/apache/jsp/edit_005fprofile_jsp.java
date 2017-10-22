package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <script src=\"js/jquery.js\"></script>\n");
      out.write("\t  \n");
      out.write("          <script>\n");
      out.write("              $(function () {\n");
      out.write("    $('.button-checkbox').each(function () {\n");
      out.write("\n");
      out.write("        // Settings\n");
      out.write("        var $widget = $(this),\n");
      out.write("            $button = $widget.find('button'),\n");
      out.write("            $checkbox = $widget.find('input:checkbox'),\n");
      out.write("            color = $button.data('color'),\n");
      out.write("            settings = {\n");
      out.write("                on: {\n");
      out.write("                    icon: 'glyphicon glyphicon-check'\n");
      out.write("                },\n");
      out.write("                off: {\n");
      out.write("                    icon: 'glyphicon glyphicon-unchecked'\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("\n");
      out.write("        // Event Handlers\n");
      out.write("        $button.on('click', function () {\n");
      out.write("            $checkbox.prop('checked', !$checkbox.is(':checked'));\n");
      out.write("            $checkbox.triggerHandler('change');\n");
      out.write("            updateDisplay();\n");
      out.write("        });\n");
      out.write("        $checkbox.on('change', function () {\n");
      out.write("            updateDisplay();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Actions\n");
      out.write("        function updateDisplay() {\n");
      out.write("            var isChecked = $checkbox.is(':checked');\n");
      out.write("\n");
      out.write("            // Set the button's state\n");
      out.write("            $button.data('state', (isChecked) ? \"on\" : \"off\");\n");
      out.write("\n");
      out.write("            // Set the button's icon\n");
      out.write("            $button.find('.state-icon')\n");
      out.write("                .removeClass()\n");
      out.write("                .addClass('state-icon ' + settings[$button.data('state')].icon);\n");
      out.write("\n");
      out.write("            // Update the button's color\n");
      out.write("            if (isChecked) {\n");
      out.write("                $button\n");
      out.write("                    .removeClass('btn-default')\n");
      out.write("                    .addClass('btn-' + color + ' active');\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                $button\n");
      out.write("                    .removeClass('btn-' + color + ' active')\n");
      out.write("                    .addClass('btn-default');\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Initialization\n");
      out.write("        function init() {\n");
      out.write("\n");
      out.write("            updateDisplay();\n");
      out.write("\n");
      out.write("            // Inject the icon if applicable\n");
      out.write("            if ($button.find('.state-icon').length == 0) {\n");
      out.write("                $button.prepend('<i class=\"state-icon ' + settings[$button.data('state')].icon + '\"></i>');\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        init();\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("              \n");
      out.write("          </script>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <style>\n");
      out.write("          #logopic\n");
      out.write("           {\n");
      out.write("               float:left;\n");
      out.write("               padding:2%;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           #main\n");
      out.write(" \n");
      out.write("    {\n");
      out.write("    height:auto;\n");
      out.write(" \n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("   #content\n");
      out.write("  \n");
      out.write("   {\n");
      out.write("      \n");
      out.write("       height:500px;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("   \n");
      out.write("   #content1\n");
      out.write("     {\n");
      out.write("   \n");
      out.write("       height:300px;\n");
      out.write("\n");
      out.write("       background-color:lightgoldenrodyellow;\n");
      out.write(" \n");
      out.write("    }\n");
      out.write(" \n");
      out.write("   #content1a\n");
      out.write("    {\n");
      out.write("       height:200px;\n");
      out.write("       background-color:white;\n");
      out.write("       border-radius:40px;\n");
      out.write("       margin-top:4%;\n");
      out.write("    }\n");
      out.write("   #content2\n");
      out.write("  \n");
      out.write("   {\n");
      out.write("     height:500px;\n");
      out.write("    background-color:white;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Credit to bootsnipp.com for the css for the color graph */\n");
      out.write(".colorgraph {\n");
      out.write("  height: 5px;\n");
      out.write("  border-top: 0;\n");
      out.write("  background: #c4e17f;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("}\n");
      out.write("\n");
      out.write("           </style>\n");
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
      out.write("         \n");
      out.write("<div id=\"main\" class=\"container\">\n");
      out.write("  <div id=\"content\" class=\"row\">\n");
      out.write("  \n");
      out.write(" \n");
      out.write("    \t\n");
      out.write("  \n");
      out.write("\n");
      out.write("<div id=\"content2\" class=\"col-md-11\">\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3\">\n");
      out.write("\t\t<form role=\"form\">\n");
      out.write("\t\t\t<h2>Edit Profile <small> Update your information</small></h2>\n");
      out.write("\t\t\t<hr class=\"colorgraph\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                            \n");
      out.write("                                            <label for=\"Name\"> User id : </label>\n");
      out.write("                                            ");
 out.println(request.getSession().getAttribute("Userid"));
      out.write("\n");
      out.write("                                            <br> <br>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            <label for=\"Name\"> Email id : </label>\n");
      out.write("                                            ");
 out.println(request.getSession().getAttribute("email"));
      out.write("\n");
      out.write("                                            <br> <br>\n");
      out.write("                                            \n");
      out.write("                                           \n");
      out.write("                                            <input type=\"text\" name=\"display_name\" id=\"display_name\" class=\"form-control input-lg\" placeholder=\"Username\" tabindex=\"4\">\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t<!--<label for=\"Name\"> Username : </label>-->\n");
      out.write("                                      <br>\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<!--<input type=\"text\" name=\"last_name\" id=\"last_name\" class=\"form-control input-lg\" placeholder=\"Last Name\" tabindex=\"2\">-->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t  <input type=\"text\" name=\"display_name\" id=\"display_name\" class=\"form-control input-lg\" placeholder=\"Address\" tabindex=\"3\">\n");
      out.write("\t\t\t<!--<label for=\"Address\">Address :</label>-->\n");
      out.write("                       \n");
      out.write("                        <br>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<input type=\"email\" name=\"contact\" id=\"email\" class=\"form-control input-lg\" placeholder=\"Contact\" tabindex=\"4\">\n");
      out.write("\t\t\t<!--<label for=\"Contact\">Contact :</label>-->\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("\t\t\t\t<!--<input type=\"email\" name=\"email\" id=\"email\" class=\"form-control input-lg\" placeholder=\"Email Address\" tabindex=\"4\">-->\n");
      out.write("\t\t\t<!--<label for=\"Email\">Email Address :</label>-->\n");
      out.write("                       \n");
      out.write("                        <br>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-4 col-sm-3 col-md-3\">\n");
      out.write("\t\t\t\t\t<span class=\"button-checkbox\">\n");
      out.write("\t\t\t\t\t\t<!--<button type=\"button\" class=\"btn\" data-color=\"info\" tabindex=\"7\">I Agree</button>-->\n");
      out.write("                        <input type=\"checkbox\" name=\"t_and_c\" id=\"t_and_c\" class=\"hidden\" value=\"1\">\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<hr class=\"colorgraph\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-md-6\"><input type=\"submit\" value=\"Save Changes\" class=\"btn btn-primary btn-block btn-lg\" tabindex=\"7\"></div>\n");
      out.write("\t\t\t\t<!--<div class=\"col-xs-12 col-md-6\"><a href=\"#\" class=\"btn btn-success btn-block btn-lg\">Save Changes</a></div>-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"t_and_c_m\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t<div class=\"modal-dialog modal-lg\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Terms & Conditions</h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t<!--<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">I Agree</button>-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!-- /.modal-content -->\n");
      out.write("\t</div><!-- /.modal-dialog -->\n");
      out.write("</div><!-- /.modal -->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("   </div>\n");
      out.write("          <br>\n");
      out.write("                     \n");
      out.write(" </div>\n");
      out.write("  </div>    \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write(" \n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("   ");
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
