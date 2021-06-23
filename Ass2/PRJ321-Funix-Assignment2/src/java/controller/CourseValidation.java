/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class CourseValidation extends HttpServlet {

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
        String fullName = request.getParameter("fullName");
        String country = request.getParameter("country");
        String[] courses = request.getParameterValues("course");
        String co1 = "";
        String co2="";
        String ageString = request.getParameter("age");
        int age = 0;
        String[] chbxValues = request.getParameterValues("chbxLanguage");
        
        if(fullName.isEmpty()||ageString.isEmpty()){
            request.setAttribute("error", "You must input all the information!");
            request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
        }
        if (fullName.matches(".*\\d+.*")) {
            request.setAttribute("error", "Full name cannot be empty and contains no digits !");
            request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
        }
        
        try {
            age = Integer.parseInt(ageString);
        } catch (Exception e) {
            request.setAttribute("error", "Age cannot be empty !");
            request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
        }
        if (age < 18 || age > 40) {
            request.setAttribute("error", "Age must be more than 18, and less than 40 !");
            request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
        }
        if (chbxValues == null) {
            request.setAttribute("error", "You must choose at least one language !");
            request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
        }
        for (int i = 0; i < courses.length; i++) {
            co1+=courses[i].toString();
        }
        for (int i = 0; i < chbxValues.length; i++) {
            co2+=chbxValues[i].toString();
        }
        
        
        
        

        request.setAttribute("fullName", fullName);
        request.setAttribute("ageString", ageString);
        request.setAttribute("country", country);
        request.setAttribute("courses", co1);
        request.setAttribute("chbxLanguage", co2);
        request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
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
