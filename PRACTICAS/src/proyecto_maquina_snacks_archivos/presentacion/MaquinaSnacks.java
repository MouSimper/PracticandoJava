package proyecto_maquina_snacks_archivos.presentacion;

import proyecto_maquina_snacks_archivos.dominio.Snack;
import proyecto_maquina_snacks_archivos.servicio.IServicioSnacks;
import proyecto_maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import proyecto_maquina_snacks_archivos.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var continuar = false;
        //IServicioSnacks servicioSnacks = new ServicioSnacksLista();
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();

        List<Snack> productos = new ArrayList<>();
        while(!continuar){
            try {
                var opcion = mostrarMenu(sc);
                continuar = ejecutarOpciones(opcion,sc,productos, servicioSnacks);

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
                        4. Inventario de snack
                        5. Salir
                        """);
        return Integer.parseInt(consola.nextLine());

    }
    private static boolean ejecutarOpciones(int opcion,Scanner consola,
                                            List<Snack> productos,
                                            IServicioSnacks servicioSnacks){
        var salir = false;
            switch (opcion) {
                case 1 -> comprarSnack(consola, productos,servicioSnacks);
                case 2 -> mostrarTicket(productos);
                case 3 -> agregarSnack(consola,servicioSnacks);
                case 4 -> listarInventarioSnack(consola,servicioSnacks);
                case 5 -> {
                        System.out.println("\nVuelva pronto");
                        salir = true;
                }

                default -> System.out.println("opcion invalida" + opcion);
            }
        return salir;
    }

    private  static void listarInventarioSnack(Scanner consola,
                                               IServicioSnacks servicioSnacks){
        servicioSnacks.mostrarSnacks();
    }
    private static void comprarSnack(Scanner consola, List<Snack> productos,
                                     IServicioSnacks servicioSnacks){
        System.out.println("Que snack quieres comrpar(id)?: ");
        var idSnack = Integer.parseInt(consola.nextLine());
        var snackEncontrado = false;
        for (var snack: servicioSnacks.getSnacks()){
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
    private static void agregarSnack(Scanner consola,IServicioSnacks servicioSnacks){
        System.out.println("Nombre Snack: ");
        var nombre = consola.nextLine();
        System.out.println("Precio del snack: ");
        var precio =  Double.parseDouble(consola.nextLine());
        servicioSnacks.agregarSnack(new Snack(precio,nombre));
        System.out.println("Tu snack ha sido creado correctamente"+ nombre + precio);
        servicioSnacks.mostrarSnacks();
    }
}
