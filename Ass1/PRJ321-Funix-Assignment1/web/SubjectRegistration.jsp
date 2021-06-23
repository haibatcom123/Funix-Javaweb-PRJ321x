<%--
    Document   : SubjectRegistration
    Created on : May 2, 2021, 4:30:26 PM
    Author     : dell
--%>

<jsp:include page="fragment/header.jsp" />

<div class="container form-display">
  <form action="SubjectRegistration" method="POST">
    <div class="form-group">
      <label for="inputName">Name</label>
      <input type="text" class="form-control" id="inputName" name="name" aria-describedby="emailHelp" placeholder="Enter Name">
    </div>
    <div class="form-group">
      <label for="inputSurname">Surname</label>
      <input type="text" class="form-control" id="inputSurname" name="surname" placeholder="Enter Surname">
    </div>
    <div class="form-group">
      <label for="inputPhone">Phone Number</label>
      <input type="text" class="form-control" id="inputPhone" name="phoneNumber" placeholder="Enter Phone Number">
    </div>
    <div class="form-group">
      <label for="inputEmailAddress">Email Address</label>
      <input type="email" class="form-control" id="inputEmailAddress" name="email" placeholder="Enter Email Address">
    </div>

    <label>Subjects Name</label> <br>
    <div class="form-group form-check">
      <input type="checkbox" class="form-check-input" name="chbxSubjects" value="JavaScript" >
      <label class="form-check-label" >JavaScript</label> <br>
      <input type="checkbox" class="form-check-input" name="chbxSubjects" value="Python">
      <label class="form-check-label" >Python</label> <br>
      <input type="checkbox" class="form-check-input" name="chbxSubjects" value="C/C++">
      <label class="form-check-label" >C/C++</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

<jsp:include page="fragment/footer.jsp" />
