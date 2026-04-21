package figura_aplicacion.prueba_aplicacion;

import figura_aplicacion.Circulo;
import figura_aplicacion.Rectangulo;

public class PruebaFigura {
    public static void main(String[] args) {
        var objeto1 = new Circulo("Azul", 3.21F);
        objeto1.describir();
        objeto1.CalcularArea();
        System.out.println("**************************");
        var objeto2 = new Rectangulo("Amarillo",5,2);
        objeto2.CalcularArea();
        objeto2.describir();
    }
}
