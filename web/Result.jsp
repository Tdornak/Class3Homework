<%-- 
    Document   : Result
    Created on : Aug 27, 2014, 9:30:31 PM
    Author     : tdornak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <h1>The area is...</h1>
        <%
            Object obj = request.getAttribute("area");
            if (obj == null) {
                out.println("Something has gone horribly wrong");
            } else {
                out.println(obj.toString());
            }
            
        %>
    </body>
</html>
