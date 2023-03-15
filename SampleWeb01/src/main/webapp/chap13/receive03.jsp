<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受信03</title>
</head>
<body>
<jsp:useBean id="product" scope="session" class="bean.Product" />
<%--name => りんご    ***JavaBeansのゲッターーを利用して、値を設定している--%>
商品名：<jsp:getProperty name="product" property="name" /><br>
<%--name => 200　　　 ***JavaBeansのゲッターーを利用して、値を設定している--%>
単価：<jsp:getProperty name="product" property="price" /><br>
</body>
</html>