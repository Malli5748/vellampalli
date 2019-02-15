<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<body>
<div class="container">
<div class="card">
<div class="card-header bg-primary">
<h1>Welcome to User Data</h1>
</div>
<div class="card-body">
<table border="1" class="table table-bordered">
<tr>
<th>id</th>
<th>FileName</th>
<th>Downlaod</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<c:forEach items="${data}" var="dt">
<tr>
<td><c:out value="${dt[0]}"/></td>
<td><c:out value="${dt[1]}"/></td>
<td><a href="download?id=${dt[0]}" class="btn btn-primary">Download</a></td>
<td><a href="delete?id=${dt[0]}" class="btn btn-primary">Delete</a></td>
<td><a href="#" class="btn btn-primary">Edit</a></td>
</tr>
</c:forEach>
</table>
</div>
<div class="card-footer bg-success">
${message}
</div>
</div>
<a href="http://localhost:8081/Vellampalli/user/show" class="btn btn-info">Back to upload page</a>
</div>
</body>
</html>