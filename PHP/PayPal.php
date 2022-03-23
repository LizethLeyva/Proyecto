<?php

require_once('pay.php');
class PayPal extends Pay {

    public $email;

    public function __construct($id, $email)
    {
        parent:: __construct($id);
        
        $this-> email = $email;
    }
        
}

