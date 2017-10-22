package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import org.apache.tomcat.util.http.fileupload.FileItem;
import java.util.Iterator;
import java.util.List;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import java.util.ArrayList;

public final class prod_005fupld_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <link href='http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css' rel='stylesheet' type='text/css'>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <link href='//cdnjs.cloudflare.com/ajax/libs/bootstrap-switch/1.8/css/bootstrap-switch.css' rel='stylesheet' type='text/css'>\n");
      out.write("  <link href='http://davidstutz.github.io/bootstrap-multiselect/css/bootstrap-multiselect.css' rel='stylesheet' type='text/css'>\n");
      out.write("  <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js' type='text/javascript'></script>\n");
      out.write("  <script src='//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.2.0/js/bootstrap-datepicker.min.js' type='text/javascript'></script>\n");
      out.write("  <script src='//cdnjs.cloudflare.com/ajax/libs/bootstrap-switch/1.8/js/bootstrap-switch.min.js' type='text/javascript'></script>\n");
      out.write("  <script src='http://davidstutz.github.io/bootstrap-multiselect/js/bootstrap-multiselect.js' type='text/javascript'></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("   \n");
      out.write(".dialog-panel {\n");
      out.write("  margin: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-body {\n");
      out.write("\n");
      out.write("  font: 600 15px \"Open Sans\", Arial, sans-serif;   \n");
      out.write("}\n");
      out.write("label.control-label {\n");
      out.write("  font-weight: 600;\n");
      out.write("  color: #777;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-submenu {\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-submenu>.dropdown-menu {\n");
      out.write("    top: 0;\n");
      out.write("    left: 100%;\n");
      out.write("    margin-top: -6px;\n");
      out.write("    margin-left: -1px;\n");
      out.write("    -webkit-border-radius: 0 6px 6px 6px;\n");
      out.write("    -moz-border-radius: 0 6px 6px;\n");
      out.write("    border-radius: 0 6px 6px 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-submenu:hover>.dropdown-menu {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-submenu>a:after {\n");
      out.write("    display: block;\n");
      out.write("    content: \" \";\n");
      out.write("    float: right;\n");
      out.write("    width: 0;\n");
      out.write("    height: 0;\n");
      out.write("    border-color: transparent;\n");
      out.write("    border-style: solid;\n");
      out.write("    border-width: 5px 0 5px 5px;\n");
      out.write("    border-left-color: #ccc;\n");
      out.write("    margin-top: 5px;\n");
      out.write("    margin-right: -10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*.dropdown-submenu:hover>a:after {\n");
      out.write("    border-left-color: #fff;\n");
      out.write("}*/\n");
      out.write("\n");
      out.write("/*.dropdown-submenu.pull-left {\n");
      out.write("    float: none;\n");
      out.write("}*/\n");
      out.write("\n");
      out.write("/*.dropdown-submenu.pull-left>.dropdown-menu {\n");
      out.write("    left: -100%;\n");
      out.write("    margin-left: 10px;\n");
      out.write("    -webkit-border-radius: 6px 0 6px 6px;\n");
      out.write("    -moz-border-radius: 6px 0 6px 6px;\n");
      out.write("    border-radius: 6px 0 6px 6px;\n");
      out.write("}*/\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("    ");
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
      out.write("  <div class='container'>\n");
      out.write("    <div class='panel panel-primary dialog-panel'>\n");
      out.write("      <div class='panel-heading'>\n");
      out.write("        <h5>Product Details</h5>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("      <div class='panel-body'>\n");
      out.write("          <form class='form-horizontal' role='form' action=\"prod_upldtask.jsp\" method=\"post\">\n");
      out.write("            <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_title'>User Id</label>\n");
      out.write("            <div class='col-md-8'>\n");
      out.write("                <label> ");
out.println(  
     request.getSession().getAttribute("user_id"));
      
      out.write("  </label>\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <!--\n");
      out.write("            <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_title'>Product Id</label>\n");
      out.write("            <div class='col-md-8'>\n");
      out.write("            <label>~Auto-generated~</label>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            -->\n");
      out.write("            \n");
      out.write("            <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_title'>Product Name</label>\n");
      out.write("            <div class='col-md-8'>\n");
      out.write("             <input type=\"text\"/>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("          <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_accomodation'>Product category</label>\n");
      out.write("            <div class='col-md-2'>\n");
      out.write("<!--               \t<div class=\"row\">\n");
      out.write("        \n");
      out.write("        <div class=\"dropdown\">\n");
      out.write("            <a id=\"dLabel\" role=\"button\" data-toggle=\"dropdown\" class=\"btn btn-primary\" data-target=\"#\" href=\"/page.html\">\n");
      out.write("                Dropdown <span class=\"caret\"></span>\n");
      out.write("            </a>\n");
      out.write("            \n");
      out.write("    \t\t<ul class=\"dropdown-menu multi-level\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\n");
      out.write("              <li><a href=\"#\">Some action</a></li>\n");
      out.write("              <li><a href=\"#\">Some other action</a></li>\n");
      out.write("              <li class=\"divider\"></li>\n");
      out.write("              <li class=\"dropdown-submenu\">\n");
      out.write("                <a tabindex=\"-1\" href=\"#\">Hover me for more options</a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                  \n");
      out.write("                  <li class=\"dropdown-submenu\">\n");
      out.write("                    <a href=\"#\">Even More..</a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"#\">3rd level</a></li>\n");
      out.write("                    \t\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\t</div>-->\n");
      out.write("<select class='form-control' id='id_accomodation'>\n");
      out.write("                <option>Mobiles</option>\n");
      out.write("                <option>Electronics</option>\n");
      out.write("                <option>Cars</option>\n");
      out.write("                <option>Bikes</option>\n");
      out.write("                <option>Furniture</option>\n");
      out.write("                <option>Books & Stationary</option>\n");
      out.write("                <option>Fashion</option>\n");
      out.write("                <option>Home Appliances</option>\n");
      out.write("                <option>Kids Section</option>\n");
      out.write("              </select>\n");
      out.write("</div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <div class='form-group'>\n");
      out.write("             \n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_adults'>Product Type</label>\n");
      out.write("            \n");
      out.write("                        <div class='col-md-8'>\n");
      out.write("            <label class=\"radio-inline\"><input type=\"radio\" name=\"optradio\">New</label>\n");
      out.write("            <label class=\"radio-inline\"><input type=\"radio\" name=\"optradio\">Old</label>\n");
      out.write("            \n");
      out.write("                       </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("<!-- try{   \n");
      out.write("   DiskFileItemFactory factory = new DiskFileItemFactory();\n");
      out.write("   ServletFileUpload upload = new ServletFileUpload(factory);\n");
      out.write("   List fileItems = upload.parseRequest(request);\n");
      out.write("   Iterator itr = fileItems.iterator();\n");
      out.write("   while(itr.hasNext())\n");
      out.write("   {\n");
      out.write("     FileItem field = (FileItem)itr.next();\n");
      out.write("     if(!field.isFormField())\n");
      out.write("     {\n");
      out.write("       String field_name = field.getFieldName();\n");
      out.write("       String image = field.getName();\n");
      out.write("       String path =getServletContext().getRealPath(\"/\")+\"images/\"+image; \n");
      out.write("       field.write(new File(path));\n");
      out.write("       \n");
      out.write("       out.print(\"File upload successfully...\"+\"<br>\");\n");
      out.write("       out.print(path);\n");
      out.write("     }\n");
      out.write("             \n");
      out.write("   }\n");
      out.write(" }\n");
      out.write(" catch(Exception e)\n");
      out.write(" {\n");
      out.write("   response.getWriter().print(e);\n");
      out.write(" }-->\n");
      out.write("\n");
      out.write("          <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_email'>Product Image</label>\n");
      out.write("           <div class='col-md-2'>\n");
      out.write("               Select File to Upload:<input type=\"file\" name=\"fileName\" id=\"file\" multiple=\"\">\n");
      out.write("              <br>\n");
      out.write("               <input type=\"submit\" value=\"Upload\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("           <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_email'>Price</label>\n");
      out.write("           <div class='col-md-2'>\n");
      out.write("             <input type=\"text\"/>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_accomodation'>Brand</label>\n");
      out.write("            <div class='col-md-2'>\n");
      out.write("              <select class='form-control' id='id_accomodation'>\n");
      out.write("                <option></option>\n");
      out.write("                <option></option>\n");
      out.write("                <option></option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("           <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_accomodation'>Quantity</label>\n");
      out.write("            <div class='col-md-2'>\n");
      out.write("              <select class='form-control' id='id_accomodation'>\n");
      out.write("                <option>0</option>\n");
      out.write("                <option>1</option>\n");
      out.write("                <option>2</option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("            <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_accomodation'>Product Visibility</label>\n");
      out.write("            <div class='col-md-2'>\n");
      out.write("              <select class='form-control' id='id_accomodation'>\n");
      out.write("                \n");
      out.write("                <option>Yes</option>\n");
      out.write("                <option>Not yet</option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("          <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_pets'>Description</label>\n");
      out.write("            <div class='col-md-4'><textarea  rows=\"5\" placeholder=\"Please insert detailed information about your product here..\"></textarea></div>\n");
      out.write("          </div>\n");
      out.write("<!--          <div class='form-group'>\n");
      out.write("            <label class='control-label col-md-2 col-md-offset-2' for='id_comments'>Comments</label>\n");
      out.write("            <div class='col-md-6'>\n");
      out.write("              <textarea class='form-control' id='id_comments' placeholder='Additional comments' rows='3'></textarea>\n");
      out.write("            </div>\n");
      out.write("          </div>-->\n");
      out.write("          <div class='form-group'>\n");
      out.write("            <div class='col-md-offset-4 col-md-3'>\n");
      out.write("              <button class='btn btn-lg btn-primary' type='submit'>Post</button>\n");
      out.write("            </div>\n");
      out.write("<!--            <div class='col-md-3'>\n");
      out.write("              <button class='btn-lg btn-danger' style='float:right' type='submit'>Cancel</button>\n");
      out.write("            </div>-->\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("      ");
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
      out.write("          \n");
      out.write("</body>");
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
