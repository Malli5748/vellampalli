<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="card">
<div class="card-header bg-success text-white">
<h3>Enter Your Details</h3>
</div>
<div class="card-body">
<form action="saveuser" method="Post">
<pre>
<label class="custom-control-label" for="customRadio">Name:</label>
<input type="text" name="name" class="form-control col-sm-4"/>
<label class="custom-control-label" for="customRadio">Number:</label>
<input type="text"" name="number" class="form-control col-sm-4"/>
<label class="custom-control-label" for="customRadio">Email:</label>
<input path="text" name="email" class="form-control col-sm-4"/>
<div class="custom-control custom-radio custom-control-inline">
    <input type="radio" class="custom-control-input" id="customRadio" name="gender" value="male">
    <label class="custom-control-label" for="customRadio">Male</label>
  </div>
<div class="custom-control custom-radio custom-control-inline">
    <input type="radio" class="custom-control-input" id="customRadio2" name="gender" value="female">
    <label class="custom-control-label" for="customRadio2">Female</label>
  </div> 
  
<select name="cource" class="custom-select-sm col-sm-4" multiple="multiple">
    <option selected>cource</option>
    <option value="java">Java</option>
    <option value="dot_net">Dot_net</option>
    <option value="Angular">Angular</option>
    <option value="others">Others</option>
  </select>
  
<select name="lang" class="custom-select-sm col-sm-4" multiple="multiple">
    <option selected>Language</option>
    <option value="english">English</option>
    <option value="telugu">Telugu</option>
    <option value="tamil">Tamil</option>
    <option value="others">Others</option>
  </select>
  
<select name="country" class="custom-select-sm col-sm-4">
    <option selected>Country</option>
    <option value="India">India</option>
    <option value="Aus">Australia</option>
    <option value="Usa">Usa</option>
 </select>
 
 <input type="submit" value="Register" class="btn btn-success">
 </pre>
 </form>
</div>

<div class="card-body">
<form action="upload" method="post" enctype="multipart/form-data">
<pre>
<div class="custom-file col-sm-4">
    <input type="file" name="file" class="custom-file-input" id="customFile"/>
    <label class="custom-file-label" for="customFile">Choose file</label>
 </div>
 <input type="submit" value="upload" class="btn btn-success"/>
 </pre>
 </form>
 </div>
 <a href="showfiledata" class="btn btn-info">Show Upload Data</a> 
<a href="showUserData" class="btn btn-danger">Show All Users</a> 
<div class="card-footer bg-primary text-white">
${message}
</div>
</div>
</div>
</body>
</html>
