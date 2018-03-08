/**
 * @author EricMcEvoy
 */
package servlets;

import java.io.File;
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
import src.TestObject;


@WebServlet(name = "getCustomers", urlPatterns = {"/getCustomers"})
public class getCustomers extends HttpServlet {

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
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex)
        {
            System.out.println(ex.toString());
        }

        CustomerDAO cb = new CustomerDAO();
        List<Customer> list = cb.getCustomers();
    
        
        ArrayList<TestObject> t = new ArrayList<TestObject>();
        t.add(new TestObject("Alpha2"));
        t.add(new TestObject("Alpha1"));
        t.add(new TestObject("Alpha3"));
        t.add(new TestObject("Alpha4"));
        
        
        // TEST 
        for(Customer c : list){
            System.out.println("Session list : " +c.toString());
        }
        
        System.out.print("Print");
        HttpSession session = request.getSession();
        if(!list.isEmpty()){
         session.setAttribute("customers", list);
        }
        else{
            System.out.println("List is empty");
        }
        
        session.setAttribute("test",t);//test object list
        response.sendRedirect("displayCustomerSummary.jsp");
        
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
