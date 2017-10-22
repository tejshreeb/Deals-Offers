<style>
    .well
    {
        background-image: url("images/wellbg3.jpg");
    }
    .body{
        background-color: lightgray;
    }
    .container
    {
        //background-color: lightgrey;
    }
    
/*    #res
      {
          background-color: transparent;
          width: 250px;
          border-radius: 5px; 
      }
      #tags
      {
          width: 250px;
      }*/
    
    </style>

     <script>
//  $(function() {
//       $("#tags").keyup(function(){//alert("aaa");
//            gettext=$("#tags").val();
//            $.ajax({
//               url: "prod.jsp", 
//               type:"GET",
//               data:"gettext="+gettext,
//               success: function(result) {
//                        $("#res").html(result);
//                    }
//            });
//           });
//      });
//     function data(a)
//     {
//          document.getElementById("tags").value=a;
//         
//     }
//$( function() {
//    var availableTags = [
//       $("#tags").keyup(function(){//alert("aaa");
//            gettext=$("#tags").val();
//            $.ajax({
//              url: "takearea.jsp", 
//               type:"GET",
//               data:"gettext="+gettext,
//               success: function(result) {
//                        $("#res").html(result);
//                    }
//            });
//           });
//    ];
//    $( "#tags" ).autocomplete({
//      source: availableTags
//    });
//    } );

  </script>
    
    <body class="body" >    
<div class="container">
	<form align="center">
         <div class="well well-lg">             
	  <div class="form-group form-group-lg">              
              <br>
   <input type="text" class="form-control" id="tags" placeholder="Enter your wish here..."></br>
   <a href="#" class="btn btn-info btn-lg"><span class="glyphicon glyphicon-search"></span> Search</a>
			</div>			
		</div>
	</form>
    <!--<a href="#" id="diva" onclick="data(res.innerHTML)">  <div id="res"></div></a>-->
	<div class="row" align="center">
	  <div class="col-md-4">
		<a href="search_result.jsp" class="thumbnail">
		  <p>Mobiles</p> 
		  <img src="images/mobiles.jpg" alt="Pulpit Rock" style="width:150px;height:150px">
		</a>
	  </div>
	  <div class="col-md-4">
		<a href="#" class="thumbnail">
		  <p>Electronics </p>
		  <img src="images/images.jpg" alt="Moustiers Sainte Marie" style="width:150px;height:150px">
		</a>
	  </div>
	  <div class="col-md-4">
		<a href="#" class="thumbnail">
		  <p>Cars</p> 
		  <img src="images/cars.jpg" alt="Cinque Terre" style="width:150px;height:150px">
		</a>
	  </div>
	  <div class="col-md-4">
		<a href="#" class="thumbnail">
		  <p>Bikes</p> 
		  <img src="images/bikes.jpg" alt="Cinque Terre" style="width:150px;height:150px">
		</a>
	  </div>
	  <div class="col-md-4">
		<a href="#" class="thumbnail">
		  <p>Furniture</p> 
		  <img src="images/furniture.jpg" alt="Cinque Terre" style="width:150px;height:150px">
		</a>
	  </div>
	  <div class="col-md-4">
		<a href="#" class="thumbnail">
		  <p>Books & Staionary</p> 
		  <img src="images/books.jpg" alt="Cinque Terre" style="width:150px;height:150px">
		</a>
	  </div>
	  <div class="col-md-4">
		<a href="#" class="thumbnail">
		  <p>Fashion</p> 
		  <img src="images/fashion.jpg" alt="Cinque Terre" style="width:150px;height:150px">
		</a>
	  </div>
            
            <div class="col-md-4">
		<a href="#" class="thumbnail">
		  <p>Home Appliances</p> 
		  <img src="images/h1.jpg" alt="Cinque Terre" style="width:150px;height:150px">
		</a>
	  </div>
            
            
            <div class="col-md-4">
		<a href="#" class="thumbnail">
		  <p>kids section</p> 
		  <img src="images/k1.jpg" alt="Cinque Terre" style="width:150px;height:150px">
		</a>
	  </div>
            
	</div>
</div>
</body>
</html>