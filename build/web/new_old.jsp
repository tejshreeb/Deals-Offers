

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .jumbotron
            {
              width:75%;                
            }
            body{
                background-image: url("images/back.jpg");
            }
           
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

         
          </style>  
        </head>
      <body class="body">
        <%@include file="nav.jsp" %>
        
        <center>
            
            <div class="jumbotron">  <b><center><p>Brand New Products</center></b> You need to get verified as an Authentic Seller before posting a new product. Please proceed to insert your Details. 
            <br>
            <br>
            <!--<a href="#"><div class="btn btn-info">Register Here</div></a>-->
            <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">Register Here!</button>
   <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
           <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <div class="modal-body">
                  <table>
                      
                  <tr><td><label>ID Proof:</label> </td>
                   <td><select name="" id="">
                   <option value="0">select ID </option>
                   <option>Unique Id</option>
                   <option>PAN card</option>
                   <option>Voter Id</option>
                   </select> </td></tr>
                  <tr><td><label>Registration number:</label></td>
                 <td> <input type="text"/></td></tr>
                  </table>
              </div>
              
           </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Register</button>
          </div>
      </div>
    </div>
  </div>
        </div>
            
            <div class="jumbotron"> <b><center><p>Second Hand/Old Products</center></b> To Post an old product, please proceed directly to the Posting Interface.
            <br>
            <br>
        <a href="prod_upld.jsp"><div class="btn btn-info">Publish Product</div></a>
        </div>
        
        <%@include file="footer.jsp"%>
           
        </center>
        
    </body>
</html>
