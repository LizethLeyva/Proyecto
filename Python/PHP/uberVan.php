<?php
require_once('carrro.php');
class UberVan extends carro
{
    public $tipoCarroAceptado;
    public $materialAsiento;

    public function __construct($licencia, $conductor, $tipoCarroAceptado, $materialAsiento)
    {
        parent::__construct($licencia, $conductor);

        $this->licencia = $tipoCarroAceptado;
        $this->conductor = $materialAsiento;
    }
}
