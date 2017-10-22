<!DOCTYPE html>
<html>
 <head>
     <title>Admin Page</title>
      <link href="css/bootstrap.min.css" rel="stylesheet">
      <script src="js/bootstrap.min.js"></script>
      <script src="jquery/1.11.1/jquery.min.js"></script>
 </head>

<body>
    <%@include file="nav.jsp" %>
    <div class="container">
   <div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title"><a href="validateuser.jsp">User Validation</a></h3>
    </div>
    <div class="panel-body">
       Validate the request of the Users who want to sell new products.
    </div>
   </div>

<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title"><a href="refundreq.jsp">Refund Request Management</a></h3>
    </div>
    <div class="panel-body">
        Review the request of the user who need a refund on the products they have bought.
    </div>
</div>
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title"><a href="blacklist.jsp">Blacklist User (Seller)</a></h3>
    </div>
    <div class="panel-body">
       Prohibit some users to sell their products. 
    </div>
</div>

<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title"><a href="#">View all the users</a></h3>
    </div>
    <div class="panel-body">
       View all the registered users on the website.
    </div>
</div>
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title"><a href="#">Product history</a></h3>
    </div>
    <div class="panel-body">
       View the list of products sold on a particular date/day.
    </div>
</div>
</div>
        <%@include file="footer.jsp" %>
</body>
</html>