
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script>
 
</script>

<style>
    
    #div1{
        background-color:  #2b669a;
    }
    
    #main{
        margin: 0% 15% 1% 15% ;
        background-image: url("images/bg.jpg");
    }
    .body{
        /*background-image: url("images/bg.jpg");*/
    }
 body {
    /*padding-top:50px;*/
}

form { margin: 0px 10px; }

h2 {
  margin-top: 2px;
  margin-bottom: 2px;
}

.container { max-width: 360px; }

.divider {
  text-align: center;
  margin-top: 20px;
  margin-bottom: 5px;
}

.divider hr {
  margin: 7px 0px;
  width: 35%;
}

.left { float: left; }

.right { float: right; }



</style>


<body class="body">
    
     <%@include  file="nav.jsp"%>
     
     <div id="main"> 
         
         <div id="div1" class="col-md-12">
<br>
               <div class="container">
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<form method="POST" action="#" role="form">
						<div class="form-group">
							<h2>Feedback</h2>
						</div>
						<div class="form-group">
							<label class="control-label" for="signupName">Product name</label>
							<input id="signupName" type="text" maxlength="50" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="signupEmail">Product Id</label>
							<input id="signupEmail" type="text" maxlength="50" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="signupEmail">Refrance Id</label>
							<input id="signupEmail" type="text" maxlength="50" class="form-control">
						</div>
                                           
					</form>
				</div>
			</div>
		</div>
	</div>
  
         </div> 
         
           <div id="div1" class="col-md-12">
            
<div class ="panel panel-info">
              <div class ="panel-heading">
                    <h4 class ="panel-title">
                        <a href="#data1" data-toggle="collapse" data-parent="#accordion"><center>Are you Satisfied with our product and service..?</center></a>
                    </h4>
              </div>
        <div id="data1" class="panel-collapse collapse">
            <div class="panel-body">
               
                
              
                
             <!--selection of option as yes or no-->   
                
                
                <div class="container">
	<div class="row">
        <div class="span12">
    		<div class="" id="loginModal">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3>Please select one option</h3>
              </div>
              <div class="modal-body">
                <div class="well">
                  <ul class="nav nav-tabs">
                    
                    <li class="active"><a href="Yes" data-toggle="tab">Yes</a></li>
                    <li><a href="No" data-toggle="tab">No</a></li>
                     
                  </ul>
                  <div id="myTabContent" class="tab-content">
                    <div class="tab-pane active in" id="login">
                      <form class="form-horizontal" action='' method="POST">
                        <fieldset>
                          <!--<div id="legend">
                            <legend class="">Yes</legend><br>
                          </div> -->   
                          <div id="yes"  class="control-group">
                            <!-- review -->
                            <label class="control-label"  for="Review">Write a Review</label><br>
                       
                        <textarea value="Review" rows="4" class="input-xlarge">
                        </textarea>
     
                          </div>
     
                         
                          <div  class="control-group">
                            <!-- Button -->
                            <div class="controls">
                             <br> <button class="btn btn-success">Submit</button>
                            </div>
                          </div>
                        </fieldset>
                      </form>                
                    </div>
                    <div  id="no"  class="tab-pane fade" id="create">
                       
                            <form id="tab">
                        
                          <h4>claim refund </h4>
                       <label class="control-label"  for="Review">Write a Review</label><br>
                        
                       
                       
                        <textarea value="Review" rows="4" class="input-xlarge">
                        </textarea>
                        
     
                        <div>
                          <button class="btn btn-primary">Submit</button>
                        </div>
                       
                       
                      </form>
                    </div>
                </div>
              </div>
            </div>
        </div>
	</div>
</div>
                
                
                
                
                                        
                
                
                
            </div>
        </div> 
    </div>
	</div>
         

            
            
                
	</div>
</div>
         
         
         
         
         
     
     </body>