<%-- 
    Document   : createPost
    Created on : Apr 23, 2024, 3:29:51 AM
    Author     : APC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Post Page</title>
    </head>
    <body>
        <form>
            <h1>Posting on topic: </h1>
            Post title: <input type="text" name="txtPostTitle"/></br>
            Post content: <input type="text" name="txtPostContent"/></br>
            <p><font color='red'>${requestScope.ERRORS.postLenError}</font></p>       
            <p><font color='red'>${requestScope.ERRORS.postExisted}</font></p>
            <!--Image-->
            <p><font color='red' >${requestScope.ERRORS.imageError}</font></p>
            </br>
            <input type="submit" name="btAction" value="Create_Post"/>
            <input type="reset"/>
        </form>
    </body>
</html>
