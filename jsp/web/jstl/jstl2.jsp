<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 20192
  Date: 2020/9/2
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>foreach 标签</title>
</head>
<body>
    <c:forEach begin="1" end="10" step="2" var="i" >
        ${i}<br>
    </c:forEach>
<hr/>
<c:forEach begin="1" end="10" var="i" step="2" varStatus="s">
    ${i} &nbsp; ${s.index} &nbsp; ${s.count}<br>
</c:forEach>
<hr/>
<%
    List list = new ArrayList<String>();
    list.add("tan");
    list.add("en");
    list.add("ze");
    request.setAttribute("list",list);
%>
<c:forEach items="${list}" var="str" varStatus="s">
    ${s.index}          ${s.count}          ${str}<br/>
</c:forEach>
</body>
</html>
