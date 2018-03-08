<%-- 
    Document   : displayUsers
    Created on : Nov 28, 2016, 1:21:25 AM
    Author     : EricMcEvoy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User List</h1>
        <table id="bookList" border="3">
<tr >
    <th bgcolor=>First Name</th>
    <th bgcolor=>Second Name</th>
    <th bgcolor=>Email</th>
    
</tr>

<c:forEach var="u" begin="0" items="${users}">
<tr>
    <td>${b.firstname}"&nbsp;&nbsp;</td> 
    <td>${b.surname}&nbsp;&nbsp;</td> 
    <td>${b.email}&nbsp;&nbsp;</td> 
 
    
    <td style="border: none;">
                              <div>
                                    <form method="post" action="manageUser">
                                        <input type="hidden"  name="userToDelete" value="${u.email}"/> 
                                       
                                  
                                        <input type="submit" value="Delete..."/> 
                                    </form>
                                </div>
                            </td>
                          
</tr>
</c:forEach>

<a href="register.jsp"><strong>Add a Book record!</strong></a>
</table>
    </body>
</html>
