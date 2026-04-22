package dispositivos_aplicaion.prueba_aplicacion;

import dispositivos_aplicaion.Laptop;
import dispositivos_aplicaion.Tablet;

public class PruebaDispositivo {
    public static void main(String[] args) {
        var objeto1 = new Laptop("Samsumg","T500",1200,6);
        objeto1.describir();
        var objeto2 = new Tablet("Apple","18PLUS",3000,true);
        objeto2.describir();

    }
}
