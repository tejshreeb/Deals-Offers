package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footerup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            #footerup\n");
      out.write("     {\n");
      out.write("       background-color:navy;\n");
      out.write("       height:10%;\n");
      out.write("       padding: 0%;\n");
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
