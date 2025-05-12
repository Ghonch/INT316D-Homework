<%-- 
    Document   : HODMenu
    Created on : 08 May 2025, 14:04:18
    Author     : ranka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOD Add Page</title>
    </head>
    <body>
        <h1 style="color:dodgerblue">HOD Add Page</h1>
        
        <p>
            
            Please Add HOD Details Below
            
        </p>
        
        <form action="HODADDDetailsServlet.do" method="post">
            
            <table>
                <tr>
                    <td>STAFF NUMBER</td>
                    <td> <input type="text" name="staffNumber" value="" /> </td>
                </tr>
                
                  <tr>
                    <td>NAME</td>
                    <td> <input type="text" name="name" value="" /> </td>
                </tr>
                
                  <tr>
                    <td>SURNAME</td>
                    <td> <input type="text" name="surname" value="" /> </td>
                </tr>
                  <tr>
                    <td>FACULTY</td>
                    <td>
                      <select name="faculty">
                      <option value="INFORMATION COMMUNICATION AND TECHNOLOGY">INFORMATION TECHNOLOGY AND COMMUNICATION</option>
                      <option value="HUMANITIES">HUMANITIES</option>
                      <option value="ECONOMICS AND FINANCE">ECONOMICS AND FINANCE</option>
                      <option value="MANAGEMENT SCIENCE">MANAGEMENT SCIENCE</option>
                      </select>
                    </td>
                </tr>
                
                 <tr>
                    <td>PASSWORD</td>
                    <td> <input type="password" name="password" value="" /> </td>
                </tr>
                
                 <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"></td>
                </tr>
                
            </table>
            
        </form>
        
    </body>
</html>
