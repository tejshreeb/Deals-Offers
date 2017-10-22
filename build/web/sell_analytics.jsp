<%-- 
    Document   : sell_analytics
    Created on : Mar 31, 2017, 3:20:32 PM
    Author     : vaishali
--%>

<html lang="en">
<head>
  <title>Sell Analytics</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <%@include file="nav.jsp" %>
<div class="container">
  

  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">Total Order Received</a></li>
    <li><a data-toggle="tab" href="#menu1">Item Dispatched</a></li>
    <li><a data-toggle="tab" href="#menu2">Delieverd Items</a></li>
    <li><a data-toggle="tab" href="#menu3">Stock Management</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>Total Order Received</h3>
      <table class="table">
    <thead>
      <tr>
        <th>order_id</th>
        <th>Customer Name</th>
        <th>Contact Number</th>
        <th>Delievery Address</th>
        <th>Quantity</th>
        <th>Date</th>
      </tr>
    </thead>
<!--    <tbody>
      <tr>
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
      </tr>
      <tr>
        <td>Mary</td>
        <td>Moe</td>
        <td>mary@example.com</td>
      </tr>
      <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>july@example.com</td>
      </tr>
    </tbody>-->
  </table>
          </div>
    <div id="menu1" class="tab-pane fade">
      <h3>Item Dispatched</h3>
      <table class="table">
    <thead>
      <tr>
        <th>order_id</th>
        <th>track_id</th>
        <th>dispatched on</th>
        <th>Expected Delievery Date</th>

      </tr>
    </thead>
    </table>
    </div>
    <div id="menu2" class="tab-pane fade">
      <h3>Delieverd Items</h3>
      <table class="table">
    <thead>
      <tr>
        <th>order_id</th>
        <th>Customer Name</th>
        <th>Pending Revenue</th>
        <th>Delievery Date</th>
       
      </tr>
    </thead>
    </table>
          </div>
    <div id="menu3" class="tab-pane fade">
      <h3>Stock Management</h3>
      <table class="table">
    <thead>
      <tr>
        <th>order_id</th>
        <th>Customer Name</th>
        <th>Contact Number</th>
        <th>Delievery Address</th>
        <th>Quantity</th>
        <th>Date</th>
      </tr>
    </thead>
    </table>
    </div>
  </div>
</div>

</body>
</html>
