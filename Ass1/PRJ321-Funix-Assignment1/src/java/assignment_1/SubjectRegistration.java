/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author demonslight998
 */
public class SubjectRegistration extends HttpServlet {

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
    String name = request.getParameter("name");
    String surname = request.getParameter("surname");
    String phoneNumber = request.getParameter("phoneNumber");
    String email = request.getParameter("email");
    String[] chbxValues = request.getParameterValues("chbxSubjects");

    request.setAttribute("name", name);
    request.setAttribute("surname", surname);
    request.setAttribute("phoneNumber", phoneNumber);
    request.setAttribute("email", email);
    request.setAttribute("chbxValues", chbxValues);
request.getRequestDispatcher("/Result-SubjectRegistration.jsp").forward(request, response);
//    if(name.isEmpty()||surname.isEmpty()||phoneNumber.isEmpty()||email.isEmpty()){
//        request.setAttribute("error", "Name cannot be empty and contains no digits !");
//        request.getRequestDispatcher("/SubjectRegistration.jsp").forward(request, response);
//    }else{
//        request.getRequestDispatcher("/Result-SubjectRegistration.jsp").forward(request, response);
//    }
    
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
