<%--
    Document   : printOdd
    Created on : May 2, 2021, 2:17:21 PM
    Author     : dell
--%>

<jsp:include page="fragment/header.jsp" />

<div class="container justLike" style="background-color: yellow">
  <%
    for (int i = 0; i < 500; i++) {
      if (i % 2 != 0 && i % 5 == 0) {
        out.println("<h2 class=\"special\">" + i + "</h2>");
      } else if (i % 2 != 0) {
        out.println("<h2>" + i + "</h2>");
      }
    }
  %>
</div>

<jsp:include page="fragment/footer.jsp" />
