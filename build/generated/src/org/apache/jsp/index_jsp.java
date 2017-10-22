package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/nav.jsp");
    _jspx_dependants.add("/content.jsp");
    _jspx_dependants.add("/footerup.jsp");
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
      out.write("    \n");
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
      out.write("        ");
      out.write("<style>\n");
      out.write("    .well\n");
      out.write("    {\n");
      out.write("        background-image: url(\"images/wellbg3.jpg\");\n");
      out.write("    }\n");
      out.write("    .body{\n");
      out.write("        background-color: lightgray;\n");
      out.write("    }\n");
      out.write("    .container\n");
      out.write("    {\n");
      out.write("        //background-color: lightgrey;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("/*    #res\n");
      out.write("      {\n");
      out.write("          background-color: transparent;\n");
      out.write("          width: 250px;\n");
      out.write("          border-radius: 5px; \n");
      out.write("      }\n");
      out.write("      #tags\n");
      out.write("      {\n");
      out.write("          width: 250px;\n");
      out.write("      }*/\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("     <script>\n");
      out.write("//  $(function() {\n");
      out.write("//       $(\"#tags\").keyup(function(){//alert(\"aaa\");\n");
      out.write("//            gettext=$(\"#tags\").val();\n");
      out.write("//            $.ajax({\n");
      out.write("//               url: \"prod.jsp\", \n");
      out.write("//               type:\"GET\",\n");
      out.write("//               data:\"gettext=\"+gettext,\n");
      out.write("//               success: function(result) {\n");
      out.write("//                        $(\"#res\").html(result);\n");
      out.write("//                    }\n");
      out.write("//            });\n");
      out.write("//           });\n");
      out.write("//      });\n");
      out.write("//     function data(a)\n");
      out.write("//     {\n");
      out.write("//          document.getElementById(\"tags\").value=a;\n");
      out.write("//         \n");
      out.write("//     }\n");
      out.write("//$( function() {\n");
      out.write("//    var availableTags = [\n");
      out.write("//       $(\"#tags\").keyup(function(){//alert(\"aaa\");\n");
      out.write("//            gettext=$(\"#tags\").val();\n");
      out.write("//            $.ajax({\n");
      out.write("//              url: \"takearea.jsp\", \n");
      out.write("//               type:\"GET\",\n");
      out.write("//               data:\"gettext=\"+gettext,\n");
      out.write("//               success: function(result) {\n");
      out.write("//                        $(\"#res\").html(result);\n");
      out.write("//                    }\n");
      out.write("//            });\n");
      out.write("//           });\n");
      out.write("//    ];\n");
      out.write("//    $( \"#tags\" ).autocomplete({\n");
      out.write("//      source: availableTags\n");
      out.write("//    });\n");
      out.write("//    } );\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("    \n");
      out.write("    <body class=\"body\" >    \n");
      out.write("<div class=\"container\">\n");
      out.write("\t<form align=\"center\">\n");
      out.write("         <div class=\"well well-lg\">             \n");
      out.write("\t  <div class=\"form-group form-group-lg\">              \n");
      out.write("              <br>\n");
      out.write("   <input type=\"text\" class=\"form-control\" id=\"tags\" placeholder=\"Enter your wish here...\"></br>\n");
      out.write("   <a href=\"#\" class=\"btn btn-info btn-lg\"><span class=\"glyphicon glyphicon-search\"></span> Search</a>\n");
      out.write("\t\t\t</div>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("    <!--<a href=\"#\" id=\"diva\" onclick=\"data(res.innerHTML)\">  <div id=\"res\"></div></a>-->\n");
      out.write("\t<div class=\"row\" align=\"center\">\n");
      out.write("\t  <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"search_result.jsp\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>Mobiles</p> \n");
      out.write("\t\t  <img src=\"images/mobiles.jpg\" alt=\"Pulpit Rock\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"#\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>Electronics </p>\n");
      out.write("\t\t  <img src=\"images/images.jpg\" alt=\"Moustiers Sainte Marie\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"#\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>Cars</p> \n");
      out.write("\t\t  <img src=\"images/cars.jpg\" alt=\"Cinque Terre\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"#\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>Bikes</p> \n");
      out.write("\t\t  <img src=\"images/bikes.jpg\" alt=\"Cinque Terre\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"#\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>Furniture</p> \n");
      out.write("\t\t  <img src=\"images/furniture.jpg\" alt=\"Cinque Terre\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"#\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>Books & Staionary</p> \n");
      out.write("\t\t  <img src=\"images/books.jpg\" alt=\"Cinque Terre\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"#\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>Fashion</p> \n");
      out.write("\t\t  <img src=\"images/fashion.jpg\" alt=\"Cinque Terre\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"#\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>Home Appliances</p> \n");
      out.write("\t\t  <img src=\"images/h1.jpg\" alt=\"Cinque Terre\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("\t\t<a href=\"#\" class=\"thumbnail\">\n");
      out.write("\t\t  <p>kids section</p> \n");
      out.write("\t\t  <img src=\"images/k1.jpg\" alt=\"Cinque Terre\" style=\"width:150px;height:150px\">\n");
      out.write("\t\t</a>\n");
      out.write("\t  </div>\n");
      out.write("            \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            #footerup\n");
      out.write("     {\n");
      out.write("       background-color:navy;\n");
      out.write("       height:10%;\n");
      out.write("       margin:0% 0% 0% 0%;\n");
      out.write("     }\n");
      out.write("    #brands\n");
      out.write("        {\n");
      out.write("        margin:1% 1% 1% 1%;\n");
      out.write("        height:58%;\n");
      out.write("        width:6%;\n");
      out.write("        }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <div id=\"footerup\" class=\"row\">\n");
      out.write("           <div class=\"col-md-12\">\n");
      out.write("\t<marquee scrollment=\"0\">\n");
      out.write("\t<img id=\"brands\" src=\"images/mcd.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/adidas.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/Nestle.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/ori.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/domi.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/lakme.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/rayban.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/pantaloons.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/westside.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/c.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/fab.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/kfc.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/lg.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/Reebok.jpg\"/>\n");
      out.write("\t<img id=\"brands\" src=\"images/s.jpg\"/>\n");
      out.write("\t</marquee>\n");
      out.write("\t</div>\n");
      out.write("   </div>\n");
      out.write("  \n");
      out.write("</html>\n");
      out.write("\n");
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
