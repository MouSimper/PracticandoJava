import java.util.Scanner;

public class SistemaEnvios {
    static void main() {
        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;
        var sc = new Scanner(System.in);
        System.out.println("Destino(nacional/internacional): ");
        var destinoEnvio = sc.nextLine();
        System.out.println("Peso del paquete: ");
        var pesoEnvio =  Float.parseFloat(sc.nextLine());
        Float costoTotal = switch (destinoEnvio){
            case "nacional" -> pesoEnvio* TARIFA_NACIONAL;
            case "internacional" -> pesoEnvio * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino Inválido");
                yield null;
            }

        };
     /*   if (destinoEnvio.equals("nacional")){
            costoTotal = pesoEnvio * TARIFA_NACIONAL;
        } else if (destinoEnvio.equals("internacional")) {
            costoTotal = pesoEnvio * TARIFA_INTERNACIONAL;
        }

      */

        System.out.printf("""
                Destino: %s,
                Peso del paquete: %.2f
                Costo Total: %.2f
                """,destinoEnvio,pesoEnvio,costoTotal);
    }
}
