<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : Result-SubjectRegistration
    Created on : May 2, 2021, 4:57:56 PM
    Author     : dell
--%>

<jsp:include page="fragment/header.jsp" />

<div class="container getForm">
  Name: <label>${name}</label> <br>
  Surname: <label>${surname}</label> <br>
  Phone Number: <label>${phoneNumber}</label> <br>
  Email: <label>${email}</label> <br>
  Subjects Name:
  <c:forEach var="value" items="${chbxValues}">
    <label>${value}</label> <br>
  </c:forEach>

</div>

<jsp:include page="fragment/footer.jsp" />
