package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Carro {

    Map<String, Map<String,Integer>> tipoCarroAceptado;
    ArrayList<String> materialAsiento;

    public UberVan(String licencia, Persona conductor, 
    Map<String, Map<String,Integer>> tipoCarroAceptado,
    ArrayList<String> materialAsiento){
        super(licencia, conductor);
        this.tipoCarroAceptado = tipoCarroAceptado;
        this.materialAsiento = materialAsiento;     
    }

}