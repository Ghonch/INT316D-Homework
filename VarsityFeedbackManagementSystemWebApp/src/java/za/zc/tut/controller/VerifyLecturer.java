/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.zc.tut.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import za.ac.tut.bl.LecturerFacadeLocal;
import za.ac.tut.entities.Lecturer;


/**
 *
 * @author ranka
 */
public class VerifyLecturer extends HttpServlet {
@EJB private LecturerFacadeLocal lfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long userId = Long.parseLong(request.getParameter("userId"));
String userPassword = request.getParameter("userPassword");
String userRole = request.getParameter("userRole");

String path = "";

  Lecturer lec = lfl.find(userId);
  if(lec.getPassword().equals(userPassword )&& lec.getStaffNum().equals(userId)){
      path ="addComment.jsp";
     
  }else if(!lec.getPassword().equals(userPassword )){
      path ="PasswordIncorrect.jsp";
  }else if(lec.getStaffNum().equals(userId)){
       path="UserNotFound.jsp";
  }
 
  
  RequestDispatcher rd = request.getRequestDispatcher(path);
rd.forward(request, response);
    }


}
