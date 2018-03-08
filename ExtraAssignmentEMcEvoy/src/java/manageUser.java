/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import EricsPackage.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author EricMcEvoy
 */
@WebServlet(urlPatterns = {"/manageUser"})
public class manageUser extends HttpServlet {
    
    private UserFacade userFacade;
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
       
        
        /*
        // Sadly I had connection issues with the danu6 database - Quelle Surprise!!
        // I have a User table set up on this database
        // The user Entity Class from the Database imported is the default user class
        // Since the connection is failing I can't get my own user class! :(
        // I shall write the code as it would work if the connection was working
        */
        
        HttpSession sesh = request.getSession();
        
        //------- User creation case ---------//
        User u = new User();
  
        String fname = request.getParameter("firstname");
        String sname = request.getParameter("surnname");
        String email = request.getParameter("email");
        
        u.setFirstname(fname);
        u.setSurname(sname);
        u.setEmail(email);
        
        userFacade.create(u); // create instance in db
        
        //------------------------------------//
        
        //-------- Deleting case -------------//
        
        String userToDeleteByEmail =  request.getParameter(userToDelete); //fetching user email from request
        User userToDelete = userFacade.find(userToDeleteByEmail); //creating user object
        userFacade.remove(userToDelete); //deleting from fb
         
         //------------------------------------//
        
        List users = userFacade.findAll(); // retrieves all users from db
        sesh.setAttribute("users", users); // sets users to a session object to be displayed on displayUsers jsp
        
        response.sendRedirect("ListBook.jsp"); // redirects to displayUsers jsp
        
      
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
