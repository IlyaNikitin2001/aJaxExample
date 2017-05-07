<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 30.04.2017
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tbody>
    <tr>
        <th>Name</th>
        <th>Family</th>

    </tr>
    <c:forEach items="${students}" var="student">

        <tr>
            <td> <c:out value="${student.name}"/> </td>
            <td><c:out value="${student.family}"/></td>

        </tr>

    </c:forEach>
    </tbody>

</table>
</body>
</html>
