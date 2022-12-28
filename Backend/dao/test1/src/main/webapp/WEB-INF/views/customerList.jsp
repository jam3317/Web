<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "ncsAcorn.CustomerDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	table{
		margin: auto;
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	tr, td{
		border: 1px solid black;
	}
	
	td{
		padding-right: 100px;
	}
</style>

</head>
<body>
<%ArrayList<CustomerDto> listview = (ArrayList<CustomerDto>)request.getAttribute("list"); %>
<table>
	<tr>
		<td>고객이름</td>
		<td>아이디</td>
		<td>주소</td>
	</tr>
	<% for( CustomerDto customer: listview) {  %>
	<tr>
		<td><%=customer.getName() %></td>
		<td><%=customer.getId() %></td>
		<td><%=customer.getAddress() %></td>
	</tr>
	<%} %>
</table>
</body>
</html>