<?php
require_once('carrro.php');
class UberX extends carro
{
    public $marca;
    public $modelo;

    public function __construct($licencia, $conductor, $marca, $modelo)
    {
        parent::__construct($licencia, $conductor);

        $this->licencia = $marca;
        $this->conductor = $modelo;
    }
}
