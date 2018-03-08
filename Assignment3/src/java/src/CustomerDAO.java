/*
 * Eric McEvoy - 13513267 
 */
package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


//CREATE TABLE emp ( empId int, empName varchar(20), phone varchar(20), email varchar(20), 
//salary float, desig varchar(20), primary key(empId));

public class CustomerDAO
{

    private static final String DATABASE_URL = "jdbc:mysql://danu6.it.nuigalway.ie:3306/mydb2595";
    private static final String USERNAME = "mydb2595me";
    private static final String PASSWORD = "tu6jaw";

  

    public List<Customer> getCustomers() throws FileNotFoundException
    {
        List<Customer> list = new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        try
        {
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stmt = con.createStatement();
            //ResultSet rs = stmt.executeQuery("SELECT customerNumber, customerName, city, creditLimit FROM `customers` ORDER BY customerNumber, customerName, city;");
            ResultSet rs = stmt.executeQuery("SELECT customerNumber, customerName, city, creditLimit, phone, addressLine1 FROM `customers` ORDER BY customerNumber, customerName, city, creditLimit, phone, addressLine1;");
            System.out.println("First result exists ? : "+rs.first());
            System.out.println("First from result set : "+rs.getString(2));
            File file = new File ("//Users//EricMcEvoy//Desktop//file.txt");
            
            try (PrintWriter printWriter = new PrintWriter(file)) {
             
               
                
                while (rs.next())
                {
                     
                    Customer cus = new Customer();
                    cus.setCustomerNumber(rs.getInt(1));
                    cus.setCustomerName(rs.getString(2));
                    cus.setCity(rs.getString(3));
                    cus.setCreditLimit(rs.getInt(4));
                    cus.setPhone(rs.getString(5));
                    cus.setAddress(rs.getString(6));
                    
                    
                   // System.out.println(cus.toString());
                    //System.out.println("Test Object retrieved number : "+cus.getCustomerNumber());
                    
                   System.out.println("Phone : "+rs.getString(5));
                   System.out.println("Address : "+rs.getString(6));
                    printWriter.println ("test");
                    list.add(cus);
                    
                }
                
            }
        } catch (SQLException ex)
        {
        } finally
        {
            try
            {
                if (stmt != null)
                {
                    stmt.close();
                }
                if (con != null)
                {
                    con.close();
                }
            } catch (SQLException ex)
            {

            }
        }
        return list;
    }

}


