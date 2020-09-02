<%@ page import="cn.tan.domain.User" %>
<%@ page import="java.util.*" %><%--
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
    <%
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(user);
        request.setAttribute("list",list);
    %>
    <br>
    <h4>el解析list</h4>
    <p>${requestScope.list[1]}</p>
    <p>${requestScope.list[2].name}</p>
    <h4>el解析map</h4>
    <%
        Map map = new HashMap();
        map.put("name","tan");
        map.put("age",19);
        map.put("obj",user);
        request.setAttribute("map",map);
    %>
    <p>${map.name}</p>
    <p>${map.obj.age}</p>

    <h4>empt运算符</h4>

    <%
        String s = "tan hhhh";
        request.setAttribute("str",s);
        List blist = new ArrayList();
        request.setAttribute("blist",blist);
    %>

    ${not empty str}
    ${not empty blist}<br/>
    ${pageContext.request.contextPath}/page.js

</body>
</html>
