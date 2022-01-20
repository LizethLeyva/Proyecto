<?php

class Persona{
    
    public $id;
    public $nombre;
    public $documento;
    public $email;
    public $contraseña;

    public function __construct($nombre,$documento)
    {
        $this->nombre = $nombre;
        $this->documento = $documento;

    }

}