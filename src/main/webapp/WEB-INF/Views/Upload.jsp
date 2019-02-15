<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>Insert title here</title>
</head>
<div class="container">
<div class="card">
<div class="card-header bg-success text-white">
<marquee><h4>DVP Online Services</h4></marquee>
<h3>Upload Your Documents</h3>
</div>
<body>
<div class="card-body">
<form action="upload" method="Post" enctype="multipart/form-data">
<pre>
<div class="custom-file col-sm-4">
    <input type="file" name="file" class="custom-file-input" id="customFile">
    <label class="custom-file-label" for="customFile">Choose file</label>
  </div>
<input type="submit" value="Upload" class="btn btn-success">
</pre>
</form>
<a href="showfiledata" class="btn btn-danger">Show All</a>
</div>
<div class="card-footer bg-primary text-white">
${message}
</div>
</body>
</div>
</div>
</html>