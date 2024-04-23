<%-- 
    Document   : viewPost
    Created on : Apr 23, 2024, 12:04:06 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Post</title>
</head>
<body>
    <h1>View Post</h1>
    
    <%-- Retrieve Post Details --%>
  <%--  <c:set var="postId" value="${param.postId}" />
    <c:set var="postTitle" value="Post Title" /> <!-- Replace with actual post title -->
    <c:set var="postContent" value="Post Content Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut risus quis nisi commodo tristique." /> <!-- Replace with actual post content -->
    <c:set var="postAuthor" value="John Doe" /> <!-- Replace with actual post author -->
  --%>
    <c:set var="post" value="${requestScope.POST_INFO}"/>
    <c:set var="comments" value="${requestScope.POST_COMMENTS}" /> <!-- Replace with actual comments -->
    <c:set var="author" value="${requestScope.AUTHOR}"/>
    <c:set var="voteError" value="${requestScope.VOTE_ERROR}"/>

    <%-- Display Post --%>
    <div id="post">
        <h2>${post.title}</h2>
        <p>${post.content}</p>
        <p>Author: ${author.username}</p>

        <%-- Vote Buttons --%>
        <form action="MainController" method="post">
            <input type="hidden" name="txtViewPostId" value="${post.user_id}">
            <input type="submit" name="voteType" value="Upvote">
            <p style="margin-left: 20px;margin-right: 20px">${post.voteSum}</p>
            <input type="submit" name="voteType" value="Downvote">
        </form>
        <c:if test="${not empty voteError}">
            <c:url value="MainController" var="removeVoteUrl">
                <c:param name="btAction" value="Remove Vote" />
                <c:param name="txtViewPostID" value="${post.post_id}" />
                <c:param name="txtUserID" value="${session.ACC.user_id}" />
            </c:url>

            <a href="${removeVoteUrl}">${voteError.VoteHasBeenMadeError}</a>
        </c:if>
        
        
            
    </div>

    <%-- Comment Section --%>
    <div id="comments">
        <h2>Comments</h2>
        <c:forEach var="comment" items="${comments}">
            <div class="comment">
                <p>${comment.content}</p>
                <p>Commented by: ${comment.user_id}</p>
            </div>
        </c:forEach>

        <%-- Comment Form --%>
        <h3>Add a Comment</h3>
        <form action="CommentController" method="post">
            <input type="hidden" name="postId" value="${postId}">
            <textarea name="comment" rows="4" cols="50"></textarea><br>
            <input type="submit" value="Submit Comment">
        </form>
    </div>
</body>
</html>

