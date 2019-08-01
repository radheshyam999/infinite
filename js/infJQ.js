$(document).ready(function(){
$("#ShowLogin").click(function() {
  $("#Login").show(); //  it will show hide element  for login  
  $("#SignUp").hide(); // hiding  signup when you click on login link
});
$("#HideLogin").click(function () {
  $("#Login").hide(); //  hiding  Login when you click on login link
  $("#SignUp").show(); // it will show hide element  for login 
});

});
