function validateForm() {
  UserEmail = document.getElementById("SignUpEmail").value;
  UserMob = document.getElementById("SignUpMobNumber").value;
  UserPassword = document.getElementById("SignUppassword").value;
  UsercPassword = document.getElementById("SignUpcpassword").value;
   Email = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
  
  if ( UserPassword > 8 && UserPassword === UsercPassword) {
      if (Email.test(SignUpEmail.value) == false) {
        alert("leren  here ");
       return true;
      }
      else{
        
        return false;
      } 
  }
 
} 




function isNumber(evt) {
  evt = (evt) ? evt : window.event;
  var charCode = (evt.which) ? evt.which : evt.keyCode;
  if (charCode > 31 && (charCode < 48 || charCode > 57)) {
    alert("Please enter only Numbers.");
    return false;
  }

  return true;
}

function ValidateNo() {
  
  var phoneNo = document.getElementById('SignUpMobNumber');

  if (phoneNo.value == "" || phoneNo.value == null) {
    alert("Please enter your Mobile No.");
    return false;
  }
  if (phoneNo.value.length < 10 || phoneNo.value.length > 10) {
    alert("Mobile No. is not valid, Please Enter 10 Digit Mobile No.");
    return false;
  }

  alert("Success ");
  return true;
}


  




