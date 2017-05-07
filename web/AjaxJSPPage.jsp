<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 06.05.2017
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://code.jquery.com/jquery-1.10.2.js"
            type="text/javascript"></script>
    <script>
        <%--когда все готово --%>
        $(document).ready(function() {
//            вместо blur click

            $('#enter').click(function(event) {
//                прочитал из поля
                var name = $('#userName').val();
//                прочитал из поля
                var password = $('#password').val();
//                пересылвю все значения в GetUsersServlet
                $.get('GetUserServlet', {
//                    зоздаем аттрибут со значением name
                    userName : name,
                    password:password

                }, function(responseText) {
                    $('#ajaxGetUserServletResponse').text(responseText);
                });
            });

        });




    </script>
</head>
<body>
<form>
    Enter Your Name: <input type="text" id="userName" />
    Enter password: <input type="text" id="password" />
    <input type="button" name="enter" id="enter">
</form>
<br>
<br>

<strong>Ajax Response</strong>:
<div id="ajaxGetUserServletResponse"></div>
</body>
</html>
