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
<title>Halaman Add</title>
</head>
<body>
	<h3>Account Info</h3>
	<form th:action="@{/account/add}"
		th:object="${account}" method="post">
		<table cellpadding="2" cellspacing="2">
			<tr>
				<td>Username</td>
				<td><input type="text" th:field="*{username}"/></td>
			</tr>	
			<tr>
				<td>Password</td>
				<td><input type="password" th:field="*{password}"/></td>
			</tr>
			<tr>
				<td>Full Name</td>
				<td><input type="text" th:field="*{fullName}"/></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save"/></td>
			</tr>			
		</table>
	</form>
</body>
</html> 