<?php
require_once('pay.php');
class Efectivo extends pay 
{
    public $denominacion;
    public $monedas;
    public $billetes;

    public function __construct($id, $denominacion, $monedas, $billetes)
    {
        parent::__construct($id);

        $this->denominacion = $denominacion;
        $this->monedas = $monedas;
        $this->billetes = $billetes;
    }
    
}
