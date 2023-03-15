<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受信06</title>
</head>
<body>
フルーツ一覧：<br>
<c:forEach var="obj" items="${list}" varStatus="status">
	<c:out value="${obj}"/><br>
</c:forEach>
</body>
</html>