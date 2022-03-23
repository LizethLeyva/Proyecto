package Java;

public class Efectivo extends Pay {

    float denominacion;
    float monedas;
    float billetes;
    public Efectivo(Integer id, float denominacion, float monedas, float billetes) {
        super(id);
        this.denominacion = denominacion;
        this.monedas = monedas;
        this.billetes = billetes;
    }

    

}
