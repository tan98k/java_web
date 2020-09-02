<%@ page import="cn.tan.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 20192
  Date: 2020/9/2
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl 案例练习</title>
</head>
<%
    User user1 = new User("tan",18,new Date());
    User user2 = new User("en",19,new Date());
    User user3 = new User("ze",20,new Date());
    List list = new ArrayList();
    list.add(user1);
    list.add(user2);
    list.add(user3);
    request.setAttribute("list",list);
%>
<body>
    <table>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>时间</th>
        </tr>
        <c:forEach items="${list}" varStatus="s" var="user">
            <tr>
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
