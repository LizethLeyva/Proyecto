package Java;

import java.util.ArrayList;
import java.util.Map;

import javax.print.DocFlavor.STRING;

public class UberBlack extends Carro {

    Map<String, Map<String,Integer>> tipoCarroAceptado;
    ArrayList<String> materialAsiento;

    public UberBlack(String licencia, Persona conductor, 
    Map<String, Map<String,Integer>> tipoCarroAceptado,
    ArrayList<String> materialAsiento){
        super(licencia, conductor);
        this.tipoCarroAceptado = tipoCarroAceptado;
        this.materialAsiento = materialAsiento;     
    }

}
