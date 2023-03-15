<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>送信01</title>
</head>
<body>
<%
request.setAttribute("DATA", "山田太郎");
%>

<jsp:forward page="./receive01.jsp"/>
</body>
</html>