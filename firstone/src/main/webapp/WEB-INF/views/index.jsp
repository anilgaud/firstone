<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!!!!!!!!!</h2>
<form:form name="submitform" method="POST">
enter username
<input type="text" name="un"></br>
Enter password
<input type="password" name="pass"></br>
<input type="submit" value="login">

</form:form>
</body>
</html>
