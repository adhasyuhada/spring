<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1"/>
<title>Halaman Add</title>
</head>
<body> -->
<h1>Tambah Peran</h1>
       <form method="post" action="${pageContect.request.contextPath}/peranan/add">  
      	<table >  
         <tr>  
          <td>Username : </td> 
          <td><input type="text" name="username"/></td>
         </tr> 
          
         <tr>  
          <td>Peran : </td> 
          <td><input type="text" name="peran" /></td>
         </tr>
          
         <tr>  
          <td>Description : </td> 
          <td><input type="text" name="description" style="width:195px;"/></td>
         </tr>
         <!-- <tr>  
          <td>Fullname :</td>  
          <td><input type="text" name="description" /></td>
         </tr>  -->
         <tr>  
          <td></td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form> 
<!-- </body>
</html>  -->