<%--
  Created by IntelliJ IDEA.
  User: du
  Date: 20/11/2019
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Handling</title>
</head>
<body>
<h1>Submit Information</h1>
<table>
    <tr>
        <td>Name:</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Condiments:</td>
        <td>
            <c:forEach items="${condiments}" var="condiment">
                <p> ${condiment}</p>
            </c:forEach>
        </td>
    </tr>
</table>
</body>
</html>
