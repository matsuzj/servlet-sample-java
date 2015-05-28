<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>${requestScope.hoge} - ${sessionScope.fuga} - ${applicationScope.piyo}</h1>
    <h2>${hoge} - ${fuga} - ${piyo}</h2>

    <ul>
      <li>${same}
      <li>${requestScope.same}
      <li>${sessionScope.same}
      <li>${applicationScope.same}
    </ul>

    <% pageContext.setAttribute("same", "PageScopeValue"); %>

    <h3>${same}</h3>
  </body>
</html>