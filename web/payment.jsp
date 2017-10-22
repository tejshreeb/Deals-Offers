
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    
    #div1{
        background-color: lavender;
    }
    #div2{
        background-color: lavenderblush ;
    }
    #main{
        margin: 1% 15% 1% 15% ;
    }
    .body{
        background-image: url("images/bg.jpg");
    }
    
    
    
.form-group input[type="checkbox"] {
    display: none;
}

.form-group input[type="checkbox"] + .btn-group > label span {
    width: 20px;
}

.form-group input[type="checkbox"] + .btn-group > label span:first-child {
    display: none;
}
.form-group input[type="checkbox"] + .btn-group > label span:last-child {
    display: inline-block;   
}

.form-group input[type="checkbox"]:checked + .btn-group > label span:first-child {
    display: inline-block;
}
.form-group input[type="checkbox"]:checked + .btn-group > label span:last-child {
    display: none;   
}

    
</style>


<body class="body">
    
     <%@include  file="nav.jsp"%>
     
     <div id="main"> 
         
         <div id="div1" class="col-md-12">
             
             <h3>Payment Method</h3>
             <br>
             <h4> Proceed through Paypal...</h4>
             <br><br>
          <%
    String paypal_url="https://www.sandbox.paypal.com/cgi-bin/webscr"; // Test Paypal API URL
    String paypal_id="batch4323-facilitator@gmail.com"; // Business email ID
    %>
    <h4>Welcome, Guest</h4>

    <div class="product">            
        <div class="image">
            <img src="http://www.phpgang.com/wp-content/uploads/gang.jpg" />
        </div>
        <div class="name">
            PHPGang Payment
        </div>
        <div class="price">
            Price:$10
        </div>
        <div class="btn">
        <form action="<%=paypal_url%>" method="post" name="frmPayPal1">
        <input type="hidden" name="business" value="<%=paypal_id%>">
        <input type="hidden" name="cmd" value="_xclick">
        <input type="hidden" name="item_name" value="PHPGang Payment">
        <input type="hidden" name="item_number" value="1">
        <input type="hidden" name="credits" value="510">
        <input type="hidden" name="userid" value="1">
        <input type="hidden" name="amount" value="10">
        <input type="hidden" name="cpp_header_image" value="http://www.phpgang.com/wp-content/uploads/gang.jpg">
        <input type="hidden" name="no_shipping" value="1">
        <input type="hidden" name="currency_code" value="USD">
        <input type="hidden" name="handling" value="0">
        <input type="hidden" name="cancel_return" value="http://demo.phpgang.com/payment_with_paypal/cancel.php">
        <input type="hidden" name="return" value="http://demo.phpgang.com/payment_with_paypal/success.php">
        <input type="image" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
        <img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">
        </form>
        </div>
    </div>
    </body>
         </div>
         
         <br><br><br>
         <center> <div class="btn btn-success">Buy</div> </center>
     </div>
     </body>