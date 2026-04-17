import java.util.Scanner;

public class Funciones {

    static void saludarDesdeJava(String mensaje){
        System.out.println("Mensaje: "+mensaje);
    }
    static int sumar(int a, int b){
        return a+b;
    }
    static void esPar(int a){
        if (a%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        saludarDesdeJava("Hola Mundo");
        saludarDesdeJava("Adios");
        sumar(1,2);
        esPar(2);
        esPar(3);
    }
}
