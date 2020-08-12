<%--
  Created by IntelliJ IDEA.
  User: elifakgun
  Date: 10.08.2020
  Time: 00:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>
<div align="center">
<table border="1" cellpadding="5">
<caption><h2>Todo Items</h2></caption>
    <tr>
        <th>Title</th>
        <th>DeadLine</th>
    </tr>
    <c:forEach var="item" items="${todoData.items}">
        <tr>
            <td><c:out value="${item.title}"></c:out></td>
            <td><c:out value="${item.deadline}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
