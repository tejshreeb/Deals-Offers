<%@page import="Dao.ProductMasterDao"%>
<jsp:useBean id="comp" class="Model.ProductMaster" scope="request"></jsp:useBean>
<jsp:setProperty name="comp" property="*"></jsp:setProperty>
<%
   boolean status = ProductMasterDao.ProductDetail(comp,getServletContext());
   if(status)
   {
    session.setAttribute("current_user",comp.getUser_id());
    response.sendRedirect("prod.jsp");
   }
   else
   {
     response.sendRedirect("login.jsp");
   }
%>