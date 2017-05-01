<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>Account</title>
</head>
<body>
<h1>List Peranan</h1>
<button><a href="peranan/add">Tambah Peran</a></button>
<button><a href="peranan/report">Cetak List</a></button>
<br/>
<br/>
	<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id </th>
		<th>Username </th>
		<th>Peran </th>
		<th>Description</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
    <c:forEach var="peranan" items="${peranans}"> 
    <tr>
    <td>${peranan.id}</td>
    <td>${peranan.username}</td>
    <td>${peranan.peran}</td>
    <td>${peranan.description}</td>
    <td><a href="peranan/edit/${peranan.id}">Edit</a></td>
    <td><a href="peranan/delete/${peranan.id}" onclick="return confirm('Are you sure ? ')">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    
</body>
</html>