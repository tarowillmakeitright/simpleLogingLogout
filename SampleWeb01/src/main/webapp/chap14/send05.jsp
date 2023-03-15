<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>送信05</title>
</head>
<body>
<%
String[] fruits = {"りんご", "いちご", "みかん"};

session.setAttribute("list", fruits);
%>

<a href="./receive05.jsp">移動</a>
</body>
</html>