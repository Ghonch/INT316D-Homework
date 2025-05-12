<%-- 
    Document   : studentMenu
    Created on : 08 May 2025, 14:03:51
    Author     : ranka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Login Page</title>
    </head>
    <body>
        <p>
            Enter Student Details Below:
        </p>
        <form action="AddStudentServlet.do" method="post">
            <table>
                <tr>
                    <td>Student Number</td>
                    <td><input type="text" name="studNum" required=""></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" required=""></td>
                </tr>
                <tr>
                    <td>Surname</td>
                    <td><input type="text" name="surname" required=""></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" required=""></td>
                </tr>
                <tr>
                    <td>Faculty</td>
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
                    <td>Gender</td>
                    <td>
                <select name="gender">
                    <option value="M">MALE</option>
                    <option value="F">FEMALE</option>
                </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
