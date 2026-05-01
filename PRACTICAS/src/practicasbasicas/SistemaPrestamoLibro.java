import java.util.Scanner;

public class SistemaPrestamoLibro {
    static void main() {
        var sc = new Scanner(System.in);
        final var DISTANCIA_PERMITIDA_KM = 3;
        System.out.println("**Sistema de prestamo de Libro**");
        System.out.println("Es usted estudiante? ");
        var esEstudiante = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Cuantos kilometros vive de aquí: ");
        var kilometrosDeLaBiblioteca = Integer.parseInt(sc.nextLine());
        var cumpleCondicionesDePrestamo = esEstudiante || kilometrosDeLaBiblioteca <=DISTANCIA_PERMITIDA_KM;
        System.out.println("Cumple con el préstamo? " + cumpleCondicionesDePrestamo);

    }
}
