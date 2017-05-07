<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 30.04.2017
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib tagdir="/WEB-INF/tags/pages" prefix="page"%>


<html>
<head>
    <title>Title</title>
</head>
<body>
<page:tagger></page:tagger>
<form method="post" action="CreateServlet">
    <input type="text" name="name" value="name">
    <input type="text" name="family" value="family">
    <input type="submit" name="Ok" value="Ok">

</form>
<a href="AjaxJSPPage.jsp">Page</a>
</body>
</html>
