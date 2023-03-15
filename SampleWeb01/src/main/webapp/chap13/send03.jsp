<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>送信03</title>
</head>
<body>
<%--プロダクトクラスのオブジェクト生成  ***引数なしのコンストラクターを利用してオブジェクトが生成されている。--%>
<jsp:useBean id="product" scope="session" class="bean.Product" />
<%-- ***JavaBeansのセッターを利用して、値を設定している --%>
<jsp:setProperty name="product" property="name" value="りんご" />
<%-- ***JavaBeansのセッターを利用して、値を設定している --%>
<jsp:setProperty name="product" property="price" value="200" />

<%--
この部分をJavaで書くと
Product p = new Product();
p.setName("りんご");
p.setPrice(200);  
session.setAttribute("product", p)
--%>
<a href="./receive03.jsp">移動</a>
</body>
</html>