<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : printFibonacci
    Created on : May 2, 2021, 2:11:12 PM
    Author     : dell
--%>



<div class="container justLike">
  <%
    int n1 = 0, n2 = 1, fib = 0;
    while (fib < 10946) {
      fib = n1 + n2;
      n1 = n2;
      n2 = fib;
      out.println("<h2>" + fib + "</h2>");
    };
  %>
</div>


