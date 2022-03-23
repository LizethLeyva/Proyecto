package Java;

public class UberPool extends Carro {

    String model;
    String marca;

    public UberPool(String licencia, Persona conductor, String model, String marca) {
        super(licencia, conductor);
        this.model = model;
        this.marca = marca;
    }
    
}
