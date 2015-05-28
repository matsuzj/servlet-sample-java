<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <c:set var="flag" value="true" />
    <c:set var="message" value="日本語" />

    <c:if test="${flag}">
      ${message}
    </c:if>
  </body>
</html>