<?php

require_once('pay.php');

class Tarjeta extends Pay{

    public $numero;
    public $cvv;
    public $vencimiento;
    
    public function __construct($id, $numero, $cvv, $vencimiento)
    {
        parent:: __construct($id, $numero, $cvv, $vencimiento);

        $this -> numero = $numero;
        $this -> cvv = $cvv;
        $this -> vencimiento = $vencimiento;
        
    }
        
}
