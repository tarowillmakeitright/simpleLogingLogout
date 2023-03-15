<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受信02</title>
</head>
<body>
<%
String data = (String)session.getAttribute("DATA");
session.removeAttribute("DATA");
%>

共有データ：<%= data %>

</body>
</html>