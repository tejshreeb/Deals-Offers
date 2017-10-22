<%@page import="Model.UserMaster"%>
<%@page import="Dao.UserMasterDao"%>

<jsp:useBean id="comp" class="Model.UserMaster" scope="session"></jsp:useBean>
<jsp:setProperty name="comp" property="*"></jsp:setProperty>
<%
    ServletContext context= getServletContext();
    boolean status= UserMasterDao.registerCompany(comp,context);
    if(status==true)
    {
     %>  
       <script>
       alert("Registration Success");
       
       window.location.href = "login.jsp";
       </script>    
 <%    
    }
    else
     {
 %>
       <script>
        alert("Registration Failed");
        window.location.href = "registration.jsp";
       </script>
  <%
   }  
%> 