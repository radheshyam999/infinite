function validateForm() {
  UserEmail = document.getElementById("SignUpEmail").value;   // geting the value  usear email
  UserMob = document.getElementById("SignUpMobNumber").value; // grting  Usee  mob number here 
  UserPassword = document.getElementById("SignUppassword").value;  //  geting password  here
  UsercPassword = document.getElementById("SignUpcpassword").value; // geting  confirm password here 
   Email = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;   // it is for email  validation //
  
  if (UserPassword.length > 8 && UserPassword == UsercPassword && Email.test(SignUpEmail.value) == true) {
/*   validating   data here  if it is true form going to submit otherwise  it will throw erre*/
       return true;
    }
      
  else{
        
        return false;
      } 
  }
 





function isNumber(evt) {    //function ber in form of mobile number for only enter num/ 
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


  




