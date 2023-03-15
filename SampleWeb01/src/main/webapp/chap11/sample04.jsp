<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page errorPage="./error04.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>サンプル04</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

//データを引き渡し
String data1 = request.getParameter("DATA1");
String data2 = request.getParameter("DATA2");
//文字列から数値に変換。
int x = Integer.parseInt(data1);
int y = Integer.parseInt(data2);

int result = x / y;
%>

割算の結果：<%= result %>
</body>
</html>