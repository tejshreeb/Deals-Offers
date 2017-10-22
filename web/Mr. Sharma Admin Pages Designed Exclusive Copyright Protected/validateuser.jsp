<%-- 
    Document   : validateuser
    Created on : 31 Mar, 2017, 2:30:19 PM
    Author     : Tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Validate User</title>
      <link href="css/bootstrap.min.css" rel="stylesheet">
      <script src="js/bootstrap.min.js"></script>
      <script src="jquery/1.11.1/jquery.min.js"></script>
    </head>
    <body>
        <%@include file="nav.jsp" %>
    <div class="container">
        <center>
            <h3>Following Users have requested to sell New Products:</h3>
        <div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            <br/>
            ID Proof: <!-- Fetch the User's IdProof here --><label>012345</label>
            <br/>
              <div class="btn-group" style="padding:15px">
                <button type="button" class="btn btn-primary">Approve</button>
                <button type="button" class="btn btn-primary">Reject</button>
              </div>
        </div>
        <div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            <br/>
            ID Proof: <!-- Fetch the User's IdProof here --><label>012345</label>
            <br/>
              <div class="btn-group" style="padding:10px">
                <button type="button" class="btn btn-primary">Approve</button>
                <button type="button" class="btn btn-primary">Reject</button>
              </div>
        </div><div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            <br/>
            ID Proof: <!-- Fetch the User's IdProof here --><label>012345</label>
            <br/>
              <div class="btn-group" style="padding:10px">
                <button type="button" class="btn btn-primary">Approve</button>
                <button type="button" class="btn btn-primary">Reject</button>
              </div>
        </div><div class="well">
            Username: <!-- Fetch the Username here --><label>ABC</label>
            <br/>
            ID Proof: <!-- Fetch the User's IdProof here --><label>012345</label>
            <br/>
              <div class="btn-group" style="padding:10px">
                <button type="button" class="btn btn-primary">Approve</button>
                <button type="button" class="btn btn-primary">Reject</button>
              </div>
        </div>
       </center>
    </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
