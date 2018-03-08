<%-- 
    Document   : BookUpdate
    Created on : Oct 26, 2016, 2:58:45 PM
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
        <h1>Book Edit!</h1>
     <form id="updateBook" action="BookUpdateServlet" method="post">
    <table>
        
        <tr><td>Name</td><td><input type="text" id = "name" name="name" /></td></tr>
        <tr><td>Author</td><td><input type="text" id = "author" name="author" /></td></tr>
        <tr><td>Pages</td><td><input type="text" id = "pages" name="pages" /></td></tr>
        <tr><td>Year Published</td><td><input type="text" id = "yearPublished" name="yearPublished" /></td></tr>
       
    </table>
         <input type="hidden" name="id" id="id" value="${param.id}"/>
    <input type="submit" id="UpdateBook" value="UpdateBook" />
    </form>
<a href="ListBook"><strong>Go to List of Books</strong></a>
    </body>
</html>
