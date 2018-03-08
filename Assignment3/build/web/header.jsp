<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div id="mystyle" style="border: none;">
            <h1>Customer Display Table</h1>
            <p><a href="http://www.nuigalway..ie">N.U.I Galway</a><br/>
                <b>Display Customer Data from the NUIG danu6 Server!</b><br/>
                <%=new Date()%><br>  <br>
                 &NegativeThickSpace; |
                <a href="displayCustomerSummary.jsp">View Customers!</a>
            </p>
        </div>
    </center>
</body>
</html>