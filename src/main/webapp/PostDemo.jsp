<%--
  Created by IntelliJ IDEA.
  User: samvelsiradeghyan
  Date: 11/30/19
  Time: 12:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Post Demo</title>
    <style>
        input {
            display: block;
            margin: 10px 0px 10px 0px;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/DoPost" method="post">
    <div>
        <label>Title</label>
        <input type="text" name="Title" />
        <label>Description</label>
        <input type="text" name="Description" />
    </div>
    <input type="submit" value="Add">
</form>
</body>
</html>
