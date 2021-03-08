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
			alert("수정 성공");
			location.href="board_list";
		</script>
	</c:if>
	
	<c:if test="${row != 1 }">
	<script>
			alert("비번 오류 입니다.");
			history.back();
	</script>
		
	</c:if>
</body>
</html>