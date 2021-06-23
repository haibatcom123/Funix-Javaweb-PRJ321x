<%-- 
    Document   : HomePage
    Created on : May 21, 2021, 5:05:05 PM
    Author     : dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${sessionScope.user != null}">
            <div class="title">
                <h1 style="color: aqua"> ${mess}</h1>
            </div>
            <a style="font-size: 30px; font-weight: bold;" href="Profile.jsp">View profile</a> <br><br> <br><br>
            <a style="font-size: 30px; font-weight: bold;" href="list">View All User</a>
        </c:if>
        <c:if test="${sessionScope.user == null}">
            <div class="title">
                <h1 style="color: aqua">You must login before access this page</h1>
                <h1 style="color: aqua">If you login with Account in Database that it login successfully but please test with account in Map</h1>
            </div>
        </c:if>
    </body>
</html>
