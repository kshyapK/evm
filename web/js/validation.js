/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   
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
       document.getElementById("myform").reset();
    }
    
    $(function(){
    var dtToday = new Date();
    
    var month = dtToday.getMonth() + 1;
    var day = dtToday.getDate();
    var year = dtToday.getFullYear();
    if(month < 10)
        month = '0' + month.toString();
    if(day < 10)
        day = '0' + day.toString();
    
    var maxDate = year + '-' + month + '-' + day;
 
    $('#txtDate').attr('min', maxDate);
    $('#toDate').attr('min',maxDate);
});
    
   
       