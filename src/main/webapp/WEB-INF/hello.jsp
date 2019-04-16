<%--
  Created by IntelliJ IDEA.
  User: 张凯科
  Date: 2019/4/11
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>你好，SpringBoot</title>
</head>
<body>
<center>
    <table border="1" bgcolor="#f0ffff">
        <thead>
        <tr>
            <th>编号</th>
            <th>名字</th>
            <th>性别</th>
            <th>年龄</th>
        </tr>
        </thead>
        <c:forEach items="${list}" var="s">
        <tr>s
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.sex}</td>
            <td>${s.age}</td>
        </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
