/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Account;
import Database.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hanh
 */
@WebServlet(name = "SignUpControl", urlPatterns = {"/signup"})
public class SignUpControl extends HttpServlet {

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
        String username = request.getParameter("user").trim();
        String password = request.getParameter("pass").trim();
        String rePass = request.getParameter("re-pass").trim();
        String regex1 = "[^$#@%^&*]{7,}";
        String regex2 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Account a = new Account(username, password);
        Map<Integer, Account> mapAcc = AccMap.getInstance().getMapAcc();
        Set<Integer> keyset = mapAcc.keySet();
        boolean check = true;
        int count = 0;
        for (Integer i : keyset) {
            if (username.equals(mapAcc.get(i).getUsername())) {
                check = false;
            }
            count++;
        }
        if (username.isEmpty() || password.isEmpty() || rePass.isEmpty()) {
            request.setAttribute("errorx", "You must input all information!");
            request.getRequestDispatcher("SignUp.jsp").forward(request, response);
        }
        if (!username.matches(regex1) || username.length() < 6) {
            request.setAttribute("errorx", "Username: contains no special characters such as $#@%^&*, the length must be > 6");
            request.getRequestDispatcher("SignUp.jsp").forward(request, response);
        }
        if (!password.matches(regex2) || username.length() < 8) {
            request.setAttribute("errorx", " Password: must contain at least one capital letter, one digit, one special character, the length must be > 8");
            request.getRequestDispatcher("SignUp.jsp").forward(request, response);
        }
        if (!rePass.equals(password)) {
            request.setAttribute("errorx", " Password and Re-password must be the same!");
            request.getRequestDispatcher("SignUp.jsp").forward(request, response);
        }
        if (check == true) {
            AccMap.mapAcc.put(++count,a);
            HttpSession session = request.getSession();
            session.setAttribute("user", a);
            AccountDAO accountDAO = new AccountDAO();
            accountDAO.addnew(username, password);
            request.setAttribute("mess", "Welcome to the board");
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        } else {
            //request.setAttribute("error", "123");
            request.setAttribute("errorx", "Account already exists");
            request.getRequestDispatcher("SignUp.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
