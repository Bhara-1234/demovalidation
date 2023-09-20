<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<form:form action="register" method="put" modelAttribute="user">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Mail</td>
				<td><form:input path="email" /></td>
			<tr>
			<tr>
				<td>Password</td>
				<td><form:password path="pwd" /></td>
			<tr>
			<tr>
				<td>Profession:</td>
				<td><form:select path="profission" items="${profissions}" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>



	</form:form>
</body>
</html>