<%@page import="com.dcl.mvc.student.entity.ProfileUrl"%>
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
List<ProfileUrl> urls = (List) request.getAttribute("profileOfStudent");
int studentId = (Integer)request.getAttribute("studentId");

%>

<table border="1">
<tr>
<th>ProfileId</th>
<th>Name</th>
<th>URL</th>
<th>Update</th>
<th>DELETE</th>

</tr>

<% for(ProfileUrl url:urls){
	%>

<tr>
<td><%=url.getProfileId() %></td>
<td><%=url.getProfileName() %></td>
<td><%=url.getUrl() %></td>
<td><a href="find-profile-by-id?profileId=<%=url.getProfileId()%>">UPDATE</a></td>
<td><a href="delete-profile-by-id?profileId=<%=url.getProfileId()%>">DELETE</a></td>

</tr>

	<% 
}
%>

</table>
<a href="addProfile.jsp">ADD PROFILE</a>
</body>
</html>