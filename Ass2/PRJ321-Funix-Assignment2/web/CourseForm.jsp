<%-- 
    Document   : CourseForm
    Created on : May 17, 2021, 4:08:04 PM
    Author     : dell
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="fragment/header.jsp"/>

<div class="container" style="padding-top: 3rem;">
    <h4 style="color: red">${error}</h4>
    <form action="CourseValidation" method="POST">
        <div class="form-group">
            <label>Full Name</label>
            <input type="text" class="form-control" name="fullName" placeholder="Enter Full Name">
        </div>
        <div class="form-group">
            <label>Age</label>
            <input type="number" class="form-control" name="age" placeholder="Enter age">
        </div>
        <div class="form-group">
            <label>Country</label> <br>
            <select name="country" class="form-control">
                <option value="Vietnamese">Vietnamese</option>
                <option value="American" >American</option>
                <option value="English">English</option>
                <option value="Chinese">Chinese</option>
                <option value="French">French</option>
            </select>
        </div>
        <div class="form-group">
            <label>Course</label>
            <select name="course" multiple class="form-control">
                <option value="C#">C#</option>
                <option selected="true" value="Java">Java</option>
                <option value="C++">C++</option>
                <option value="Python">Python</option>
                <option value="Ruby on Rail">Ruby on Rail</option>
            </select>
        </div>
        <div class="form-group row">
            <div class="col-sm-6">Desired Language</div>
            <div class="col-sm-4">
                <div class="form-group form-check">
                    <input type="checkbox" class="form-check-input" name="chbxLanguage" value="Vietnamese" >
                    <label class="form-check-label" >Vietnamese</label> <br>
                    <input type="checkbox" class="form-check-input" name="chbxLanguage" value="English">
                    <label class="form-check-label" >English</label> <br>
                    <input type="checkbox" class="form-check-input" name="chbxLanguage" value="French">
                    <label class="form-check-label" >French</label>
                </div>
            </div>
        </div>
        <br><button type="submit" class="btn btn-primary">Submit</button>
        <a href="About.jsp" class="btn btn-success">Cancel</a>
    </form>
    <hr>

    <div class="resultCourse">
        Full Name: <label>${fullName}</label> <br>
        Age: <label>${ageString}</label> <br>
        Country: <label>${country}</label> <br>
        Course: <label>${courses} </label> <br>
        Language: <label>${chbxLanguage} </label> <br>
        

    </div>
</div>

<script>

</script>

<jsp:include page="fragment/footer.jsp" />
