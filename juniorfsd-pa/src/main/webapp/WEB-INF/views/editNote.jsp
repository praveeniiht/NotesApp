<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>


<form action="updateNote">
<c:set var="note" scope="session" value="${note }" />
<h3 align=center>Notes App Management System </h2>
<table class="table table-striped">
<tr>  <td>Title </td><td><input type="text" name="title"  value= "Oracle"" /></td></tr>
<tr><td>Author</td><td> <input type="text" name="author" value= "Praveen"   /></td></tr>
<tr><td>Description</td><td> <input type="text" name="description"  value="Best database Management software" /><br></td></tr>
<tr><td>Status</td><td> <select name="status" />>
	<option value="on going">On Going</option>
	<option value ="Done">Done</option>
</select></td></tr>
<div align="center"></div><tr colspan=2><td><input type="submit" value="Update" /></td></tr></div>
</table>
</form>
</body>
</html>