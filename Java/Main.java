package Java;

public class Main {

    public static void main(String[] args) {

        System.out.println("Mundo cruel :v");

        Carro carro = new Carro();
        carro.id = 1;
        carro.conductor = "Diego Gay";
        carro.licencia = "HYU896";
        carro.pasajeros = 5;

        carro.ImprimirInfo();
    }
    
}
