<%--
  Created by IntelliJ IDEA.
  User: minh
  Date: 5/25/19
  Time: 1:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Login</title>
</head>
<body>
    <h1>Home</h1>
    <form method="post" action="login">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td>Account:</td>
                <td>
                    <input type="text" name="account"/>
                </td>
            </tr>
            <tr>
                <td>Password:</td>
                <td>
                    <input type="text" name="password"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Login"/>
                </td>
            </tr>
        </table>
    </fieldset>
    </form>
</body>
</html>
