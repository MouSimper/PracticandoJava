package aritmetica_aplicacion.prueba;

import aritmetica_aplicacion.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var objeto1 = new Aritmetica(5,7);
        System.out.println("Obtener operando 1: "+objeto1.getOperando1());
        System.out.println("Obtener operando 2: "+objeto1.getOperando2());
        objeto1.setOperando1(12);
        objeto1.setOperando2(4);
        System.out.println(objeto1.suma());
        System.out.println(objeto1.restar());

    }
}
