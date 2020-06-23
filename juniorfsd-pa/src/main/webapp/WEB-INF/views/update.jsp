<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Notes</h1>
        <form:form action="updateNote" method="post" modelAttribute="note">
        <table>
         <tr>
               
                <td><form:hidden  path="id"  /></td>
            </tr>
            <tr>
                <td>Title:</td>
                <td><form:input path="title"  id="title"/></td>
            </tr>
            
            <tr>
                <td>Author:</td>
                <td><form:input path="author"  id="author"/></td>
            </tr>
            <tr>
                <td>Description:</td> 
                <td><form:input path="description" id="description" /></td>
            </tr>
            <tr>
                <td>Status:</td>
                <td><form:select path="status">  
        <form:option value="On Going" label="On Going"/>  
        <form:option value="Done" label="Done"/>  
        </form:select>  </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Update"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>