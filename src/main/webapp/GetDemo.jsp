<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: samvelsiradeghyan
  Date: 11/29/19
  Time: 11:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Get Demo</title>
    <style>
        table {
            padding: 5px;
        }

        th, td {
            border-bottom: 1px solid #ddd; padding: 5px;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th style="text-align: left;width: 150px;">Title</th>
            <th style="text-align: left;width: 450px;">Description</th>
        </tr>
        <c:forEach items="${tasks}" var="task">
            <tr>
                <td><c:out value="${task.getTitle()}" /></td>
                <td><c:out value="${task.getDescription()}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
