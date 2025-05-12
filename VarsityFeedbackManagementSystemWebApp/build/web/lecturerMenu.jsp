<%-- 
    Document   : lecturerMenu
    Created on : 08 May 2025, 14:04:03
    Author     : ranka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Lecture Page</title>
    </head>
    <body>
        
        <h1 style="color:dodgerblue">Lecture Details</h1>
        
        <p>
         Add Lecture Details Below   
        </p>
        
        <form action="AddLectureServlet.do" method="post">
            
            
            <table>
                <tr>
                    <td>STAFF NUMBER</td>
                    <td> <input type="text" name="staffNumber" value="" required/> </td>
                </tr>
                
                                <tr>
                    <td>NAME</td>
                    <td> <input type="text" name="name" value="" required/> </td>
                </tr>
                
                                <tr>
                    <td>SURNAME</td>
                    <td> <input type="text" name="surname" value="" required/> </td>
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
                    <td>PASSWORD</td>
                    <td> <input type="password" name="password" value="" required/> </td>
                </tr>
                
               
                
                <tr>
                    <th>MODULE 1 DETAILS</th>
                </tr>
                
                <tr>
                    <td>CODE</td>
                   
                    <td> <input type="text" name="module1Code" value="" required/> </td>
                </tr>
                 <tr>
                    <td>NAME</td>
                   
                    <td> <input type="text" name="module1Name" value="" required/> </td>
                </tr>
              
                 <tr>
                    <th>MODULE 2 DETAILS</th>
                </tr>
                 <tr>
                    <td>CODE</td>
                   
                    <td> <input type="text" name="module2Code" value="" required/> </td>
                </tr>
                 <tr>
                    <td>NAME</td>
                   
                    <td> <input type="text" name="module2Name" value="" required/> </td>
                </tr>
                
             
                
                <tr>
                    <td>
                        
                    </td>
                    <td>
                        <input type="submit" value="ADD" />
                    </td>
                </tr>
                
            </table>
            
        </form>
        
        
    </body>
</html>
