/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class registerservlet1 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String n=request.getParameter("user");
        String m=request.getParameter("mail");
        String p=request.getParameter("pass");
        Cookie ck=new Cookie("Username",n);
        Cookie ck1=new Cookie("Email",m);
        Cookie ck2=new Cookie("password",p);
        response.addCookie(ck);
        response.addCookie(ck1);
        response.addCookie(ck2);
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registerservlet1</title>");    
            out.println("<style>a{ border:2px solid black; padding:2px; margin-LEFT:50%; text-decoration: none; color:red;}</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='http://localhost:8080/WebApplication1/registerservlet2'>confirm</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
