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
                                <a class="nav-link text-light" href="cate?cid=${x.cid}">${x.cname}</a>
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
                        <h1>Login Form</h1>
                    </div>
                    <div class ="col-sm-12 bg-light">
                        <form action="login" method="post">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Username</label>
                                <input name="username" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label>
                                <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                            </div>
                            <p style="color: red">${mess}</p>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>