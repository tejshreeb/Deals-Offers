<html lang="en">
<head>
  <title>nav</title>
	  <link href="css/bootstrap.min.css" rel="stylesheet">
      <script src="js/jquery.js"></script>
	  <script src="js/bootstrap.min.js"></script>
          <style>
          #logopic
           {
               float:left;
               padding:2%;
           }
           
           </style>
</head>
<body>
    
  
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
	  <!--<a href="#" class="pull-left"><img src="images/logo.jpg"></a> -->
          
         <a href="index.jsp"> <img id="logopic" src="images/fevicon.png" height="10%" width="15%" ></a>
          
      <a class="navbar-brand" href="index.jsp"> Deals & Offers</a>
	  <!-- make a image of small size and place it in following line
		<a href='#' class='pull-left brand-font'><img src="images/logo.jpg">Deals & Offers</a>
	  -->
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <!--<ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
      </ul>-->
      <ul class="nav navbar-nav navbar-right">
            <%
              if(request.getSession().getAttribute("user_id")!=null)
                                {
            %>
              
                <li><a href="new_old.jsp" ><b><u> Sell Product </u></b></a></li>
                <%
                                }   
              else{
                  %>
                    <li><a href="login.jsp" ><b><u> Sell Product </u></b></a></li>
                <% }
                %>
	
        
		<li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> 
                            <% 
                                if(request.getSession().getAttribute("name")!=null)
                                {
                                out.println(request.getSession().getAttribute("name"));
                                }
                            %>
                            <span class="caret"></span></a>
            <%
           
            if(request.getSession().getAttribute("user_id")==null)
            {
           %>
                        <ul class="dropdown-menu">
                            
				<li> <a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Log IN </a> </li>
				<li> <a href="registration.jsp"><span class="glyphicon glyphicon-user"></span> Sign UP</a> </li>
			</ul>
		
                <%
                   }
                      else  
                   {
                   
                       %>
                       <ul class="dropdown-menu">
                         
                       
                      
				<li> <a href="user_profile.jsp"><span class="glyphicon glyphicon-log-in"></span> Edit Profile </a> </li>
                                
                         <li> <a href="logout.jsp"> <span class="glyphicon glyphicon-user"></span> Logout</a> </li>
                         <%
                                response.setHeader("Cache-Control", "No-Store"); 
                                 %>
			</ul>
                                              </li>

                   <%
                   }
                    %>
		
      </ul>
    </div>
  </div>
</nav>
