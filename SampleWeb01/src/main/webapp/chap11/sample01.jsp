<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>サンプル01</title>
</head>
<body>
<%
Calendar cal = Calendar.getInstance(); //Calendarのオブジェクトを生成
int year = cal.get(Calendar.YEAR); //「年」を取得
int month = cal.get(Calendar.MONTH) + 1; //「月」を取得
int day = cal.get(Calendar.DATE); //「日」を取得
%>

<%= year %>年<%= month %>月<%= day %>日
</body>
</html>