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
import za.ac.tut.bl.HeadOfDepartmentFacadeLocal;
import za.ac.tut.entities.HeadOfDepartment;

/**
 *
 * @author ranka
 */
public class VerifyHOD extends HttpServlet {
@EJB private HeadOfDepartmentFacadeLocal hodfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long userId = Long.parseLong(request.getParameter("userId"));
String userPassword = request.getParameter("userPassword");
String userRole = request.getParameter("userRole");
String path = "";       

        HeadOfDepartment hod = hodfl.find(userId);
          if(hod.getPassword().equals(userPassword )&& hod.getStaffNum().equals(userId)){
      path ="addComment.jsp";
     
  }else if(!hod.getPassword().equals(userPassword )){
      path ="PasswordIncorrect.jsp";
  }else if(hod.getStaffNum().equals(userId)){
       path="UserNotFound.jsp";
  }
 
  RequestDispatcher rd = request.getRequestDispatcher(path);
rd.forward(request, response);
    }


}
