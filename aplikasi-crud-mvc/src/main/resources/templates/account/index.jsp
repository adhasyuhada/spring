<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1"/>
<title>Account</title>
</head>
<body>
<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>User Name</th><th>Full Name</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="account" items="${list}"> 
    <tr>
    <td>${account.id}</td>
    <td>${account.username}</td>
    <td>${account.fullName}</td>
    <td><a href="edit/${account.id}">Edit</a></td>
    <td><a href="delete/${account.id}" onclick="return confirm('Are you sure ? ')">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="empform">Add New Account</a>
</body>
</html>