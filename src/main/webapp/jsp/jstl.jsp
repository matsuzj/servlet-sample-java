<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <c:set var="flag" value="true" />

    <c:if test="${flag}">
      flag is true
    </c:if>
  </body>
</html>
