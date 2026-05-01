import java.util.Scanner;

public class SaludFitness {
    static void main() {
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        var sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        var nombreingresado = sc.nextLine();
        System.out.println("Cantidad de pasos caminados en el día: ");
        var pasosIngresado = Integer.parseInt(sc.nextLine());

        var calorias_quemadas = pasosIngresado * CALORIAS_POR_PASO;

        var meta_alcanzada = (pasosIngresado >= META_PASOS_DIARIOS) ? "si":"no";

        System.out.printf("""
                \tUsuario: %s
                \tPasos dados hoy:%d
                \tCalorias quemadas: %.2f
                \tMeta Alcanzada? %s
                """,nombreingresado,pasosIngresado,calorias_quemadas,meta_alcanzada);
    }
}
