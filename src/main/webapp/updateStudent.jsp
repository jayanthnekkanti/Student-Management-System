<%@page import="com.dcl.mvc.student.entity.Student"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%Student student = (Student) request.getAttribute("key1"); %>
<form action="update-student" method="post">
<input type="number" value="<%=student.getId()%>"  name="id"><br>
<input type="text" value="<%=student.getFirstName()%>"  name="firstName"><br>
<input type="text" value="<%=student.getLastName()%>"  name="lastName"><br>
<input type="text" value="<%=student.getEmail()%>"  name="email"><br>
<input type="number" value="<%=student.getPhonenum()%>"  name="phonenum"><br>
<input type="text" value="<%=student.getCity()%>"  name="city"><br>


<input type="submit" value="update">

</form>
</body>
</html>