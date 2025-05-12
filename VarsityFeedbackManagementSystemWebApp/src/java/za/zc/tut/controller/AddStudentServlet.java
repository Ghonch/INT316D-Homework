
package za.zc.tut.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;


public class AddStudentServlet extends HttpServlet {
    
    @EJB private StudentFacadeLocal sfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long studNum =Long.parseLong(request.getParameter("studNum")); 
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String faculty = request.getParameter("faculty");
        char gender = request.getParameter("gender").charAt(0);
        String password = request.getParameter("password");
        
        Student s = createStudent(studNum,name,surname,faculty,gender,password);
        sfl.create(s);
        
        RequestDispatcher rd = request.getRequestDispatcher("addStudent_outcome.jsp");
        rd.forward(request, response);
        
    }

    private Student createStudent(Long studNum, String name, String surname, String faculty, char gender,String password) {
      Student s = new Student();
      s.setStudNum(studNum);
      s.setName(name);
      s.setSurname(surname);
      s.setFaculty(faculty);
      s.setGender(gender);
      s.setPassword(password); 
      
      return s;
    }
}
