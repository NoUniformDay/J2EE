

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Person Record</title>
    </head>
    <body>

    <h1>Create a Book record</h1>
    <form id="createBook" action="CreateBook" method="post">
    <table>
        <tr><td>ID:</td><td><input type="text" id = "id" name="id" /></td></tr>
        <tr><td>Name</td><td><input type="text" id = "name" name="name" /></td></tr>
        <tr><td>Author</td><td><input type="text" id = "author" name="author" /></td></tr>
        <tr><td>Pages</td><td><input type="text" id = "pages" name="pages" /></td></tr>
        <tr><td>Year Published</td><td><input type="text" id = "yearPublished" name="yearPublished" /></td></tr>
       
    </table>
    <input type="submit" id="CreateBook" value="CreateBook" />
    </form>
<a href="ListBook"><strong>Go to List of Books</strong></a>
</body>
</html>
