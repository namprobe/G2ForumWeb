<%-- 
    Document   : update
    Created on : Apr 22, 2024, 2:51:55 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Information page</title>
    </head>
    <body>
        <h1>Information</h1>
        <form action="MainController" method="post">
            User ID:<br/>
            <input type="text" name="txtUserID" value="${acc.user}"
        </form>
    </body>
</html>
