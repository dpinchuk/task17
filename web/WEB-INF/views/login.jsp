<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

	<form:form method="POST" commandName="user" action="check-user" class="box login">

		<fieldset class="boxBody">

			<form:label path="login">Login:</form:label>
			<form:input path="login" />

			<form:label path="password">Password:</form:label>
			<form:password path="password"/>

		</fieldset>

		<footer> <label><input type="checkbox" tabindex="3">Keep me logged in</label>
			<input type="submit" class="btnLogin" value="Login" tabindex="4">
		</footer>

	</form:form>

</body>
</html>