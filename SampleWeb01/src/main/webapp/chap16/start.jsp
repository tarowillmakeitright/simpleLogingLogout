<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
<%--フォームで飛ばします。 --%>
<%--form action = "/web01/controller" method="post"とおんなじ扱いになる。 --%>
<form action="<%= request.getContextPath() %>/controller" method="post">
<%--隠しフィールドを発生させる。 --%>
<input type="hidden" name="ACTION" value="LOGIN">
<%--　ユーザーＩＤはＩＤで設定します。 --%>
ユーザID：<input type="text" name="ID">

<br>

<input type="submit" value="ログイン">
</form>
</body>
</html>