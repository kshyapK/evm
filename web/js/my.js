
    // Initialize and add the map
    function initMap() {
      // The location of Uluru
      var uluru = {lat: -25.344, lng: 131.036};
      // The map, centered at Uluru
      var map = new google.maps.Map(
          document.getElementById('map'), {zoom: 4, center: uluru});
      // The marker, positioned at Uluru
      var marker = new google.maps.Marker({position: uluru, map: map});
    }
    
    
   function validateEmail(){
       var a=document.getElementById("email_txt").value;
        var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
        if (!reg.test(a)) 
        {
            alert('Invalid Email Address');
            document.getElementById("email_txt").value='';
            return false;
        }
        return true;
}
    


function validateContactEmail(){
       var a=document.getElementById("c_mail").value;
        var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
        if(!a.match(/\S/))
        {
            return true;
        }
        else if (!reg.test(a)) 
        {
            alert('Invalid Email Address');
            document.getElementById("c_mail").value='';
            return false;
        }

}

    function validateText()
    {
        var a=document.getElementById("name").value;
        if (!/^[a-zA-Z ]*$/g.test(a)) {
        alert("Invalid character!");
        document.getElementById("name").value="";
        document.getElementById("name").focus();
        return false;
    }
    }
    
    
    function phonenumber()
    {
        var phoneno = /^\d{10}$/;
        var ph=document.getElementById("phno_txt").value;
        if(!ph.match(/\S/))
        {
            return true;
        }
        else if(!phoneno.test(ph))
        {
            alert("Please check your phone number");
           // document.getElementById("phno").value="";
       
        return false;
        }   
       
    }
    
    function clearFields()
    {
        document.getElementById("name").value="";
        document.getElementById("c_mail").value="";
        document.getElementById("phno_txt").value="";
       // document.getElementById("txt_des").value="";
    }
    
       
       
      