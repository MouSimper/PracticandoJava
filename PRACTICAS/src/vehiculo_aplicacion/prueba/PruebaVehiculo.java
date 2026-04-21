package vehiculo_aplicacion.prueba;

import vehiculo_aplicacion.Auto;
public class PruebaVehiculo {
    public static void main(String[] args) {
        Auto objeto1 = new Auto("KIA",212,4);
        System.out.println(objeto1.getNumeroPuertas());
        System.out.println(objeto1.getNumeroPuertas());
        System.out.println(objeto1.getMarca());
        objeto1.describir();

    }
}
