<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>test09.jsp ����</h2>
	�̸� : ${list }
	<c:forEach var="name" items="${list}">
		�̸� : ${name}<br>
	
	</c:forEach>
</body>
</html>