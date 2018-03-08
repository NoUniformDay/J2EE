<%-- 
    Document   : ListBook
    Created on : Oct 18, 2016, 5:10:42 PM
    Author     : EricMcEvoy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Books Table!</h1>
   
  
 
<table id="bookList" border="3">
<tr >
    <th bgcolor=>Name</th>
    <th bgcolor=>Author</th>
    <th bgcolor=>Pages</th>
    <th bgcolor=>Year Published</th>
</tr>

<c:forEach var="b" begin="0" items="${bookList}">
<tr>
    <td><c:out value="${b.name}"/>&nbsp;&nbsp;</td> 
    <td>${b.author}&nbsp;&nbsp;</td> 
    <td>${b.pages}&nbsp;&nbsp;</td> 
    <td>${b.publishedYear}&nbsp;&nbsp;</td>  
    
    <td style="border: none;">
                              <div>
                                    <form method="post" action="BookUpdate.jsp">
                                        <input type="hidden"  name="id" value="${b.id}"/> 
                                        <input type="hidden"  name="name" value="${b.name}"/> 
                                        <input type="hidden"  name="author" value="${b.author}"/> 
                                        <input type="hidden"  name="publishedYear" value="${b.publishedYear}"/> 
                                        <input type="hidden"  name="pages" value="${b.pages}"/> 
                                  
                                        <input type="submit" value="Modify..."/> 
                                    </form>
                                </div>
                            </td>
                            <td style="border: none;">
                                <div>
                                    <form method="post" action="BookDeleteServlet">
                                        <input type="hidden"  name="id" value="${b.id}"/> 
                                        <input type="submit" value="Delete"/> 
                                    </form>
                                </div>
                            </td> 
</tr>
</c:forEach>

<a href="CreateBook.jsp"><strong>Add a Book record!</strong></a>
</table>
    </body>
</html>
