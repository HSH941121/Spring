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
	<c:choose>
		<c:when test="${row == 1 }">
			<script>
				alert("삭제되었습니다.");
				window.opener.location.replace("pds_list?page=${page}");
				self.close();
			</script>
		</c:when>
		<c:when test="${row != 1 }">
			<script>
				alert("비번오류");
				history.back();
			</script>
		
		</c:when>
	</c:choose>
</body>
</html>