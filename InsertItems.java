
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InsertItems extends HttpServlet {
  
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
    rs.setContentType("text/html");
    String name=rq.getParameter("s1");
    String qty=rq.getParameter("t1");
    //Create session using HttpSession interface
    HttpSession session=rq.getSession(true);
    //setAttribute(key,value)------setAttribute("user","qeer");    
    session.setAttribute(name,qty);
    rs.getWriter().println("<center>");
    rs.getWriter().println("<h1>Item added</h1>");
    rs.getWriter().print("<a href='index.html'>Click here to go to main page</a>");
    }
}