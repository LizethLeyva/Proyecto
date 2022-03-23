class Tarjeta extends Pay {

    constructor(id, numero, cvv, vencimiento) {
        super(id);
        this.numero = numero;
        this.cvv = cvv;
        this.vencimiento = vencimiento;
    }

}
