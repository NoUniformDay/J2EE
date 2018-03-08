<%-- 
    Document   : BookSearch
    Created on : Nov 2, 2016, 6:38:19 PM
    Author     : EricMcEvoy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
    <h1>Search for a book Record!</h1>
    <form id="searchQuery" action="SearchServlet" method="post">
    <table>
        <tr><td>Search : </td><td><input type="text" id = "searchQuery" name="searchQuery" /></td></tr>
     
       
    </table>
    </form>
<a href="ListBook"><strong>Go to List of Books</strong></a>
    </body>
</html>
