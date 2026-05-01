import java.util.Scanner;

public class SistemaReservaHotel {
    static void main() {
        final var PRECIO_SIN_VISTA_AL_MAR = 150.50;
        final var PRECIO_CON_VISTA_AL_MAR = 190.50;
        var sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        var nombreCliente = sc.nextLine();
        System.out.println("Días de estadia en el hotel: ");
        var diasEstadiaHotel = Integer.parseInt(sc.nextLine());
        System.out.println("Cuarto con vista al mar? (si/no): ");
        var solicitudVistaAlMar =  sc.nextLine();
        var normalizarVistaAlMar = (solicitudVistaAlMar.equals("si")) ? true : false;
        var precioTotal= 0.0;
        if (normalizarVistaAlMar) {
            precioTotal = diasEstadiaHotel * PRECIO_CON_VISTA_AL_MAR;
        }else{
            precioTotal = diasEstadiaHotel * PRECIO_SIN_VISTA_AL_MAR;
        }
        System.out.printf("""
                \tSolicitud de %s
                \tCantidad de días en el Hotel: %d
                \tHotel con vista al mar: %s
                \tPrecio Total: %.2f
                """,nombreCliente,diasEstadiaHotel,solicitudVistaAlMar,precioTotal);
    }
}
