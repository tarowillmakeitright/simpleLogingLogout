<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>サンプル06(転送元）)</title>
</head>
<body>

<%--
***page***　同一のJSPファイル内で情報を共有する。
***request***　ユーザ（ｗｅｂブラウザ）から送信された一回のリクエスト内で情報を共有する。
***session***　ユーザ（ｗｅｂブラウザ）別に、複数のリクエストをまたいで、情報を共有する。
***application*** ウェブアプリケーション内で、情報を共有する

==>　
setAttribute() Method【書式】 void setAttrib ute(String nam, Object o)　【機能】オブジェクトに第一引数で指定したキー名で第二引数のデータを格納する。
getAttribute() Method  【書式】Obeject　getAttribute(String name)【機能】オブジェクトから引数に指定した名前のキーに相当するデータを取得する。＊キー名に相当するデータが存在しない場合はNullを返す。
removeAttribute() Method 【書式】void  removeAttribbtue(String name)【機能】オブジェクトから引数に指定した名前のキーに相当するデータを消去する。
 
--%>
<jsp:forward page="./forward06.jsp"/>
</body>
</html>