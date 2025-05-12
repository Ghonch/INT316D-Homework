
package za.zc.tut.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;
import za.ac.tut.bl.CommentFacadeLocal;
import za.ac.tut.entities.Comment;


public class CommentServlet extends HttpServlet {
@EJB private CommentFacadeLocal cm1;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
      String comment = request.getParameter("comment");
      Comment com = createComment(comment);
      
      cm1.create(com);
      
        RequestDispatcher disp = request.getRequestDispatcher("add_Comment_Outcome.jsp");
        disp.forward(request, response);
   
    }
    private Comment createComment(String comment){
        Comment com = new Comment();
        com.setComment(comment);
        com.setCreationDate(new Date());
        return com;
        
    }


}
