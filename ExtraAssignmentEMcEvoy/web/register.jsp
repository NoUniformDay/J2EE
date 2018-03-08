<%-- 
    Document   : register
    Created on : Nov 28, 2016, 12:17:36 AM
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
       
        <h1>Create a new User</h1>
    <form id="createUser" action="manageUser" method="post">
    <table>
        
        <tr><td>First Name</td><td><input type="text" id = "firstname" name="firstname" /></td></tr>
        <tr><td>Surname</td><td><input type="text" id = "surname" name="surnname" /></td></tr>
        <tr><td>Email</td><td><input type="text" id = "pages" name="email" /></td></tr>
       
    </table>
    <input type="submit" id="createUser" value="createUser" />
    </form>
    </body>
</html>
