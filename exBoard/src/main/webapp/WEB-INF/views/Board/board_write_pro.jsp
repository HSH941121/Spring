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
	<c:if test="${row == 1 }">
		<script>
			alert("등록성공");
			location.href="board_list";
		</script>
	</c:if>
	
	<c:if test="${row != 1 }">
	<script>
			alert("등록된 자료입니다.");
			location.href="board_list";
	</script>
		
	</c:if>
</body>
</html>