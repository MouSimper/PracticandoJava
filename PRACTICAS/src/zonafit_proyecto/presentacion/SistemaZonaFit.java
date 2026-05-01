package zonafit_proyecto.presentacion;

import java.util.Scanner;

public class SistemaZonaFit {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var continuar = false;
        while(!continuar){
           try {
               var opcion = mostrarMenu(sc);
               continuar = ejecutarOpcion(opcion);
           }catch (Exception e){
               System.out.println("Error en el sistema: "+ e.getMessage());
           }
        }
    }
    private static int mostrarMenu(Scanner sc){
        System.out.println("""
                1. Listar a los clientes
                2. Agregar a un cliente
                3. Modificar a un cliente
                4. Eliminar a un cliente
                5. Salir
                """);
        return sc.nextInt();
    }
    private static boolean ejecutarOpcion(int opcion){
        var salir = false;
        switch (opcion){
            case 1 ->{} //listarcliente();;
            case 2 ->{} //agregarCliente();
            case 3 ->{} //modificarCliente();
            case 4 ->{} //EliminarCliente();
            case 5 -> {
                System.out.println("Hasta luego");
                salir = true;
            }
        }
        return salir;
    }
}
