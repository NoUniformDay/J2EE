
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : displayCustomerSummary
    Created on : Oct 5, 2016, 5:49:26 PM
    Author     : EricMcEvoy
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>Customer No.</th><th>Name</th><th>City</th><th>Credit Limit</th>
                       
                    </tr>
                   
                </thead>
                <tbody>
                    <c:forEach var="c" items="${customers}">
                        <tr>
                            <td><c:out value="${c.customerNumber}"/></td> <td><c:out value="${c.customerName}"/></td>
                            <td><c:out value="${c.city}"/></td> <td><c:out value="${c.creditLimit}"/></td> 
                            
                            <td style="border: none;">
                                <div>
                                    <form method="post" action="displayCustomerDetails.jsp">
                                        <input type="hidden"  name="number" value="${c.customerNumber}"/> 
                                        <input type="hidden"  name="name" value="${c.customerName}"/> 
                                        <input type="hidden"  name="city" value="${c.city}"/> 
                                        <input type="hidden"  name="creditLimit" value="${c.creditLimit}"/> 
                                     
                                        <input type="submit" value="Details..."/> 
                                    </form>
                                </div>
                            </td>
                             
                             
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>


