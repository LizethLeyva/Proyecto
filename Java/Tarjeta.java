package Java;

import java.sql.Date;

public class Tarjeta extends Pay{

    String numero;
    String cvv;
    Date vencimiento;
    
    public Tarjeta(Integer id, String numero, String cvv, Date vencimiento) {
        super(id);
        this.numero = numero;
        this.cvv = cvv;
        this.vencimiento = vencimiento;
    }

    


    
}
