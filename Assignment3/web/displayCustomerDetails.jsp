<%-- 
    Document   : displayCustomerDetails
    Created on : Oct 5, 2016, 5:54:02 PM
    Author     : EricMcEvoy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <th>Contact.</th><th>Phone</th><th>City</th><th>Address</th>
                       
                    </tr>
               
                </thead>
                <tbody>
               
                     <c:forEach var="c" items="${customers}">
                        <c:if test="${c.customerNumber} == (${param.number})">
                             <td><c:out value="${c.customerName}"/></td> <td><c:out value="${c.phone}"/></td>
                             <td><c:out value="${param.address}"/></td>
                        </c:if>  
                     </c:forEach>
                        <tr>
                          
                        <div> Tried creating my own Details Servlet and serving a customer object ${customer} to the jsp built from
                            params from the displaySummary JSP details form but still had no luck,
                            feedback here would really help restore my sanity :( </div
                            
                        
                             
                             
                        </tr>
                   
                </tbody>
            </table>
        </div>
    </body>
</html>
