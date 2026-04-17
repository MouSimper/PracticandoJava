import java.util.Scanner;

public class TiendaLina {
    static void main() {
        var sc = new Scanner(System.in);
        final var MONTO_COMPRA_DESC = 1000;

        System.out.println("Ingresa el monto de compras: ");
        var montoCompras = Float.parseFloat(sc.nextLine());
        System.out.println("Es miembro de la tienda? (si/no) ");
        var esMiembro = sc.nextLine();
        var descuento = 0;
        if (montoCompras > MONTO_COMPRA_DESC && esMiembro == "si"){
            descuento = 10;
        } else if (esMiembro == "si") {
            descuento = 5;
        } else {
            descuento = 0;
        }
        var montocondescuento = montoCompras * (descuento/100);
        var totaldevalor = montoCompras - montocondescuento;
        System.out.println("El monto total: "+ totaldevalor);
        }
}
