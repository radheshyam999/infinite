<?php
$servername = "localhost";
$usernsme = "root";
$password = "2431923";
$dbname  = "infinite";
     

   $conn = mysqli_connect($servername, $usernsme, $password, $dbname);
   if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
   }
echo "Connected successfully";
 ?>
