<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
<!-- 
sessionScope    セッションスコープ
requestScope    リクエストスコープ
applicationScope    アプリケーションスコープ
pageSope    ページスコープ
pageContext 現在のページのコンテキスト
param   リクエストパラメータのマップ
paramValues リクエストパラメータ（配列）のマップ
header  HTTP のヘッダ
headerValues    HTTP のヘッダ（配列）
cookie  クッキー（マップ）
 -->

    <h1>${pageContext.request.serverName}</h1>
  </body>
</html>