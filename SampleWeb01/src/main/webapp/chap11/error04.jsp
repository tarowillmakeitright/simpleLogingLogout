<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--ここがTrueになっていることに注目。Trueの場合エラーメッセージをだせますよ～と呼びかける。 --%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>エラー04</title>
</head>
<body>
エラーメッセージ：<br>
<%= exception.getMessage() %>
</body>
</html>