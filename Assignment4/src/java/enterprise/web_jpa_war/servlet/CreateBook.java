/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.servlet;

import enterprise.web_jpa_war.entity.Book;
import enterprise.web_jpa_war.entity.BookFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EricMcEvoy
 */
@WebServlet(name = "CreateBook", urlPatterns = {"/CreateBook"})
public class CreateBook extends HttpServlet {
    
    private BookFacade bookFacade;
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
        Book b = new Book();
        int id =  Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        int yearPublished = Integer.parseInt(request.getParameter("yearPublished"));
        int pages = Integer.parseInt(request.getParameter("pages"));
         
        
        System.out.println("ID: "+id);
        System.out.println("Name : "+name);
        System.out.println("Author : "+author);
        System.out.println("Year Published : "+yearPublished);
        System.out.println("Pages : "+pages);

        
        b.setId(id);
        b.setName(name);
        b.setAuthor(author);
        b.setPages(pages);
        b.setPublishedYear(yearPublished);
      
        /*
        Hi Keep getting internal server error and 
        NullPointerException hence I'm persisting a test object
        Still recieve the error, leading me to believe there's some
        access problem in my entity classes to the db because I can run INSERT
        queries in the SQL console in Netbeans
        
        */
  
        Book test = new Book(5, "test", "tester", 20, 25); 
        //System.out.println(test.toString());
        //bookFacade.create(test);
        
        bookFacade.create(b);

        
        response.sendRedirect("ListBook.jsp");
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
