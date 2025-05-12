<%-- 
    Document   : addComment
    Created on : 10 May 2025, 13:12:20
    Author     : ranka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Comment Page</title>
    </head>
    <body>
        <h1 style="color: green">Add Your Comment</h1>
        
        <form action="CommentServlet.do" method="POST">
    
        <p>Comment:</p>
        
        <textarea name="comment" rows="20" cols="30" placeholder="Enter your Comment here">
            
        </textarea >
        
        <input type="submit" value="Add  Comment">
         </form>
        
    </body>
</html>
