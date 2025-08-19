<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%int studentId= Integer.parseInt(request.getParameter("studentId"));%>


<h1>Enter the Profile Details</h1>
<form action="add-profile?StudentId=<%=studentId%>" method="post">
<input type="text" placeholder="Enter the profile Name" name="profileName"><br>
<input type="text" placeholder="Enter the profile URL" name="e"><br>
<input type="submit" value="ADD PROFILE">

</form>

</body>
</html>