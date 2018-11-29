<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@page import="com.com.pojo.Emp"%>
<%@page import="com.man.b1"%>
<%@ page import="java.util.List"%> --%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>signup</h1>
	<%-- <%
		b1 b = new b1();
		List<Emp> ls = b.get();
		out.println(
				"<br/><table border='1' style='font-size:30px'<tr><th>id</th><th>username</th><th>password</th><th>name</th><th>Update</th></tr>");
		for (Emp d : ls) {
			out.println("<tr><td>" + d.getId() + "</td><td>" + d.getUsername() + "</td><td>" + d.getPassword()
					+ "</td><td>");
			out.println("</table>");
		}
	%> --%>

	<form:form method="post">
	name:<input type="text" name="nm" value="${param.nm} }" >
		</br></br>
	email:<input type="email" name="email" value="${param.email}" required="true">
		</br></br>
 password:<input type="password" name="password">
		</br></br>
		<input type="submit" value="send otp" name="action1">
		</br></br>
Enter otp<input path="otp" name="otp">
		</br></br>
		<input type="submit" value="register">


	</form:form>



	<table border="1">
		<th>id</th>
		<th>name</th>
		<th>password</th>
		<th>emailid</th>
		<c:forEach var="employee" items="${empllist}">
			<tr>

				<td>${employee.id}</td>
				<td>${employee.nm}</td>
				<td>${employee.password}</td>
				<td>${employee.email}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>