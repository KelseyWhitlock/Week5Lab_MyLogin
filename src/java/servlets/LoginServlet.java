/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author Kelsey
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String logout = request.getParameter("login");
        if(logout != null){
            session.invalidate();
            String note = "You have sucessfully logged out";
            request.setAttribute("message", note);
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usename = request.getParameter("username");
        String password = request.getParameter("pass");
        User user = null;
        AccountService checked = new AccountService();
        
        if(usename == null || usename.equals("") && password == null || password.equals("") ){
            request.setAttribute("username", usename);
            request.setAttribute("password", password);
            String note = "Enter your username and password";
            request.setAttribute("message", note);
        }
        
    }

  
}
