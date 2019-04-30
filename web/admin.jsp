<%-- 
    Document   : admin
    Created on : 14 Apr, 2019, 6:56:42 AM
    Author     : user
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <!DOCTYPE html>
        <html>
            <head>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <link rel="stylesheet" type="text/css" href="cssstylesheet.css">
              <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
              <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
              <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
              <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
              <link href="https://fonts.googleapis.com/css?family=Comfortaa|Gudea:700|Poiret+One" rel="stylesheet">
              <link rel="stylesheet" href="css/adminStyle.css" type="text/css">
               <title>Administrator</title></head>
            <body style="background-color: #eae4e4">
               
                  
                  <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
              <div class="navbar-header">
                <a class="navbar-brand" href="index.html">DreamEvents.com</a>
              </div>
                <ul class="nav navbar-nav" id="list" style="float: right;" >
                    <li><a href="SubscriberListServlet" class="disabled linkColor">Subscribers</a></li>
                    <li><a href="EnquiryListServlet" class="linkColor">Enquiries</a></li>
                      <li><a href="LogoutServlet" class="linkColor">Logout</a></li>
              </ul>
                <div class="navbar-header">
                <a class="navbar-brand" href="LogoutServlet">Logout</a>
              </div>
            </div>
        </nav>
                  
                  
                  <div class="container-fluid">
               <div  style="height:550px;margin-top: 60px;" id="content">
                   <jsp:include page="index.html" />
               </div>
            </div>
                  
                  
               
                  
              <script>
                $(function() {
              $("#list >li>  a").on("click",function(e) {
                e.preventDefault();
              $("#content").load(this.href); });});
               </script>
               </body>
               </html>
                
           
            
        
        
   
    

