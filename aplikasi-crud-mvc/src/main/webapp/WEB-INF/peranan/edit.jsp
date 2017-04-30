<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html">
<head>
<meta charset="ISO-8859-1" />
<title>Edit Account</title>
</head>
<body>
	<h1>Edit Account</h1>
	<form:form modelAttribute="peranan" method="post" name="peranan" action="${pageContect.request.contextPath}/peranan/edit">
		<table>
		<form:hidden path="id"/>
			<tr>
				<td>Username :</td>
				<td><form:input path="username" value="${peranan.username}" /></td>
			</tr>

			<tr>
				<td>peran :</td>
				<td><form:input path="peran" value="${peranan.peran}" /></td>
			</tr>
			
 			<tr>
				<td>Description :</td>
				<td><form:input path="description" value="${peranan.description}" /></td>
			</tr>

			<tr>
				<td>
					<input type="submit" value="Edit Save" />
				</td>

			</tr>  
        </table>  
       </form:form>  
</body>
</html> 