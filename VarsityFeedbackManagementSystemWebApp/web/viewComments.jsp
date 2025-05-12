<%-- 
    Document   : viewComments
    Created on : 12 May 2025, 14:34:30
    Author     : ranka
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Comment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Comments Page</title>
    </head>
    <body>
        <ul>
        <% List<Comment> comments = (List<Comment> )request.getAttribute("comments");
        
          for (Comment comm : comments) {
                String comment =comm.getComment();
                Date creationDate =comm.getCreationDate();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                String creationDateStr = sd.format(creationDate);

              %>  
              
              <li ><%=comment%></li>  
              <li><%=creationDateStr%></li>
              
                <%
              }
        %>
        </ul> 
           
        <p>
            Click <a href="userMenu.html">here</a> to return to the user menu.
        </p>
    </body>
</html>
