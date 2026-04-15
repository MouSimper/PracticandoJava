import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();

        System.out.println("nombre = " + nombre);
        System.out.println("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad: "+edad);
    }
}
