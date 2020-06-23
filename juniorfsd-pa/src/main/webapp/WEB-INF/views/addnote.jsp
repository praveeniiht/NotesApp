<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<div class="container">
    <div class="row">
        <form role="form" class="col-md-9 go-right" action="addnewnote">
            <h3 align="center" style="color:blue">Add a New Notes</h3>
            <div class="form-group">
            <label for="name" style="color:blue">Notes Title</label>
            <input id="name" name="title" type="text" class="form-control" required>
            
        </div>
        <div class="form-group">
            <label for="name" style="color:blue">Author</label>
            <input id="name" name="author" type="text" class="form-control" required>
           
            
        </div>
        <div class="form-group">
         <label for="message" style="color:blue">Detailed Description</label>
            <textarea id="message" name="description" class="form-control" style="height: 150px" required></textarea>
           
        </div>
         
          <label for="status" style="color:blue">Status of Notes</label>
		  <select name="status">
		  	<option value="On Going">On Going </option>
		  	<option value="Done">Done</option>
		  </select>
</div><br>
        <div class="form-group">
          <div align="center">  <button type="submit" class="btn btn-primary">Add or Update</button> </div>
        </div>
        <div class="form-group">
          <div align="center">  <button type="submit" class="btn btn-primary" formaction="gotoHome">Home</button> </div>
        </div>
        </form>
    </div>
</div>

</body>
</html>