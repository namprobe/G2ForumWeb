<%-- 
    Document   : login
    Created on : Apr 11, 2024, 2:36:37 PM
    Author     : APC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="MainController" method="post">
            User Name<input type="text" name="txtUserName"/><br/>
            Password<input type="password" name="txtPassword"/><br/>
            <input type="submit" name="btAction" value="Login"/>
            <input type="reset" value="Reset"/>
        </form>
        <c:set var="error" value="${requestScope.ERROR}"/>
        <c:if test="${not empty error}">
            <p><b>${error}</b></p>
        </c:if>
    </body>
</html>
