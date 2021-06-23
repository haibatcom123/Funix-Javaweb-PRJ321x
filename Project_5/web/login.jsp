

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link href="css/loginStyle.css" rel="stylesheet" type="text/css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <form action="./login" class="box" method="post">
            <h1>Login</h1>
            <input id="user" type="text" name="email" placeholder="Username" required
                   data-validate = "Valid email is required: ex@abc.xyz"/>
            <input type="password" name="password" placeholder="Password" required/>
            <c:if test="${error != null}">
                <h3 > ${error} </h3>
            </c:if>
            <input type="submit" name="" value="Login" />
        </form>
    </body>
</html>
