/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.AccMap;
import model.Account;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Database.AccountDAO;
import model.AccountDB;
import javax.servlet.ServletContext;

/**
 *
 * @author hanh
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        request.getRequestDispatcher("login.jsp").forward(request, response);
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

        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        Map<Integer, Account> mapAcc = AccMap.getInstance().getMapAcc();
        Set<Integer> keyset = mapAcc.keySet();
        Account a = null;
        AccountDAO accountDAO = new AccountDAO();
        AccountDB accDB = accountDAO.checkLogin(username, password);
        for (Integer i : keyset) {
            if (username.equals(mapAcc.get(i).getUsername()) && password.equals(mapAcc.get(i).getPassword())) {
                a = new Account(username, password);
                break;
            }
        }
        if (a != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", a);
            request.setAttribute("mess", "Welcome back !" + username);
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        }else if(accDB != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", a);
            //ServletContext application = request.getServletContext();
            //application.setAttribute(username, keyset);
            request.setAttribute("mess", "Welcome back !" + username);
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        }
        else {
            request.setAttribute("mess", "wrong username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

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
