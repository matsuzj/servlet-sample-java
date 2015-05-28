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
    Map<String, String> map = new HashMap<String, String>();
    map.put("hoge", "HOGE");
    map.put("fuga", "FUGA");
    map.put("piyo", "PIYO");

    pageContext.setAttribute("map", map);
    %>

    <h2>${map.hoge} - ${map["fuga"]} - ${map['piyo']}</h2>

  </body>
</html>