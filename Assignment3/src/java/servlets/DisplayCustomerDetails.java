/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import src.Customer;
import src.CustomerDAO;

/**
 *
 * @author EricMcEvoy
 */
@WebServlet(name = "DisplayCustomerDetails", urlPatterns = {"/DisplayCustomerDetails"})
public class DisplayCustomerDetails extends HttpServlet {

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
        
        Customer c = new Customer();
         HttpSession session = request.getSession();
        Object list = session.getAttribute("list");
        
        // TESTING 
        System.out.print("Request parameters: "+request.getParameter("name"));
        System.out.print("Request parameters: "+request.getParameter("number"));
        System.out.print("Request parameters: "+request.getParameter("city"));
        System.out.print("Request parameters: "+request.getParameter("creditLimit"));
        
        c.setCustomerNumber(Integer.parseInt(request.getParameter("number")));
        c.setCustomerName(request.getParameter("name"));
        c.setCity(request.getParameter("city"));
        c.setCreditLimit(Integer.parseInt(request.getParameter("creditLimit")));
        
       
        session.setAttribute("customer", c); //the specific customer whose details will be displayed
        response.sendRedirect("displayCustomerDetails.jsp");
        
       
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
