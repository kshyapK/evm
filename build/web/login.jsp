<%-- 
    Document   : login
    Created on : 14 Apr, 2019, 8:41:34 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 String userName = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("user"))
                        userName = cookie.getValue();
                }
            }
            if (userName!=null)
                response.sendRedirect("AdminPageServlet");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
        <title>Admin Login</title>
    </head>
    <body style="text-align: center;background-image: url(img/wedding-celebration.jpg);background-size: cover">
        <div style="background-color: #DCDCDC;width: 550px;height: 300px;border-radius: 5px;display: inline-block;margin-top: 100px;padding: 25px">
           
            <h4 style="margin-bottom: 50px;">Login</h4>
            <form action="validateUserServlet" method="post" name="myform" >
                Username<input type="text" name="uname" class="contactElemnts" required>
            <br>
            <br>
            Password   <input type="password" name="pwd" class="contactElemnts" required>
            <br>
            <br>
            <input type="submit" value="Login" class="contactElemnts submitButton" style="margin-left: 90px">
            <br>
            <br>
            <a href="index.html" style="float: left;margin-left: 60px">Home</a>
            </form>
        </div>
    </body>
</html>
