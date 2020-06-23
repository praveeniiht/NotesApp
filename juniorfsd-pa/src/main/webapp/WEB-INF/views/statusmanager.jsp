<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Notes Status Page</title>
</head>
<body>

<h3 align ="center" style="color:blue">Notes Status Information  </h3>
<div><h5 align="right" style="color:blue"><a href="gotoHome">Home</a></h5></div>
<table class="table table-striped">
 
           
            <th>Title</th>
          	<th>Author</th>
            <th>Description</th>
            <th>Status</th>
            <th>Action</th>
           	<c:forEach var="note" items="${notes}">
            <tr>
 			        <td>${note.title}</td>
                   <td>${note.author}</td>
                    <td>${note.description}</td>
                    <td>${note.status}</td>
                    <td><a href="editNote?id=${note.id}">Edit</a> / <a href="deleteNote?id=${note.id}">Delete</a></td>
             
                </tr>
            </c:forEach>
        </table>
</body>
</html>