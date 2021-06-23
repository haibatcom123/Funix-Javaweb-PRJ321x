<%-- 
    Document   : userCounter
    Created on : May 21, 2021, 5:09:13 PM
    Author     : dell
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>
    <body>
        <c:if test="${sessionScope.user != null}">
            <div class="title">
                <h2> Welcome my page</h2>
            </div>
            <table class="table table-dark">
                <thead>
                    <tr>
                        <th scope="col">Username</th>
                        <th scope="col">Password</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${list}" var="x">
                        <tr>
                            <td>${x.value.username}</td>
                            <td>${x.value.password}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <c:if test="${sessionScope.user == null}">
            <div class="title">
                <h1 style="color: aqua">You must login before access this page</h1>
                <h1 style="color: aqua">If you login with Account in Database that it login successfully but please test with account in Map</h1>
            </div>
        </c:if>

    </body>
</html>
