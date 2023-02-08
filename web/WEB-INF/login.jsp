<%-- 
    Document   : login
    Created on : 1-Feb-2023, 10:09:56 AM
    Author     : Kelsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username: <input type="text" name="username" value="${username}">
            <br>
            Password: <input type="password" name="pass" value="${password}">
            <br>
            <input type="submit" value="Log in">
            <br>
            <p>${message}</p> 
        </form>
    </body>
</html>
