<?php
class DatabaseConnection {
   public $con;
  public $servername = "localhost";
  public $usernsme = "root";
  public $password = "2431923";
   public $dbname = "infinite";
 
}

$Datast =new DatabaseConnection();

echo($Datast ->servername);
   
 ?>
