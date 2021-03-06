<%-- 
    Document   : transportation
    Created on : 14 Apr, 2019, 5:45:05 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="style.css" type="text/css">
         <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
         <script src="js/validation.js"></script>
        <title>Dream Events|Transportation Services</title>
        <link rel="stylesheet" type="text/css" href="css/content.css">
     
    </head>
    <body>
       <div class="parallax">
             <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
              <div class="navbar-header">
                <a class="navbar-brand" href="#">DreamEvents.com</a>
              </div>
                <ul class="nav navbar-nav" style="float: right;">
                    <li><a href="index.html" class="disabled linkColor">Home</a></li>
                    <li><a href="photography.jsp" class="linkColor">Photgraphy</a></li>
                <li><a href="decoration.jsp" class="active linkColor">Decoration</a></li>
                <li><a href="catering.jsp" class="linkColor">Catering</a></li>
                <li><a href="accommodation.jsp" class="linkColor">Accommodation</a></li>
                 <li><a href="#contact" class="linkColor">Contact</a></li>
              </ul>
            </div>
        </nav>
        <div class="background backgroundTransportation">
            <h2 class="title">Transportation</h2>
        
        </div>
        <section class="bg">
         <div class="wrapper">
             <h3 class="content-title1">“We offer different vehicle services for all your needs<br>Wide range of cars including specially decorated vehicles like jeeps, bullets etc for the bride & groom."</h3>
            <hr style="float:center;width:50%;background-color: #666666;opacity: 0.5">
            <p class="content-title">“Get booked with us to get high end experience.”</p> 
            <br>
            <h3 class="content-title2">PORTFOLIO</h3>
            <hr style="float:center;width:50%;background-color: #666666;opacity: 0.5">   
            <div class="imgholder"> 
               <div class="column">
                   <img src="img/vehicles/pexels-photo-1360254.jpeg" style="width:100%">
                   <img src="img/vehicles/pexels-photo-1974520.jpeg" style="width:100%">
                 
               </div>
               <div class="column">
                   <img src="img/vehicles/pexels-photo-2085503.jpeg" style="width:100%">
                   <img src="img/vehicles/pexels-photo-207171.jpeg" style="width:100%">
                  
               </div>  
               <div class="column">
                   <img src="img/vehicles/pexels-photo-2119106.jpeg" style="width:100%">
                   <img src="img/vehicles/pexels-photo-2127732.jpeg" style="width:100%">
                 
               </div>
               <div class="column">
                   <img src="img/vehicles/pexels-photo-2045249.jpeg" style="width:100%">
                
               </div>
             </div>
        </div>
    </section>
          
           
    <div class="row" style="margin-top: 400px" id="contact">
           <form name="myForm"  action="EnquiryHandlerServlet" method="post">
        <div class="container-fluid" id="contact">
            <div class="row bottomDiv2" id="my">
                <div class="col-md-5">
                    <h2 class="contact">Hey we can snap it better..</h2>
                    <br>
                    <h4 class="contactSub">Drop here we'll reach out</h4>
                    <div style="margin-top: 25px">
                 
                            <input type="text" placeholder="Name" class="contactElemntsPhoto" name="txt_name" id="name" onkeyup="validateText();" required>
                           
                            <br>
                            <input type="text" placeholder="Email"  class="contactElemntsPhoto" name="txt_email" id="c_mail" onblur="return validateContactEmail();" required>
                            <br>
                             <input type="text" placeholder="Phone Number"  class="contactElemntsPhoto" name="txt_phone" id="phno_txt" onblur="return phonenumber()" required>
                            <br>
                                <input type="hidden" name="service" value="transportation">
                            <input type="submit"  class="contactElemnts submitButton2">
                    
                    </div>
                </div>
                <div class="col-md-7">
                    
                    <h5 style="margin-top: 110px;margin-left: 20px">Select time period</h5>
                     
                    <input type="date" name="fromdate" id="txtDate" class="txtDate" required> 
                    <input type="date" name="todate" id="toDate"  class="txtDate" required>
                            <br>
                              <textarea rows="6" cols="10"  class="txtAr" placeholder="Description" name="txt_des" required></textarea>
                </div>
               
            </div>
        </div>
        </form>
    </div>
            <div class="row bottom_row" >
                    <form action="SubscribeServlet" method="post" name="subscribeForm" onsubmit="return validateEmail();">
                        <div style="margin-top: 10px;text-align: center;height: 10px;">
                            <input type="text" class="subscribe_txt" name="sub_mail" id="email_txt"  required>
                            <input type="submit" value="Subscribe" class="subscribe_btn" >
                        </div>
                        <div class="social_div">
                            <a href="https://twitter.com/login?lang=en"><img src="img/ic_twit.svg" class="social_icon"></a>
                            <a href="https://www.facebook.com/"><img src="img/ic_fb.svg" class="social_icon"></a>
                            <a href="https://www.instagram.com/"><img src="img/ic_insta.svg" class="social_icon"></a>
                            <h6 class="copyright"> ©Copyright Agency and contributors 2019. Dream Events </h6>
                        </div>
                    </form>
                </div>
       </div>
    </body>
</html>
