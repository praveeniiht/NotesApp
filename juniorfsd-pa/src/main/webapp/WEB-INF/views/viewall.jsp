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
<title>Insert title here</title>
</head>
<body>
<div><h4 align="left" style="color:blue"><a href="gotoHome">Home</a></h4></div>

<h3 align ="center" style="color:blue">All public notes Summary </h3>
<table class="table table-striped">
 
           
            <th>Title</th>
          	<th>Author</th>
            <th>Description</th>
            <th>Status</th>
           	<c:forEach var="note" items="${notes}">
            <tr>
 			        <td>${note.title}</td>
                   <td>${note.author}</td>
                    <td>${note.description}</td>
                    <td>${note.status}</td>
                    
                
                </tr>
            </c:forEach>
        </table>
</body>
</html>