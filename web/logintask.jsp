<%@page import="Dao.UserMasterDao"%>
<jsp:useBean id="comp" class="Model.UserMaster" scope="request"></jsp:useBean>
<jsp:setProperty name="comp" property="*"></jsp:setProperty>
<%
    ServletContext context=getServletContext();
   int user_id  = UserMasterDao.checkUser(comp,context);
   
   
   if(user_id!=0)
   {
     request.getSession().setAttribute("user_id",user_id);
     response.sendRedirect("index.jsp");
   }
   else
   {
     response.sendRedirect("login.jsp");
   }
   
  String name  = UserMasterDao.getdetail(user_id,context);
   request.getSession().setAttribute("name",name);
   %>