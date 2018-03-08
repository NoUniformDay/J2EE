/*
 * Author - Eric McEvoy 
 */
package src;

/**
 *
 * @author o_molloy
 */
public class Customer
{

    private int customerNumber;
    private String customerName;
    private String city;
    private int creditLimit;
    private String phone;
    private String address;
   
    public int getCustomerNumber()
    {
        return customerNumber;
    }

    public void setCustomerNumber(int cNum)
    {
        this.customerNumber = cNum;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String cName)
    {
        this.customerName = cName;
    }
    
    public String getCity()
    {
        return city;
    }
    
     public void setCity(String c)
    {
        this.city = c;
    }
     
     public int getCreditLimit()
    {
        return creditLimit;
    }
    
     public void setCreditLimit(int c)
    {
        this.creditLimit = c;
    }
     
      public String getPhone()
    {
        return this.phone;
    }
    
     public void setPhone(String p)
    {
        this.phone = p;
    }
     
       public String getAddress()
    {
        return address;
    }
    
     public void setAddress(String a)
    {
        this.address = a;
    }
    
     public String toString(){
        String s = "Name : "+this.customerName+" ||  Number: "+this.customerNumber+"|| City: "+this.city+"|| Credit Limit: "+this.creditLimit+"";
        return s;
     }
}

   

 

   

  

    

