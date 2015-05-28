<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Hello JSP</title>
  </head>
  <body>
    <ul>
      <%
      List<String> list = Arrays.asList("hoge", "fuga", "piyo");

      for (String value : list) {
          out.println("<li>" + value + "</li>");
      }
      %>
    </ul>
  </body>
</html>