<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>送信04</title>
</head>
<body>
<jsp:useBean id="product" scope="session" class="bean.Product" />
<jsp:setProperty name="product" property="name" value="りんご" />
<jsp:setProperty name="product" property="price" value="200" />

<%

Product p = new Product();
p.setName("Apple");
p.setPrice(200);

session.setAttribute("product", p);
%>
<a href="./receive04.jsp">移動</a>
</body>
</html>