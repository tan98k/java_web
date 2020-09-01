<%@ page import="cn.tan.domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 20192
  Date: 2020/9/1
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el 获取域中的数据</title>
</head>
<body>
    <%
        User user = new User();
        user.setAge(19);
        user.setName("tan");
        user.setBirthday(new Date());
        session.setAttribute("user", user);
    %>
    <%
        request.setAttribute("name", "zhangsan");
        session.setAttribute("age","20");
    %>
    <h3>
        获取值
    </h3>
    ${name}
    <br>
    ${sessionScope.age}
    <table>
        <tr>
            <td>姓名</td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>年龄</td>
            <td>${user.age}</td>
        </tr>
        <tr>
            <td>生日</td>
            <td>${user.birStr}</td>
        </tr>
    </table>
</body>
</html>
