<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受信01</title>
</head>
<body>
<%
String data = (String)request.getAttribute("DATA");
//ここはとくに関係はないが、データという名前で引き継がれたデータを消しているだけ。
request.removeAttribute("DATA");
%>

共有データ：<%= data %>

</body>
</html>