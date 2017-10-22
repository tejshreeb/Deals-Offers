package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
