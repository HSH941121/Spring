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
			alert("��ϼ���");
			location.href="board_list";
		</script>
	</c:if>
	
	<c:if test="${row != 1 }">
	<script>
			alert("��ϵ� �ڷ��Դϴ�.");
			location.href="board_list";
	</script>
		
	</c:if>
</body>
</html>