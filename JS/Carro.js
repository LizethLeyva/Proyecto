class Carro {

    constructor(licencia, conductor){

        this.id;
        this.licencia = licencia;
        this.conductor = conductor;
        this.pasajeros;
    }
    ImprimirInfo() {
        console.log(this.conductor)
        console.log(this.conductor.nombre)
        console.log(this.conductor.documento)
    }


}
