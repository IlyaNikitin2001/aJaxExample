<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 30.04.2017
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib tagdir="/WEB-INF/tags/pages" prefix="page" %>>
<html>
<head>
    <title>Title</title>
</head>
<body>
<page:tagger></page:tagger>
<table>
    <tbody>
    <tr>
        <th>Name</th>
        <th>Family</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
    <c:forEach items="${students}" var="student">

        <tr>
            <td> <c:out value="${student.name}"/> </td>
            <td><c:out value="${student.family}"/></td>
            <td><a href="${pageContext.servletContext.contextPath}/DeleteServlet?id=${student.id}">Delete</a></td>
            <td><a href="${pageContext.servletContext.contextPath}/EditServlet?id=${student.id}">Edit</a></td>
        </tr>

    </c:forEach>
    </tbody>

</table>
<page:Navigation></page:Navigation>
</body>
</html>
