
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Charm|Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
        <title>Send Form</title>
    </head>
    <body>
        <div class="container" style="padding-top: 3rem;">
            <div class="form-top">
                <h3 style="text-align: center">Send Mail</h3>
                <p style="text-align: right" ><a href="./logout">
                        <i style="text-align: right" class="fas fa-sign-out-alt"> Logout</i>
                    </a> </p>
            </div>
            <form action="./send" method="POST">
                <div class="form-group">
                    <label>To</label>
                        <p style="color: red">${errorTo}</p>
                        <c:if test="${to ne null}">
                            <input type="text" class="form-control" name="to" value="${to}">
                        </c:if>
                        <c:if test="${to eq null}">
                            <input type="text" class="form-control" name="to" placeholder="Recipients">
                        </c:if>
                </div>
                <div class="form-group">
                    <label>CC</label>
                        <c:if test="${cc ne null}">
                            <input type="text" class="form-control" name="cc" value="${cc}">
                        </c:if>
                        <c:if test="${cc eq null}">
                            <input type="text" class="form-control" name="cc">
                        </c:if>
                </div>
                <div class="form-group">
                    <label>Subject</label>
                    <c:if test="${subject ne null}">
                        <input type="text" class="form-control" name="subject" value="${subject}">
                    </c:if>
                    <c:if test="${subject eq null}">
                        <input type="text" class="form-control" name="subject">
                    </c:if>
                </div>
                <div class="form-group">
                    <label>Contents</label>
                        <c:if test="${contents ne null}">
                            <textarea type="text" class="form-control" name="contents">${contents}</textarea>
                        </c:if>
                        <c:if test="${contents eq null}">
                            <textarea type="text" class="form-control" name="contents" placeholder="Contents..."></textarea>
                        </c:if>
                </div>
                <br><button type="submit" class="btn btn-primary">Send</button>
            </form>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
