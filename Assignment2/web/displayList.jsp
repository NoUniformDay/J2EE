<%-- 
    Document   : displayList
    Created on : 20-Sep-2016, 16:33:44
    Author     : 0063190S
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Distribution List</title>
    </head>
    <body>
         <h1>Distribution List</h1>
        <table>
            <thead> <td> <b> Distribution List </b></td></thead>
            <%
                List<String> list = (ArrayList) session.getAttribute("list");
                for (int i = 0; i < list.size(); i++) 
                {
            %>
        <tr> <td> <% out.println(list.get(i)); %> </td> </tr>
            <%
                }
            %>
    </table>
    <br>
             <h3><a href="addUser.html" >Add an email to the list</a></h3>
    </body>
</html>
