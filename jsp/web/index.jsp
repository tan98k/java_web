<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.HashSet" %>
<%--
  Created by IntelliJ IDEA.
  User: 20192
  Date: 2020/9/1
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="500.jsp" language="java" %>
<%--配置jsp页面信息--%>
<%--三种指令：
    1.page      配置jsp页面
      * contentType:设置mime类型和字符集
      *pageEncoding:设置页面的字符编码
      *buffer:缓冲区大小（默认8KB）
      *import:导入java包
      *errorPage:错误页面，当前页面发生异常会跳到错误页面
    2.include   导入页面的资源文件
    3.taglib    导入资源
--%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%
      List list = new ArrayList();
      Set set = new HashSet();
      int i = 3/0;
    %>
  </body>
</html>
