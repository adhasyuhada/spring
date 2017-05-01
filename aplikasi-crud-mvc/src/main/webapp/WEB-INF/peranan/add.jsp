<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1"/>
<title>Halaman Add</title>
</head>
<body> -->
<h1>Tambah Peran</h1>
<form:form modelAttribute="peranan" method="post"
	action="${pageContect.request.contextPath}/peranan/add">
	<table>
		<tr>
			<td>Username</td>
			<td>:</td>
			<td><form:input path="username" value="${peranan.username}" /></td>
		</tr>

		<tr>
			<td>Peran</td>
			<td>:</td>
			<td><form:input path="peran" value="${peranan.peran}" /></td>
		</tr>

		<tr>
			<td>Description</td>
			<td>:</td>
<%-- 			<td><form:input path="description" value="${peranan.description}" /></td> --%>
			<td><form:textarea path="description" rows="5" cols="30" value="${peranan.description}"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form>
<!-- </body>
</html>  -->