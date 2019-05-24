<%--
  Created by IntelliJ IDEA.
  User: minh
  Date: 5/25/19
  Time: 1:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User details</title>
</head>
<body>
    <h1>User details</h1>
    <fieldset>
        <table>
            <tr>
                <td>Account:</td>
                <td>${user.account}</td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>${user.name}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${user.email}</td>
            </tr>
            <tr>
                <td>Age:</td>
                <td>${user.age}</td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
