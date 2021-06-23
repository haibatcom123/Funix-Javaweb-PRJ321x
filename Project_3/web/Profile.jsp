<%-- 
    Document   : Profile
    Created on : May 21, 2021, 5:08:50 PM
    Author     : dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->


        <link rel="stylesheet" href="https://bootswatch.com/4/simplex/bootstrap.min.css"/>

        <style>
            body{
                padding-top: 68px;
                padding-bottom: 50px;
            }
            .image-container {
                position: relative;
            }

            .image {
                opacity: 1;
                display: block;
                width: 100%;
                height: auto;
                transition: .5s ease;
                backface-visibility: hidden;
            }

            .middle {
                transition: .5s ease;
                opacity: 0;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                -ms-transform: translate(-50%, -50%);
                text-align: center;
            }

            .image-container:hover .image {
                opacity: 0.3;
            }

            .image-container:hover .middle {
                opacity: 1;
            }
        </style>
    <c:if test="${sessionScope.user != null}">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="card">

                        <div class="card-body">
                            <div class="card-title mb-4">
                                <div class="d-flex justify-content-start">
                                    <div class="image-container">
                                        <img src="data:image/png;base64,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" id="imgProfile" style="width: 150px; height: 150px" class="img-thumbnail" />
                                        <div class="middle">
                                            <input type="button" class="btn btn-secondary" id="btnChangePicture" value="Change" />
                                            <input type="file" style="display: none;" id="profilePicture" name="file" />
                                        </div>
                                    </div>
                                    <div class="userData ml-3">
                                        <h2 class="d-block" style="font-size: 1.5rem; font-weight: bold"><a href="javascript:void(0);"> ${user.username}</a></h2>
                                    </div>
                                    <div class="ml-auto">
                                        <input type="button" class="btn btn-primary d-none" id="btnDiscard" value="Discard Changes" />
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-12">
                                    <ul class="nav nav-tabs mb-4" id="myTab" role="tablist">
                                        <li class="nav-item">
                                            <a class="nav-link active" id="basicInfo-tab" data-toggle="tab" href="#basicInfo" role="tab" aria-controls="basicInfo" aria-selected="true">Basic Info</a>
                                        </li>

                                    </ul>
                                    <div class="tab-content ml-1" id="myTabContent">
                                        <div class="tab-pane fade show active" id="basicInfo" role="tabpanel" aria-labelledby="basicInfo-tab">


                                            <div class="row">
                                                <div class="col-sm-3 col-md-2 col-5">
                                                    <label style="font-weight:bold;">UserName</label>
                                                </div>
                                                <div class="col-md-8 col-6">
                                                    ${user.username}
                                                </div>
                                            </div>
                                            <hr />

                                            <div class="row">
                                                <div class="col-sm-3 col-md-2 col-5">
                                                    <label style="font-weight:bold;">Password</label>
                                                </div>
                                                <div class="col-md-8 col-6">
                                                    ${user.password}
                                                </div>
                                            </div>
                                            <hr />


                                        </div>
                                        <div class="tab-pane fade" id="connectedServices" role="tabpanel" aria-labelledby="ConnectedServices-tab">
                                            Facebook, Google, Twitter Account that are connected to this account
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>

                    </div>
                </div>
            </div>
        </div>
    </c:if>
    <c:if test="${sessionScope.user == null}">
        <div class="title">
            <h1 style="color: aqua">You must login before access this page</h1>
            <h1 style="color: aqua">If you login with Account in Database that it login successfully but please test with account in Map</h1>
        </div>
    </c:if>
</body>
</html>
