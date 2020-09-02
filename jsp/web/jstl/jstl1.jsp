<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
/
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl if标签</title>
</head>
<body>
    <%--
    c:if标签
        1：属性， 接受Boolean表达式
         * 如果为true，则显示if标签体内容
         *如果为false，则不显示

    --%>
    <c:if test="true">
        I am the true
    </c:if>
    <c:if test="false">
        I am the false
    </c:if>
        <br>
    <%
        List list = new ArrayList();
        list.add("tan");
        list.add("en");
        list.add("ze");
        request.setAttribute("list",list);
        int number = 3;
        request.setAttribute("number",number);
    %>
    <c:if test="${not empty list}">
        遍历集合
    </c:if>
        <br>
    <c:if test="${number mod 2 == 0}">
        3是偶数
    </c:if>
    你哄哄
    <c:if test="${number mod 2 != 0}">
        3是奇数
    </c:if>

    <hr>
    <%
        request.setAttribute("num",31);
    %>
    <h4>
        <c:choose>
            <c:when test="${num == 1}">1</c:when>
            <c:when test="${num == 2}">2</c:when>
            <c:when test="${num == 3}">3</c:when>
            <c:otherwise>error</c:otherwise>
        </c:choose>
    </h4>
</body>
</html>
