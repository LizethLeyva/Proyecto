
<?php

require_once "persona.php"; 

class Carro{
    
    public $id;
    public $licencia;
    public $conductor;
    public $pasajeros;

    public function __construct($licencia, $conductor)
    {
        $this-> licencia = $licencia;
        $this -> conductor = $conductor;
    }

    public function ImprimirInfo() {
        echo " Licencia: $this->licencia, Conductor: {$this->conductor->nombre}, Documento: {$this->conductor->documento}";

    }
}
