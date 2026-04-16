import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaTicketsVentas {
    static void main() {
        System.out.println("GENERACION DE TICKETS");
        var sc = new Scanner(System.in);
        System.out.println("Precio leche: ");
        var precioLeche = Double.parseDouble(sc.nextLine());
        System.out.println("Precio pan: ");
        var precioPan = Double.parseDouble(sc.nextLine());
        System.out.println("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(sc.nextLine());

        System.out.println("Algun descuento: ");
        var descuentoPorcentaje = Integer.parseInt(sc.nextLine());

        var subtotal = precioLeche + precioPan + precioLechuga;

        var aplicarDescuento = subtotal *  (descuentoPorcentaje/100.0);

        var subTotalConDescuento = subtotal - aplicarDescuento;

        var impuestoTotal = subTotalConDescuento * 0.16F;

        var costoTotalDeCompra = subTotalConDescuento + impuestoTotal;

        System.out.printf("""
                \tSubtotal: $%.2f
                \tTotal Descuento: $%.2f
                \tSubTotal con Descuento: $%.2f
                \tImpuesto: $%.2f
                \tCosto Total: $%.2f   
                """,subtotal,aplicarDescuento,subTotalConDescuento,impuestoTotal,costoTotalDeCompra);
    }
}
