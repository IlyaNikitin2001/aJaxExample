<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 04.05.2017
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags/pages" %>
<html>
<head>
    <title>Title</title>
</head>
<page:tagger></page:tagger>
<body>
<form method="post", action="EditServlet">
    <input type="text"  name="id" value="${student.id}">
    <input type="text" name="name" value="${student.name}">
    <input type="text" name="family" value="${student.family}">
    <input type="submit" name="Edit" value="Edit">
</form>
<page:Navigation></page:Navigation>
</body>
</html>
