<?php

require_once('Car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('Account.php');

$uberX = new UberX("AW456", new Account("Andres Herrera", "AND123"),"Chevrolet","Spark");
$uberX->printDataCar();

$uberPool = new UberPool("TYU576", new Account("Andrea Ferran", "ANDA523"),"Dodge","Attitude");
$uberPool->printDataCar();
?>

