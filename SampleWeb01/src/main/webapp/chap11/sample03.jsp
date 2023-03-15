<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page errorPage="./error03.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>サンプル03</title>
</head>
<body>
<%
int result = 10 /3;
%>

割算の結果：<%= result %>
</body>
</html>