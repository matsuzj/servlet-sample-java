<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Hello JSP</title>
  </head>
  <body>
<!-- 
out PrintWriter HTML に任意の文字列を出力できる。
request HttpServletRequest  現在のリクエストオブジェクト。
response    HttpServletResponse 現在のレスポンスオブジェクト。
pageContext PageContext 現在の JSP ページのコンテキストを持つオブジェクト。
session HttpSession 現在のセッションオブジェクト。
application ServletContext  アプリの ServletContext オブジェクト。
page    HttpJspPage JSP から生成された Servlet のオブジェクト。
 -->
    <% out.println("<h1>Implicit Objects</h1>"); %>
  </body>
</html>