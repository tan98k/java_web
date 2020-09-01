<%--
  Created by IntelliJ IDEA.
  User: 20192
  Date: 2020/9/1
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>practise-one-index2.jsp</title>
</head>
<body>
    <%
        out.print(request.getSession().getAttribute("tan"));
    %>
</body>
</html>
