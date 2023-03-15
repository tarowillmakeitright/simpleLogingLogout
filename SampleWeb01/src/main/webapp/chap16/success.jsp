<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン成功画面</title>
</head>
<body>

ようこそ！！${sessionScope.user.name}さん。<br>
<%--form action = "/web01/controller" method="post"とおんなじ扱いになる。 --%>
<form action="<%= request.getContextPath() %>/controller" method="post">
<%--ここにかくしてログアウトを入れておく。フォームで飛ばす。 --%>
<input type="hidden" name="ACTION" value="LOGOUT">
<input type="submit" value="ログアウト">
</form>

</body>
</html>