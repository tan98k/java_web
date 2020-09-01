<%--
  Created by IntelliJ IDEA.
  User: 20192
  Date: 2020/9/1
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" language="java" %>
<html>
<head>
    <title>servlet is busying...</title>
</head>
<body>
    <p style="width:100%; height: 100%; font-size: 250px">servlet is busying...</p>
    <%
        String message = exception.getMessage();
        out.print(message);
    %>
</body>
</html>
