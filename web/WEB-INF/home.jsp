<%-- 
    Document   : home
    Created on : 1-Feb-2023, 10:12:36 AM
    Author     : Kelsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home </title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h3> Hello ${user.username} </h3>
        <a href ="login?login"> Log out</a>
        
    </body>
</html>
