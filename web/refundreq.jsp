<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Refund Request Management</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <script src="jquery/1.11.1/jquery.min.js"></script>
        
        <style>
     
            .panel-table .panel-body{
  padding:0;
}

.panel-table .panel-body .table-bordered{
  border-style: none;
  margin:0;
}

.panel-table .panel-body .table-bordered > thead > tr > th:first-of-type {
    text-align:center;
    width: 100px;
}

.panel-table .panel-body .table-bordered > thead > tr > th:last-of-type,
.panel-table .panel-body .table-bordered > tbody > tr > td:last-of-type {
  border-right: 0px;
}

.panel-table .panel-body .table-bordered > thead > tr > th:first-of-type,
.panel-table .panel-body .table-bordered > tbody > tr > td:first-of-type {
  border-left: 0px;
}

.panel-table .panel-body .table-bordered > tbody > tr:first-of-type > td{
  border-bottom: 0px;
}

.panel-table .panel-body .table-bordered > thead > tr:first-of-type > th{
  border-top: 0px;
}

.panel-table .panel-footer .pagination{
  margin:0; 
}

/*
used to vertically center elements, may need modification if you're not using default sizes.
*/
.panel-table .panel-footer .col{
 line-height: 34px;
 height: 34px;
}

.panel-table .panel-heading .col h3{
 line-height: 30px;
 height: 30px;
}

.panel-table .panel-body .table-bordered > tbody > tr > td{
  line-height: 34px;
}


    
      
            
        </style>
        
        
    </head>
    <body>
        <%@include file="nav.jsp" %>
        
        
        <div class="container">
    <div class="row">
    
        <center>
    <h1>Refund Request</h1>
    <h4> Following users have requested a refund</h4>
        </center>
    
        <div class="col-md-10 col-md-offset-1">

            <div class="panel panel-default panel-table">
              <div class="panel-heading">
                <div class="row">
                  <div class="col col-xs-6">
                    <h3 class="panel-title">Pending Requests</h3>
                  </div>
                  <div class="col col-xs-6 text-right">
                    <!--<button type="button" class="btn btn-sm btn-primary btn-create">Create New</button>-->
                  </div>
                </div>
              </div>
              <div class="panel-body">
                <table class="table table-striped table-bordered table-list">
                  <thead>
                    <tr>
                        
                        <th class="hidden-xs"> Referance ID</th>
                        <th>Username</th>
                        <th>Product Name</th>
                        <th>Product Price</th>
                        <th>Sold By</th>
                        <th>Date</th>
                        <th><center>Request</center></th>
                    </tr> 
                  </thead>
                  <tbody>
                          <tr>
                            
                            <td class="hidden-xs"><center>1</center></td>
                            <td>abc</td>
                            <td>name</td>
                            <td>price</td>
                            <td>Seller name</td>
                            <td>date</td>
                            <td align="center">
                              <!--<a class="btn btn-default">Accept</a>-->
                              <!--<a class="btn btn-danger">Approve Refund</a>-->
                              
                              
                              
                              
                              <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">Approve Refund</button>
   <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
           <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <div class="modal-body">
                  
                  
                  <h3> Refund Confirmation</h3>
                  <h4> Are you sure you want to refund the requested amount on account number "----" </h4>
                  
              </div>
              
           </div>
          <div class="modal-footer">
              <center> <button type="button" class="btn btn-default" data-dismiss="modal">I Agree</button> </center>
          </div>
      </div>
    </div>
  </div>
                              
                            </td>
                          </tr>
                        </tbody>
                </table>
            
                  
                  
                  
                              
                  
                  
                  
                  
              </div>
              <div class="panel-footer">
                <div class="row">
                  <div class="col col-xs-4">Page 1 of 5
                  </div>
                  <div class="col col-xs-8">
                    <ul class="pagination hidden-xs pull-right">
                      <li><a href="#">1</a></li>
                      <li><a href="#">2</a></li>
                      <li><a href="#">3</a></li>
                      <li><a href="#">4</a></li>
                      <li><a href="#">5</a></li>
                    </ul>
                    <ul class="pagination visible-xs pull-right">
                        <li><a href="#">«</a></li>
                        <li><a href="#">»</a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>

</div></div></div>
        
        
        <%@include file="footer.jsp" %>
    </body>
</html>
