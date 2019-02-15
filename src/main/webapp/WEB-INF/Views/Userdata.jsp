<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
<div class="card-header bg-success text-white">
<h3>welcome to user details</h3>
</div>
<div class="card-body">
<table border="1" class="table-bordered">
<thead>
<tr>
<th>Name</th>
<th>Number</th>
<th>Email</th>
<th>gender</th>
<th>cource</th>
<th>language</th>
<th>country</th>
</tr>
</thead>
<tbody>
<c:forEach items="${data}" var="user">
<tr>
<td><c:out value="${user.name}"/></td>
<td><c:out value="${user.number}"/></td>
<td><c:out value="${user.email}"/></td>
<td><c:out value="${user.gender}"/></td>
<td><c:out value="${user.cource}"/></td>
<td><c:out value="${user.lang}"/></td>
<td><c:out value="${user.country}"/></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
<div class="card-footer bg-primary text-white">
${message}
</div>
</div>
</div>
</body>
</html>