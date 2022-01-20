
<?php

require_once "carro.php";
require_once "persona.php";

        $carro = new Carro("HRE745", new Persona("Cristian Vegt", "1024554"));
        $carro -> ImprimirInfo();

