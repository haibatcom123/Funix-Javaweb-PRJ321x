/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author Yajin
 */
public class SendController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        request.getRequestDispatcher("./formSend.jsp").forward(request, response);
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
        String to = request.getParameter("to").trim();
        String cc = request.getParameter("cc").trim();
        String subject = request.getParameter("subject");
        String contents = request.getParameter("contents");
        if (to.trim().isEmpty()) {
            request.setAttribute("errorTo", "To not empty!");
            request.setAttribute("to", to);
            request.setAttribute("cc", cc);
            request.setAttribute("subject", subject);
            request.setAttribute("contents", contents);
            request.getRequestDispatcher("./formSend.jsp").forward(request, response);
        }
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        String email = account.getEmail();
        String password = account.getPassword();
        
        String[] toList = to.split(",");
        for (String recTo : toList) {
            sendMail(email, password, subject, contents, Message.RecipientType.TO, recTo.trim());
        }
        String[] ccList = cc.split(",");
        for (String recCc : ccList) {
            sendMail(email, password, subject, contents, Message.RecipientType.CC, recCc.trim());
        }

        request.getRequestDispatcher("./result.jsp").forward(request, response);
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

    private void sendMail(String email, String password, String subject, String contents, Message.RecipientType recipentType, String to) {
        String name = "Hoang Duc Truong";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        };

        Session session = Session.getInstance(props, auth);
        Message msg = new MimeMessage(session);
        try {
            msg.setSubject(subject);
            msg.setText(contents);
            msg.setFrom(new InternetAddress(email, name));
            msg.setRecipient(recipentType, new InternetAddress(to));

            Transport.send(msg);
        } catch (MessagingException | UnsupportedEncodingException e) {
            
        }

    }

}
