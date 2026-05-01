import java.util.Scanner;

public class SistemaBancario {
    static void main() {
        var sc = new Scanner(System.in);
        System.out.println("Deseas salir del sistema(true/false): ");
        var salirSistema = Boolean.parseBoolean(sc.nextLine());
        if (!salirSistema){
            System.out.println("Continua en el sistema");
        }
        else {
            System.out.printf("Saliendo del sistema");
        }
    }
}
