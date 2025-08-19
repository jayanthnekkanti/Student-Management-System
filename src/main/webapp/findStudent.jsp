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

	<%
	List<Student> student1 = (List<Student>)request.getAttribute("key1");
	%>

	<table border="1">
		<tr>
			<th>StudentID</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Phone_Number</th>
			<th>City</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		
		<tr>
		<%
		for(Student students:student1){
		%>
			<td><%=students.getId() %></td>
			<td><%=students.getFirstName() %></td>
			<td><%=students.getLastName() %></td>
			<td><%=students.getEmail() %></td>
			<td><%=students.getPhonenum()%></td>
			<td><%=students.getCity() %></td>
			<td><a href="find-all-profiles?StudentId=<%=students.getId()%>">VIEW</a>
			</td>
			<td><a href="find-by-id?StudentId=<%=students.getId()%>">UPDATE</a>
			</td>
			<td><a href="delete-by-id?StudentId=<%=students.getId() %>">DELETE</a>
			</td>
		</tr>
	<%} %>
	

	</table>
</body>
</html>