<%-- 
    Document   : blacklist
    Created on : 31 Mar, 2017, 2:48:52 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blacklist Users</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
      <script src="js/bootstrap.min.js"></script>
      <script src="jquery/1.11.1/jquery.min.js"></script>
    </head>

<body>
    <%@include file="nav.jsp" %>
  <div class="container">
        <center>
            <h3>Following Users have crossed the 'unsatisfied' feedback threshold:</h3>
        <div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            
            <button type="button" class="btn btn-primary" >Blacklist</button>
        </div>
            
        <div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            
            <button type="button" class="btn btn-primary" >Blacklist</button>
        </div>
            
        <div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            
            <button type="button" class="btn btn-primary" >Blacklist</button>
        </div>
            
        <div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            
            <button type="button" class="btn btn-primary" >Blacklist</button>
        </div>
        
        <div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            
            <button type="button" class="btn btn-primary" >Blacklist</button>
        </div>
       </center>
    </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
