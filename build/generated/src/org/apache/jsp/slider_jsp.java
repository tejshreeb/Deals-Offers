package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slider_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wowslider-container1\">\n");
      out.write("<div class=\"ws_images\"><ul>\n");
      out.write("\t\t<li><img src=\"images/bikes.jpg\" alt=\"bikes\" title=\"bikes\" id=\"wows1_0\"/></li>\n");
      out.write("\t\t<li><img src=\"images/books.jpg\" alt=\"books\" title=\"books\" id=\"wows1_1\"/></li>\n");
      out.write("\t\t<li><img src=\"images/cars.jpg\" alt=\"cars\" title=\"cars\" id=\"wows1_2\"/></li>\n");
      out.write("\t\t<li><img src=\"images/electronics.jpg\" alt=\"electronics\" title=\"electronics\" id=\"wows1_3\"/></li>\n");
      out.write("\t\t<li><img src=\"images/fashion.jpg\" alt=\"fashion\" title=\"fashion\" id=\"wows1_4\"/></li>\n");
      out.write("\t\t<li><a href=\"http://wowslider.com\"><img src=\"images/furniture.jpg\" alt=\"wowslider\" title=\"furniture\" id=\"wows1_5\"/></a></li>\n");
      out.write("\t\t<li><img src=\"data1/images/mobiles.jpg\" alt=\"mobiles\" title=\"mobiles\" id=\"wows1_6\"/></li>\n");
      out.write("\t</ul></div>\n");
      out.write("\t<div class=\"ws_bullets\"><div>\n");
      out.write("\t\t<a href=\"#\" title=\"bikes\"><span><img src=\"bikes.jpg\" alt=\"bikes\"/>1</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"books\"><span><img src=\"books.jpg\" alt=\"books\"/>2</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"cars\"><span><img src=\"cars.jpg\" alt=\"cars\"/>3</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"electronics\"><span><img src=\"electronics.jpg\" alt=\"electronics\"/>4</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"fashion\"><span><img src=\"fashion.jpg\" alt=\"fashion\"/>5</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"furniture\"><span><img src=\"furniture.jpg\" alt=\"furniture\"/>6</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"mobiles\"><span><img src=\"mobiles.jpg\" alt=\"mobiles\"/>7</span></a>\n");
      out.write("\t</div></div><div class=\"ws_script\" style=\"position:absolute;left:-99%\"><a href=\"http://wowslider.com\">http://wowslider.com/</a> by WOWSlider.com v8.7</div>\n");
      out.write("<div class=\"ws_shadow\"></div>\n");
      out.write("</div>\t\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/wowslider.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"engine1/script.js\"></script>\n");
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
