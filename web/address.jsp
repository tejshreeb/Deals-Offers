
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
         
         <!--<div id="div1" class="col-md-12">
             
             <h3>Payment Method</h3>
             <br>
             <h4> Proceed through Paypal...</h4>
             <br><br>
             
   
         </div>-->
         
         <div id="div2" class="col-md-12">
         
        <div class="container">
	<div class="row">
            
           
		 <form class="form-horizontal">
            <fieldset>
                <!-- Address form -->
         
                <h2> Delivary Address</h2>
         
                <!-- full-name input-->
                
                <div class="[ form-group ]">
            <input type="checkbox" name="fancy-checkbox-primary" id="fancy-checkbox-primary"
                   autocomplete="off" />
            <div class="[ btn-group ]">
               
                <div class ="panel panel-info">
              <div class ="panel-heading">
                    <h4 class ="panel-title">
                        <a href="#data1" data-toggle="collapse" data-parent="#accordion"><center>Default Address</center></a>
                    </h4>
              </div>
        <div id="data1" class="panel-collapse collapse">
            <div class="panel-body">
                Address that is already registered by the user.
            </div>
        </div> 
    </div>
            </div>
        </div>
          <br>   
             
                <div class="control-group">
                    <label class="control-label">Full Name</label>
                    <div class="controls">
                        <input id="full-name" name="full-name" type="text" placeholder="full name"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                <!-- address-line1 input-->
                <div class="control-group">
                    <label class="control-label">Address Line 1</label>
                    <div class="controls">
                        <input id="address-line1" name="address-line1" type="text" placeholder="address line 1"
                        class="input-xlarge">
                        <p class="help-block">Street address, P.O. box, company name, c/o</p>
                    </div>
                </div>
                <!-- address-line2 input-->
                <div class="control-group">
                    <label class="control-label">Address Line 2</label>
                    <div class="controls">
                        <input id="address-line2" name="address-line2" type="text" placeholder="address line 2"
                        class="input-xlarge">
                        <p class="help-block">Apartment, suite , unit, building, floor, etc.</p>
                    </div>
                </div>
                <!-- city input-->
                <div class="control-group">
                    <label class="control-label">City / Town</label>
                    <div class="controls">
                        <input id="city" name="city" type="text" placeholder="city" class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                <!-- region input-->
                <div class="control-group">
                    <label class="control-label">State / Province / Region</label>
                    <div class="controls">
                        <input id="region" name="region" type="text" placeholder="state / province / region"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                <!-- postal-code input-->
                <div class="control-group">
                    <label class="control-label">Zip / Postal Code</label>
                    <div class="controls">
                        <input id="postal-code" name="postal-code" type="text" placeholder="zip or postal code"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                
            </fieldset>
        </form>
            
	</div>
</div>
         </div>
         
        
         <br><br><br>
         <center> <a href="payment.jsp"><div class="btn btn-success">Buy</div></a> </center>
     </div>
     </body>