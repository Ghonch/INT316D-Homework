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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import za.ac.tut.bl.LecturerFacadeLocal;
import za.ac.tut.entities.ModuleInfo;
import za.ac.tut.entities.Lecturer;
/**
 *
 * @author ranka
 */
public class AddLectureServlet extends HttpServlet {

    @EJB
    private LecturerFacadeLocal lf;
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Long staffNumber = Long.parseLong(request.getParameter("staffNumber"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String faculty = request.getParameter("faculty");
        String password = request.getParameter("password");
        
        
        List<ModuleInfo> modules = new LinkedList<>();
        
        ModuleInfo module1 = new ModuleInfo(request.getParameter("module1Code") , request.getParameter("module1Name"));
        modules.add(module1);
        ModuleInfo module2 = new ModuleInfo(request.getParameter("module2Code") , request.getParameter("module2Name"));
        modules.add(module2);
        
        Lecturer lecture = new  Lecturer(staffNumber, name, surname, faculty, modules, password);
        lf.create(lecture);
        
        RequestDispatcher rd = request.getRequestDispatcher("AddLectureOutcome.jsp");
        rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
