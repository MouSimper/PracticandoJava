import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var rand = new Random();
        System.out.println("Bienvenido al Sistema de Generador Unico");
        System.out.println("Ingrese su nombre: ");
        var nombre = sc.nextLine();
        System.out.println("Ingrese su Apellido: ");
        var apellido = sc.nextLine();
        System.out.println("Año de nacimiento(YYYY): ");
        var nacimiento = sc.nextLine();
        var generacionDeNumerosAletorios = rand.nextInt(1,9999);
        //normalizar
        var normnombre = nombre.trim().toUpperCase().substring(0,2);
        var normapellido = apellido.trim().toUpperCase().substring(0,2);
        var normnacimiento = nacimiento.trim().substring(2,4);
        var normGeneracionNumerosAleatorios = String.format("%04d",
                generacionDeNumerosAletorios);
        System.out.printf("""
                ***GENERACIÓN COMPLETADA***
                ---------------------------
                \t%s%s%s%s
                """,normnombre,normapellido,normnacimiento,normGeneracionNumerosAleatorios);

    }
}
