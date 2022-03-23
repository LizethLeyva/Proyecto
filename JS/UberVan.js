class UberVan extends Carro {

    constructor(licencia, conductor, tipoCarroAceptado, materialAsiento){
        super(licencia, conductor);
        this.tipoCarroAceptado = tipoCarroAceptado;
        this.materialAsiento = materialAsiento;     
    }

}