<%-- 
    Document   : index
    Created on : Jan 13, 2016, 10:00:51 AM
    Author     : ldc
--%>
<%@page import = "java.sql.*" %>
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
        <ul>
            <%
                Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/example_db", "todd", "password");
                Statement s = c.createStatement();
                
                String query = "SELECT * FROM PEOPLE";
                ResultSet result = s.executeQuery(query);
                while (result.next()) {
                    %>
                    <li><%= result.getString("name") %></li>
                    <%
                }
                c.close();
            %>
        </ul>  
        </p>
    </body>
</html>
