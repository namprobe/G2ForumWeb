<%-- 
    Document   : viewPost
    Created on : Apr 23, 2024, 12:07:35 PM
    Author     : APC
--%>

<%@page import="java.util.List"%>
<%@page import="g2.postTbl.postDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Page</title>
    </head>
    <body>
        <%
            postDTO view_post = (postDTO) request.getAttribute("VIEWPOST");
            if (view_post != null) {
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>Content</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= view_post.getPost_id()%></td>
                    <td><%= view_post.getTitle()%></td>
                    <td><%= view_post.getContent()%></td>
                </tr>
            </tbody>
        </table>
        <%
            }
        %>
        
        <%
            List<commentDTO> list_comment = (List<commentDTO)) request.getAttribute("LISTCOMMENT");
            
        %>
        
        <h1></h1>
    </body>
</html>
