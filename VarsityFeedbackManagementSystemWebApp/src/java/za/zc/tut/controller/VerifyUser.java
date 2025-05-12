
package za.zc.tut.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import za.ac.tut.bl.HeadOfDepartmentFacadeLocal;
import za.ac.tut.bl.LecturerFacadeLocal;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.HeadOfDepartment;
import za.ac.tut.entities.Lecturer;
import za.ac.tut.entities.Student;


public class VerifyUser extends HttpServlet {

  @EJB private StudentFacadeLocal sfl;
   private LecturerFacadeLocal lfl;
   private HeadOfDepartmentFacadeLocal hodfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       /* 
        Long userId = Long.parseLong(request.getParameter("userId"));
        String userPassword = request.getParameter("userPassword");
        String userRole = request.getParameter("userRole");
        
        String path="";
        
     
        
        if(userRole.equalsIgnoreCase("lecturer"))
       {
       
          
           Lecturer lecturer = lfl.findLecturer(userId);
               
                           if(lecturer.getPassword().equalsIgnoreCase(userPassword))
                        {
                        
                            path="userMenu.html";
                            
                            
                        }
                        else
                        {
                        
                            path="PasswordIncorrect.jsp";
                        
                        }
           
           
           }
           /*
           path="UserNotFound.jsp";
           }
           
           
       
       }
        
        if(userRole.equalsIgnoreCase("hod"))
       {
       
       
       }
        
        
        RequestDispatcher rd  = request.getRequestDispatcher(path);
        rd.forward(request, response);
       
    }*/
     
 
String userRole = request.getParameter("userRole");

String path = "";
       
            if (userRole.equalsIgnoreCase("student")) {
        
        path = "loginStudent.jsp";
            }else if(userRole.equalsIgnoreCase("lecturer")){
                path = "loginLecturer.jsp";
            }else {
                path ="loginHOD.jsp";
            }
        

/*try {
    if (userRole.equalsIgnoreCase("student")) {
        
        path = "verifyStudent.jsp";
        
        
        
        
        Student student = sfl.find(userId);

        if (!student.getPassword().equals(userPassword)) {
            path = "PasswordIncorrect.jsp";
        } else {
            path = "userMenu.html";
        }} 
    
    
    else if (userRole.equalsIgnoreCase("lecturer")) {
        Lecturer lecturer = lfl.find(userId);

        if (!lecturer.getPassword().equals(userPassword)) {
            path = "PasswordIncorrect.jsp";
        } else {
            path = "userMenu.html";
        }
    } else if (userRole.equalsIgnoreCase("hod")) {
        HeadOfDepartment hod = hodfl.find(userId);

        if (!hod.getPassword().equals(userPassword)) {
            path = "PasswordIncorrect.jsp";
        } else {
            path = "userMenu.html";
        }
    } else {
        path = "InvalidRole.jsp";
    }
} catch (Exception e) {
    path = "UserNotFound.jsp";
}*/

RequestDispatcher rd = request.getRequestDispatcher(path);
rd.forward(request, response);
    }


}
