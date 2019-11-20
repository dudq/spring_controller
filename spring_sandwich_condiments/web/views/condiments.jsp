<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: du
  Date: 20/11/2019
  Time: 05:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form:form method="post" action="/save" modelAttribute="sandwich">
    <form:label path="name">Name:</form:label>
    <form:input path="name"/>
    <form:checkboxes items="${condimentList}" path="condiments"/>
    <form:button value="Submit">Submit</form:button>
</form:form>
</body>
</html>
