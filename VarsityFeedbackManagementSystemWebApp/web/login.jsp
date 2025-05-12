<%-- 
    Document   : login
    Created on : 10 May 2025, 12:30:00
    Author     : ranka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <p>
            Enter Login details below:
        </p>
        <form action="VerifyUser.do" method="post">
            <table>
              
                    <td>
                        <select name="userRole">
                            <option value="student">STUDENT</option>
                            <option value="lecturer">LECTURER</option>
                            <option value="hod">HOD</option>
                        </select>
                    </td>
              
                <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
