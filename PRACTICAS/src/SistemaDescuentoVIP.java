import java.util.Scanner;

public class SistemaDescuentoVIP {
    static void main() {
        System.out.println("***BIENVENIDO AL SISTEMA***");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var sc = new Scanner(System.in);
        System.out.println("Cuantos artículos compraste: ");
        var cantArticulosComprados = Integer.parseInt(sc.nextLine());
        System.out.println("Cuenta con membresia(true/false): ");
        var membresiaUsuario = Boolean.parseBoolean(sc.nextLine());

        var esElegibleDescuento =
                cantArticulosComprados >= NO_PRODUCTOS_DESCUENTO && membresiaUsuario;
        System.out.println("Tiene acceso al descuento VIP? "+ esElegibleDescuento);


    }
}
