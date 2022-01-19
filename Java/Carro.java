package Java;

public class Carro {

    Integer id;
    String licencia;
    Persona conductor;
    Integer pasajeros;

    public Carro(String licencia, Persona conductor) {
        this.licencia = licencia;
        this.conductor = conductor;
    }

    void ImprimirInfo() {
        System.out.println(id + " " + licencia + " " + conductor + " " + pasajeros);
    }
}
