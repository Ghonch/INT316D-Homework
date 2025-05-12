<%-- 
    Document   : lecture
    Created on : 10 May 2025, 12:33:23
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
        <h1>Login </h1>
        <form action="VerifyLecture.do" method="POST">
            
               <table>
                <tr>
                    <td>STAFF NUMBER</td>
                    <td> <input type="text" name="staffNumber" value="" required/> </td>
                </tr>
                <tr>
                    <td>PASSWORD</td>
                    <td> <input type="password" name="password" value="" required/> </td>
                </tr>
                
                <td>
                        <input type="submit" value="ADD" />
                    </td>
               </table>
        </form>
    </body>
</html>
