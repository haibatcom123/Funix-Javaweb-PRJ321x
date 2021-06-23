<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <jsp:useBean id="a" class="dao.ArticleDAO" scope="request"></jsp:useBean>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Grid Example</title>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
            <link href="css/style.css" rel="stylesheet" type="text/css"/>
        </head>
        <body>
            <div class= "container">
                <div class= "row">
                    <div class ="col-sm-4 backg">
                        <ul class="nav flex-column article">
                            <li class="nav-item">
                                <a href="HomePage.jsp">
                                    <img src="image/hoasen.jpg" alt=""/>
                                </a>

                            </li>
                        <c:forEach items="${a.category}" var="x">
                            <li class="nav-item">
                                <a class="nav-link text-light" href="#">${x.cname}</a>
                            </li>
                        </c:forEach>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="author">Bài viết đã xuất bản</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="AllPost.jsp">Tất cả bài viết</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="AddNew.jsp">Bài Viết mới</a>
                        </li>
                    </ul>
                </div>
                <div class ="col-sm-8 bg-light">

                    <div class ="col-sm-12 bg-light">
                        <h1>All Post</h1>
                    </div>
                    <div class ="col-sm-12 bg-light">
                        <ul class="nav flex-column">
                        <c:forEach items="${a.allArticle}" var="x">
                                <li class="nav-item">
                                    <p class="time">${x.timePost}</p>
                                    <a class="nav-link article title" href="detail?id=${x.id}">
                                        ${x.title} <br>Author: ${x.au}
                                    </a>
                                    <a class="nav-link article text-dark shortdes" href="detail?id=${x.id}">
                                        ${x.shorDes}
                                    </a>

                                </li>
                                <br>
                                <br>
                                <br>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>