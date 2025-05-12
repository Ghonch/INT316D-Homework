/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.zc.tut.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author ranka
 */
public class VerifyStudent extends HttpServlet {
@EJB private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
Long userId = Long.parseLong(request.getParameter("userId"));
String userPassword = request.getParameter("userPassword");
String userRole = request.getParameter("userRole");

String path = "";

  Student student = sfl.find(userId);
  if(student.getPassword().equals(userPassword )&& student.getStudNum().equals(userId)){
      path ="addComment.jsp";
  }else if(!student.getPassword().equals(userPassword )){
      path ="PasswordIncorrect.jsp";
  }else if(student.getStudNum().equals(userId)){
       path="UserNotFound.jsp";
  }
  
  RequestDispatcher rd = request.getRequestDispatcher(path);
rd.forward(request, response);
    }


}
