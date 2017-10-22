<%@page import="Dao.AdminloginDao"%>
<jsp:useBean id="comp" class="Model.Adminlogin" scope="request"></jsp:useBean>
<jsp:setProperty name="comp" property="*"></jsp:setProperty>
<%
    boolean status=AdminloginDao.checkAdmin(comp, getServletContext());
    
   if(status)
   {
     session.setAttribute("current_user",comp.getEmail());
     response.sendRedirect("admin_home.jsp");
   }
   else
   {
     response.sendRedirect("admin_login.jsp");
   }
%>