<%-- 
    Document   : test
    Created on : Jun 7, 2021, 11:42:33 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h5 style="color: red">${mess}</h5>
        <form action="test" method="POST">
            <input type="text" name="number" placeholder="Enter your Year of Birth">
            <input type="submit" name="btnAction">
        </form>
        <%!
            public int tinhTong(int n) {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;

                }
                return sum;
            }
        %>
        <%
            int sum = 0;
            for (int i = 0; i < 100; i++) {

            }
        %>
        <%-- 
        --%>
    </body>
</html>
