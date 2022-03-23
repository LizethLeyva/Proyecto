package Java;

class UberX extends Carro {

    String model;
    String marca;

    public UberX(String licencia, Persona conductor, String model, String marca) {
        super(licencia, conductor);
        this.model = model;
        this.marca = marca;
    }

}