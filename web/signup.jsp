<%-- 
    Document   : signup
    Created on : Apr 22, 2024, 3:07:12 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup Page</title>
    </head>
    <body>
         <h1>Signup Page</h1>
        <form action="MainController" method ="post">
            Email<input type="text" name="txtEmail"/></br>
            Username<input type="text" name="txtUserName"/></br>
            <p><font color='red'>${requestScope.ERRORS.userNameLenError}</font></p>       
            <p><font color='red'>${requestScope.ERRORS.accountExisted}</font></p>
            Password(5 chars)<input type="password" name="txtPassword"/><br>
            <p><font color='red' >${requestScope.ERRORS.passwordLenError}</font></p>
            </br>
            Confirm Password<input type="password" name="txtConfirm"/></br>
            <p><font color='red' >${requestScope.ERRORS.confirmNotMatch}</font></p>
            <input type="submit" name="btAction" value="Signup"/>
            <input type="reset"/>
        </form>
    </body>
</html>
