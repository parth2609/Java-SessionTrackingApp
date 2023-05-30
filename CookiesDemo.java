/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author parth
 */
public class CookiesDemo extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String email=request.getParameter("t1");
        String pass=request.getParameter("t2");
        Cookie ck[]=request.getCookies();//[cookie1,cookie2];
        //[key=value;max=1400;comment="demo",key=value;max=1400;comment="demo"]
        if(ck==null)
        {
        //a[]={1,2,3}
        //create cookie object ck[]={email;pass,maxage;1500}
        Cookie c1=new Cookie(email,pass);
        Cookie c2=new Cookie("Hello","How r u");
        c1.setValue("aiml");
        c1.setMaxAge(1500);
        c1.setComment("demo");
        response.addCookie(c1);
        response.addCookie(c2);
        response.getWriter().print("first time access");
        }
        else
        {
            for(int i=0;i<ck.length;i++){
                response.getWriter().print("Key" + ck[i].getName() + "value" + ck[i].getValue() + ck[i].getComment());
            } 
    }
}
}