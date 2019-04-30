/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


      
              
                $(function() {
              $("#list >li>  a").on("click",function(e) {
                e.preventDefault();
              $("#content").load(this.href); });});
         
               
            