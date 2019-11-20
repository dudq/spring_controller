<%--
  Created by IntelliJ IDEA.
  User: du
  Date: 20/11/2019
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="post" action="/calculate">
    <fieldset>
        <legend>
            Calculator
        </legend>
        <table>
            <tr>
                <td>First operator:</td>
                <td><input name="firstOperator" type="text"></td>
            </tr>
            <tr>
                <td>Second operator:</td>
                <td><input name="secondOperator" type="text"></td>
            </tr>
            <tr>
                <td>
                    <button type="submit" name="operator" value="+">Addition(+)</button>
                </td>
                <td>
                    <button type="submit" name="operator" value="-">Subtraction(-)</button>
                </td>
                <td>
                    <button type="submit" name="operator" value="*">Multiplication(*)</button>
                </td>
                <td>
                    <button type="submit" name="operator" value="/">Division(/)</button>
                </td>
            </tr>
            <tr>
                <td><c:if test="${result != null}">
                    <p>Result: <c:out value="${result}"/></p>
                </c:if></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
