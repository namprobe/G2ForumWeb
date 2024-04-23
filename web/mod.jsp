<%-- 
    Document   : mod
    Created on : Apr 21, 2024, 10:29:10 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mod Page</title>
    </head>
    <body>
        <a href="ViewProfile">Your Profile</a>
        <form action="MainController" method="post">
            <input type="submit" name="btAction" value="Logout"/>
        </form>
        <a href="SearchUserServlet">User Management</a>
    </body>
</html>
