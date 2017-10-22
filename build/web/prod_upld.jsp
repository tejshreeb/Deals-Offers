
<%@page import="java.io.File"%>
<%@page import="org.apache.tomcat.util.http.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.util.ArrayList"%>
<head>
  <link href='http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css' rel='stylesheet' type='text/css'>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <link href='//cdnjs.cloudflare.com/ajax/libs/bootstrap-switch/1.8/css/bootstrap-switch.css' rel='stylesheet' type='text/css'>
  <link href='http://davidstutz.github.io/bootstrap-multiselect/css/bootstrap-multiselect.css' rel='stylesheet' type='text/css'>
  <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js' type='text/javascript'></script>
  <script src='//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.2.0/js/bootstrap-datepicker.min.js' type='text/javascript'></script>
  <script src='//cdnjs.cloudflare.com/ajax/libs/bootstrap-switch/1.8/js/bootstrap-switch.min.js' type='text/javascript'></script>
  <script src='http://davidstutz.github.io/bootstrap-multiselect/js/bootstrap-multiselect.js' type='text/javascript'></script>

<style>
   
.dialog-panel {
  margin: 20px;
}

.panel-body {

  font: 600 15px "Open Sans", Arial, sans-serif;   
}
label.control-label {
  font-weight: 600;
  color: #777;
}

.dropdown-submenu {
    position: relative;
}

.dropdown-submenu>.dropdown-menu {
    top: 0;
    left: 100%;
    margin-top: -6px;
    margin-left: -1px;
    -webkit-border-radius: 0 6px 6px 6px;
    -moz-border-radius: 0 6px 6px;
    border-radius: 0 6px 6px 6px;
}

.dropdown-submenu:hover>.dropdown-menu {
    display: block;
}

.dropdown-submenu>a:after {
    display: block;
    content: " ";
    float: right;
    width: 0;
    height: 0;
    border-color: transparent;
    border-style: solid;
    border-width: 5px 0 5px 5px;
    border-left-color: #ccc;
    margin-top: 5px;
    margin-right: -10px;
}

/*.dropdown-submenu:hover>a:after {
    border-left-color: #fff;
}*/

/*.dropdown-submenu.pull-left {
    float: none;
}*/

/*.dropdown-submenu.pull-left>.dropdown-menu {
    left: -100%;
    margin-left: 10px;
    -webkit-border-radius: 6px 0 6px 6px;
    -moz-border-radius: 6px 0 6px 6px;
    border-radius: 6px 0 6px 6px;
}*/
    </style>
</head>
<body>
   
    <%@include file="nav.jsp" %>
  <div class='container'>
    <div class='panel panel-primary dialog-panel'>
      <div class='panel-heading'>
        <h5>Product Details</h5>
      </div>
     
      <div class='panel-body'>
          <form class='form-horizontal' role='form' action="prod_upldtask.jsp" method="post">
            <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_title'>User Id</label>
            <div class='col-md-8'>
                <label> <%out.println(  
     request.getSession().getAttribute("user_id"));
      %>  </label>
              </div>
            
            </div>
            <!--
            <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_title'>Product Id</label>
            <div class='col-md-8'>
            <label>~Auto-generated~</label>
              </div>
            </div>
            -->
            
            <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_title'>Product Name</label>
            <div class='col-md-8'>
             <input type="text"/>
              </div>
            </div>
          
          <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_accomodation'>Product category</label>
            <div class='col-md-2'>
<!--               	<div class="row">
        
        <div class="dropdown">
            <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary" data-target="#" href="/page.html">
                Dropdown <span class="caret"></span>
            </a>
            
    		<ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
              <li><a href="#">Some action</a></li>
              <li><a href="#">Some other action</a></li>
              <li class="divider"></li>
              <li class="dropdown-submenu">
                <a tabindex="-1" href="#">Hover me for more options</a>
                <ul class="dropdown-menu">
                  
                  <li class="dropdown-submenu">
                    <a href="#">Even More..</a>
                    <ul class="dropdown-menu">
                        <li><a href="#">3rd level</a></li>
                    	
                    </ul>
                  </li>
                  
                </ul>
              </li>
            </ul>
        </div>
	</div>-->
<select class='form-control' id='id_accomodation'>
                <option>Mobiles</option>
                <option>Electronics</option>
                <option>Cars</option>
                <option>Bikes</option>
                <option>Furniture</option>
                <option>Books & Stationary</option>
                <option>Fashion</option>
                <option>Home Appliances</option>
                <option>Kids Section</option>
              </select>
</div>
              
            </div>
          
          
          <div class='form-group'>
             
            <label class='control-label col-md-2 col-md-offset-2' for='id_adults'>Product Type</label>
            
                        <div class='col-md-8'>
            <label class="radio-inline"><input type="radio" name="optradio">New</label>
            <label class="radio-inline"><input type="radio" name="optradio">Old</label>
            
                       </div>
          </div>
            
            
            
<!-- try{   
   DiskFileItemFactory factory = new DiskFileItemFactory();
   ServletFileUpload upload = new ServletFileUpload(factory);
   List fileItems = upload.parseRequest(request);
   Iterator itr = fileItems.iterator();
   while(itr.hasNext())
   {
     FileItem field = (FileItem)itr.next();
     if(!field.isFormField())
     {
       String field_name = field.getFieldName();
       String image = field.getName();
       String path =getServletContext().getRealPath("/")+"images/"+image; 
       field.write(new File(path));
       
       out.print("File upload successfully..."+"<br>");
       out.print(path);
     }
             
   }
 }
 catch(Exception e)
 {
   response.getWriter().print(e);
 }-->

          <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_email'>Product Image</label>
           <div class='col-md-2'>
               Select File to Upload:<input type="file" name="fileName" id="file" multiple="">
              <br>
               <input type="submit" value="Upload">
            </div>
          </div>
           <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_email'>Price</label>
           <div class='col-md-2'>
             <input type="text"/>
              </div>
          </div>
            
            
           <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_accomodation'>Brand</label>
            <div class='col-md-2'>
              <select class='form-control' id='id_accomodation'>
                <option></option>
                <option></option>
                <option></option>
              </select>
            </div>
          </div>
           <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_accomodation'>Quantity</label>
            <div class='col-md-2'>
              <select class='form-control' id='id_accomodation'>
                <option>0</option>
                <option>1</option>
                <option>2</option>
              </select>
            </div>
          </div>
            
            <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_accomodation'>Product Visibility</label>
            <div class='col-md-2'>
              <select class='form-control' id='id_accomodation'>
                
                <option>Yes</option>
                <option>Not yet</option>
              </select>
            </div>
          </div>
            
          <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_pets'>Description</label>
            <div class='col-md-4'><textarea  rows="5" placeholder="Please insert detailed information about your product here.."></textarea></div>
          </div>
<!--          <div class='form-group'>
            <label class='control-label col-md-2 col-md-offset-2' for='id_comments'>Comments</label>
            <div class='col-md-6'>
              <textarea class='form-control' id='id_comments' placeholder='Additional comments' rows='3'></textarea>
            </div>
          </div>-->
          <div class='form-group'>
            <div class='col-md-offset-4 col-md-3'>
              <button class='btn btn-lg btn-primary' type='submit'>Post</button>
            </div>
<!--            <div class='col-md-3'>
              <button class='btn-lg btn-danger' style='float:right' type='submit'>Cancel</button>
            </div>-->
          </div>
        </form>
      </div>
    </div>
  </div>
      <%@include file="footer.jsp" %>          
</body>