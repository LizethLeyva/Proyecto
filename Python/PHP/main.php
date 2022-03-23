<?php

require_once("carro.php");
require_once("uberX.php");
require_once("persona.php");

$uberX = new UberX("HRE745", new Persona("Cristian Leyva", "1024554"),"Chevrolet","Spark");
$carro -> ImprimirInfo();



