<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <%
    String[] array = {"hoge", "fuga", "piyo"};
    List<String> list = Arrays.asList("HOGE", "FUGA", "PIYO");

    pageContext.setAttribute("array", array);
    pageContext.setAttribute("list", list);
    %>

    <h2>${array[0]}, ${array[1]}, ${array[2]}</h2>
    <h2>${list[0]}, ${list[1]}, ${list[2]}</h2>

  </body>
</html>
