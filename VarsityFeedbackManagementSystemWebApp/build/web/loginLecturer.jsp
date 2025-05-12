<%-- 
    Document   : verifyLecturer
    Created on : 12 May 2025, 18:11:49
    Author     : ranka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Lecturer</h1>
        <p>
            Enter Login details below:
        </p>
        <form action="VerifyLecturer.do" method="post">
            <table>
                <tr>
                    <td>Enter Student or staff Number</td>
                    <td><input type="text" name="userId" required=""></td>
                </tr>
                <tr>
                    <td>Enter Password</td>
                    <td><input type="text" name="userPassword" required=""></td>
                </tr>
                <tr>
                    
                    <td><input type="submit" value="Login" required=""></td>
                </tr>
    </body>
</html>
