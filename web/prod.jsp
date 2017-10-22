<%-- 
    Document   : prod
    Created on : Mar 23, 2017, 3:15:02 AM
    Author     : DELL
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>Bootstrap demo</title>
   
        <!-- Css For Bootstrap-->
        <link href="css/bootstrap.min.css" rel="stylesheet"/>

        <!-- JS For Bootstrap-->
        <script src="jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.js"></script>
        <link rel="stylesheet" type="text/css" href="engine1/style.css" />
        <script type="text/javascript" src="engine1/jquery.js"></script>
    <style>
  
   #main
 
    {
    height:auto;
 
    }


   #content
  
   {
      
       height:500px;

    }

   
   #content1
     {
   
       height:500px;

       background-color:lightgoldenrodyellow;
 
    }
 
   #content1a
    {
       height:400px;
       background-color:white;
       border-radius:40px;
       margin-top:4%;
    }
   #content2
  
   {
     height:500px;
    background-color:white;
    }

  </style>
  <link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="themes/default/default.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/light/light.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/dark/dark.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/bar/bar.css" type="text/css" media="screen" />
<link rel="stylesheet" href="nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" href="demo/style.css" type="text/css" media="screen" />


 </head>


 <body>

 <%@include  file="nav.jsp"%>

  <div id="main" class="container">
  
       <div class="container">
	
    <div id="content" class="row">
  
 
    	<div id="content1" class="col-md-5">
            <div id="content1a" class="col-md-12">
                <div id="wowslider-container1">
<div class="ws_images"><ul>
		<li><img src="images/mobiles.jpg" alt="bikes" title="mobile" id="wows1_0"/></li>
		<li><img src="images/mobiles.jpg" alt="books" title="mobile" id="wows1_1"/></li>
		<li><img src="images/mobiles.jpg" alt="cars" title="mobile" id="wows1_2"/></li>
		<li><img src="images/mobiles.jpg" alt="electronics" title="mobile" id="wows1_3"/></li>
		<li><img src="images/mobiles.jpg" alt="fashion" title="mobile" id="wows1_4"/></li>
		<!--<li><a href="http://wowslider.com"><img src="images/furniture.jpg" alt="wowslider" title="mobile" id="wows1_5"/></a></li>-->
		<li><img src="images/mobiles.jpg" alt="mobiles" title="mobiles" id="wows1_6"/></li>
	</ul></div>
	<div class="ws_bullets">
            <div>
		<a href="#"><span><img src="images/mobiles.jpg" alt="bikes"/>1</span></a>
		<a href="#"><span><img src="images/mobiles.jpg" alt="books"/>2</span></a>
		<a href="#"><span><img src="images/mobiles.jpg" alt="cars"/>3</span></a>
		<a href="#"><span><img src="images/mobiles.jpg" alt="electronics"/>4</span></a>
		<a href="#"><span><img src="images/mobiles.jpg" alt="fashion"/>5</span></a>
		<a href="#"><span><img src="images/mobiles.jpg" alt="furniture"/>6</span></a>
		<a href="#"><span><img src="images/mobiles.jpg" alt="mobiles"/>7</span></a>
	</div>
        </div>
        <!--<div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.com">http://wowslider.com/</a> by WOWSlider.com v8.7</div>-->

</div>	
<script type="text/javascript" src="engine1/wowslider.js"></script>
<script type="text/javascript" src="engine1/script.js"></script>
       
  </div>
           <center> <p>1>2>3>4</p></center><br>
</div>
  

<div id="content2" class="col-md-7">

<br>
<center><h3>Product description</h3></center>
    <h2>.</h2><br>
    <h2>.</h2><br>
    <h2>.</h2>
    
   <!--<p>xyz pieces available in stock </p>-->
    <!--Dropdown field-->
   <center>
       <br>
  <label>Quantity</label> 
  <select name="" id="">
    <option value="0">select Quantity</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
  </select> 
  <br> 
    <br>
    <a href="address.jsp"><div class="btn btn-success">Buy</div></a>
     <div class="btn btn-danger">Chat</div>
   </center>
</div>
   
   </div>
          <br>
    <div class ="panel panel-info">
              <div class ="panel-heading">
                    <h4 class ="panel-title">
                        <a href="#data1" data-toggle="collapse" data-parent="#accordion"><center>VIEW FEEDBACK</center></a>
                    </h4>
              </div>
        <div id="data1" class="panel-collapse collapse">
            <div class="panel-body">
                The first review by the user.
            </div>
        </div> 
    </div>
                                  
 </div>
  </div>    
 <%@include file="footerup.jsp" %>
 <%@include file="footer.jsp" %>

  </body>

</html>

