<%-- 
    Document   : SearchResults
    Created on : Nov 2, 2016, 7:56:27 PM
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
<table id="bookList" border="3">
<tr >
    <th bgcolor=>Name</th>
    <th bgcolor=>Author</th>
    <th bgcolor=>Pages</th>
    <th bgcolor=>Year Published</th>
</tr>

<c:forEach var="b" begin="0" items="${searchResults}">
<tr>
    <td><c:out value="${b.name}"/>&nbsp;&nbsp;</td> 
    <td>${b.author}&nbsp;&nbsp;</td> 
    <td>${b.pages}&nbsp;&nbsp;</td> 
    <td>${b.publishedYear}&nbsp;&nbsp;</td>  
    
    
</tr>
</c:forEach>

<a href="CreateBook.jsp"><strong>Add a Book record!</strong></a>
</table>
    </body>
</html>
