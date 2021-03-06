<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <jsp:useBean id="a" class="dao.ArticleDAO" scope="request"></jsp:useBean>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Grid Example</title>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            <link href="style.css" rel="stylesheet" type="text/css"/>
            <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
            <script>tinymce.init({selector: 'textarea'});</script>
            <!--an thong bao tra phi-->
            <style>
                .tox-notifications-container{
                    display: none;
                }
            </style>
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
                            <a class="nav-link text-light" href="author">B??i vi???t ???? xu???t b???n</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="AllPost.jsp">T???t c??? b??i vi???t</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="AddNew.jsp">B??i Vi???t m???i</a>
                        </li>
                    </ul>
                </div>
                <div class ="col-sm-8 bg-light">

                    <div class ="col-sm-12 bg-light">
                        <h1>Xin ch??o ${user.username} - S???a b??i vi???t</h1>
                    </div>
                    <div class ="col-sm-12 bg-light">
                        <form action="UpdateControl?id=${thisArt.id}" method="post">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Ti??u ?????</label>
                                <input name="title" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="input title" value="${thisArt.title}">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Ch??? ?????</label>
                                <input name="shortDes" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="input topic" value="${thisArt.shorDes}">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlTextarea1">N???i dung</label>
                                <textarea name="detailDes" class="form-control" id="exampleFormControlTextarea1" rows="10">${thisArt.detailDes}</textarea>
                            </div>
                            <div class="form-group">
                                <label for="inputState">Category</label>
                                <select name="cateid" id="inputState" class="form-control">
                                    <option selected value="1">Ch??n</option>
                                    <option value="2">Thi???n</option>
                                    <option value="3">M???</option>
                                </select>
                            </div>
                            <div class="form-check">
                                <input checked="" type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">???? xu???t b???n</label>
                            </div>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>