<%--
  Created by IntelliJ IDEA.
  User: 20192
  Date: 2020/9/1
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<%@ include file="top.jsp"%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>--%>
<p>
    here is the home part!!!
</p>

    <!--只能注释html片段-->
    <%--可以注释jsp脚本内容,也可以注释html内容，推荐都使用这种注释--%>
    <%
        pageContext.setAttribute("tan","enze");
//      pageContext对象可以获取其他的8个对象

    %>
    <%=pageContext.getAttribute("tan")%>

</body>
</html>
