<%-- 
    Document   : index
    Created on : Jan 13, 2016, 10:00:51 AM
    Author     : ldc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
            <%
                String message = "Hello from Java! Yay!";
            %>
            <%= message %>
        </p>
    </body>
</html>
