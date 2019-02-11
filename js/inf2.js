
function FormValidation() {
    var UserEmailPhone=document.getElementById("idintity");
    var UserPasswd= document.getElementById("password");
      if (UserEmailPhone && UserPasswd) {
         return true; 
      }
    else{
      return false;
             
    }

    
}


