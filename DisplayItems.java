/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author parth
 */
public class DisplayItems extends HttpServlet {

@Override
protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
    rs.setContentType("text/html");
    HttpSession session=rq.getSession(false);
    //.....String value = (String)session.getAttribute("A");
    rs.getWriter().println("<center>");
    rs.getWriter().println("<h1>Item added</h1>");
    Enumeration e=session.getAttributeNames();
    rs.getWriter().println("<table border='2'>");
    rs.getWriter().println("<tr><th>Items</th><th>Quantity</th></tr>");
    while(e.hasMoreElements())
    {
        String key=(String)e.nextElement();
        rs.getWriter().println("<tr><td>"+key+"</td><td>"+session.getAttribute(key)+"</td></tr>");   }
    rs.getWriter().println("</table></center>");
    }
}
    