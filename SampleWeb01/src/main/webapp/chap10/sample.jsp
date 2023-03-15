<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>サンプル</title>
</head>
<body>
<%--コメント --%>>
<%!
public void jspInit() {
	System.out.println("jspInit()メソッドを呼び出しました。");
}

public void jspDestroy() {
	System.out.println("jspDestroy()メソッドを呼び出しました。");
}
%>
</body>
</html>
