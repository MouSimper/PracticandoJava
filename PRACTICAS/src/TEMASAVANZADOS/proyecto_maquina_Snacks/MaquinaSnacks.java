package TEMASAVANZADOS.proyecto_maquina_Snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var continuar = false;
        List<Snack> productos = new ArrayList<>();
        Snacks.mostrarsnacks();
        while(!continuar){
            try {
                var opcion = mostrarMenu(sc);
                continuar = ejecutarOpciones(opcion,sc,productos);

            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());;
            }
            finally {
                System.out.println();
            }
        }
    }
    private static int mostrarMenu(Scanner consola){
        System.out.println("""
                        1. Comprar Snack
                        2. Mostrar ticket
                        3. Agregar nuevo snack
                        4.Salir
                        """);
        return Integer.parseInt(consola.nextLine());

    }
    private static boolean ejecutarOpciones(int opcion,Scanner consola,
                                            List<Snack> productos){
        var salir = false;
            switch (opcion) {
                case 1 -> comprarSnack(consola, productos);
                case 2 -> mostrarTicket(productos);
                case 3 -> System.out.println("xd");
                case 4 -> salir = true;
            }
        return salir;
    }
    private static void comprarSnack(Scanner consola, List<Snack> productos){
        System.out.println("Que snack quieres comrpar(id)?: ");
        var idSnack = Integer.parseInt(consola.nextLine());
        var snackEncontrado = false;
        for (var snack: Snacks.getsnacks()){
            if (idSnack==snack.getIdsnack()) {

                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;

            }
        }
        if (!snackEncontrado){
            System.out.println("Id snack no encontrado "+ idSnack);
        }

    }

    public static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;
        for (var producto: productos){
            ticket += "\n\t-"+ producto.getNombre() + " - $"+producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $"+ total;
        System.out.println(ticket);
    }
}
