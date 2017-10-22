   <% 
       request.getSession().setAttribute("user_id", null);
        session.invalidate();
        response.sendRedirect("index.jsp");
        %>