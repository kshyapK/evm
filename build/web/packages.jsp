<%-- 
    Document   : packages
    Created on : 26 Apr, 2019, 8:40:51 PM
    Author     : user
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="style.css" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Comfortaa|Gudea:700|Poiret+One" rel="stylesheet">
        <script src="js/my.js"></script>
        <link rel="stylesheet" href="css/stylesheet.css" type="text/css">
        <title>Dream Weddings|Packages</title>
    </head>
    <body class="packBg">
          <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
              <div class="navbar-header">
                <a class="navbar-brand" href="index.html">DreamEvents.com</a>
              </div>
                <ul class="nav navbar-nav" style="float: right;">
                    <li><a href="index.html" class="disabled linkColor">Home</a></li>
                <li><a href="decoration.jsp" class="active linkColor">Decoration</a></li>
                <li><a href="catering.jsp" class="linkColor">Catering</a></li>
                <li><a href="accommodation.jsp" class="linkColor">Accommodation</a></li>
                <li><a href="transportation.jsp" class="linkColor">Transportation</a></li>
                 <li><a href="#contact" class="linkColor">Contact</a></li>
              </ul>
            </div>
        </nav>
        <div class="container-fluid" style="margin-top: 500px;overflow: hidden;padding: 10px">
            <div class="row" style="padding: 20px">
                 
                
                
                <% 
                    dbConnection db=new dbConnection();
                        String query="select * from packages";
                        ResultSet rs;
                        try{
                            
                             rs=db.selectData("dream_event",query);
                             
                             while(rs.next())
                             {%>
                              <div class="col-md-2" style="height: 400px;padding: 20px;"> 
                              </div>
                                  <div class="col-md-8" style="height: 400px;padding: 20px;overflow: hidden"> 
                                      <div class="card">
                                          <img src="img/icons8-lyre-100.png" style="height: 50px;">
                                          <table class="tableP">
                                              <tr>
                                                  <th><h1><%=rs.getString(1)%></h1></th>
                                              </tr>
                                              <tr>
                                                  <td> <h4>Food</h4></td>
                                                  <td>&nbsp;</td>
                                                  <td><%=rs.getString(2)%></td>
                                              </tr>
                                               <tr>
                                                  <td> <h4>Photography</h4></td>
                                                  <td>&nbsp;</td>
                                                  <td><%=rs.getString(3)%></td>
                                              </tr>
                                              <tr>
                                                  <td> <h4>Decoration</h4></td>
                                                  <td>&nbsp;</td>
                                                  <td><%=rs.getString(4)%></td>
                                              </tr>
                                              <tr>
                                                  <td> <h4>Accommodation</h4></td>
                                                  <td>&nbsp;&nbsp;</td>
                                                  <td><%=rs.getString(5)%></td>
                                              </tr>
                                          </table>
                                              <div class="button3"><a href="#contact" style=" text-decoration: none;">Know more</a></div>
                                      </div>

                               </div> 
                                     <div class="col-md-2" style="height: 400px;padding: 20px;"> 
                                     </div>
                             <%}}
                        catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
                 %>
               
             
            </div>
        </div>
         <div class="container-fluid" id="contact">
                <div class="row bottomDiv" id="my">
                    <div class="col-md-6">
                        <h4 class="contactHead">Contact us</h4>
                        <hr class="myRuler">
                        <form name="myForm"  action="ContactServlet" method="post">
                            <input type="text" placeholder="Name" class="contactElemnts" name="txt_name" id="name" onkeyup="validateText();" required>
                            <br>
                            <input type="text" placeholder="Email"  class="contactElemnts" name="txt_email" id="c_mail" onblur="return validateContactEmail();" required>
                             <br>
                             <input type="text" placeholder="Phone Number"  class="contactElemnts" name="txt_phone" id="phno_txt" onblur="return phonenumber()" required>
                            <br>
                            <textarea rows="5" cols="6"  class="contactElemnts" placeholder="Description" name="txt_des" required></textarea>
                            <br>
                            <input type="submit"  class="contactElemnts submitButton">
                        </form>
                    </div>
                    <div class="col-md-6">
			<h4 class="contactHead">Locate us</h4>
                         <hr class="myRuler">
                        <div id="map">
                        </div>
                         
                    </div>
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
                            <h6 class="copyright"> ©Copyright Agency and contributors 2019. Dream Events    <a href="login.jsp">Admin</a></h6>
                        </div>
                    </form>
                </div>
            </div>
         <script async defer
       src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBtdNewWBrQP0y7UBNUCMX_dhpZG0c1b8U&callback=initMap">
       </script>
        
    </body>
</html>
