import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        final var VALIDAR_CARACTERES =6;
        System.out.println("Ingresa un password: ");
        var contrasenia = sc.nextLine();
        while(contrasenia.length()<6){
            System.out.println("El password no cumple con los requisitos debe" +
                    " tener al menos 6 caracteres");
            System.out.println("Ingresa el nuevo pasword");
            contrasenia = sc.nextLine();
        }
        System.out.println("Password creada");
/*        var cantidadCaracteres= contrasenia.length();

        do{
            System.out.println("Crea tu contraseña: ");
            contrasenia = sc.nextLine().strip().trim();
            cantidadCaracteres= contrasenia.length();
            if (cantidadCaracteres < 6){
                System.out.println("La contraseña debe tener al menos 6 caracteres");
            }
        } while (cantidadCaracteres< 6);
        System.out.println("Contraseña creada con éxito");

 */
    }
}
