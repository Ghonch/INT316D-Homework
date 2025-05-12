
package za.zc.tut.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import za.ac.tut.bl.CommentFacadeLocal;
import za.ac.tut.entities.Comment;

public class ViewComment extends HttpServlet {
@EJB private CommentFacadeLocal cf2;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Comment> comments = cf2.findAll();
        
        request.setAttribute("comments", comments);
        
        RequestDispatcher disp = request.getRequestDispatcher("viewComments.jsp");
        disp.forward(request, response);
        
    }
}
