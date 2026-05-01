package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.io.Console;
import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        IClienteDAO solicitudesdellamadocliente = new ClienteDAO();
        var cliente = new Cliente();
        var sc = new Scanner(System.in);
        var continuar = false;
        System.out.println(solicitudesdellamadocliente.listarClientes());
        while (!continuar) {
            var opcion = mostrarMenu(sc);
            continuar = ejecutarOpciones(opcion, solicitudesdellamadocliente, sc);
        }
    }

    public static int mostrarMenu(Scanner sc) {
        System.out.println("""
                1.Listar Cliente
                2.Buscar Cliente
                3.Agregar Cliente
                4.Modificar Cliente
                5.Eliminar Cliente
                6. Salir
                """);

        return Integer.parseInt(sc.nextLine());
    }

    public static boolean ejecutarOpciones(int opcion,
                                           IClienteDAO clientesolicitud,Scanner sc) {
        var continuar = false;
        switch (opcion) {
            case 1 -> System.out.println(clientesolicitud.listarClientes());
            case 2 -> buscarClientePorId(sc, clientesolicitud);
            case 3 -> agregarCliente(sc,clientesolicitud);
            case 4 -> modificarCliente(sc,clientesolicitud);
            case 5 -> eliminarCliente(sc,clientesolicitud);
            case 6 -> {
                continuar = true;
            }
            default -> {
                System.out.println("Invalido: "+ opcion);;
            }
        }
        return continuar;
    }
    public static void buscarClientePorId(Scanner sc, IClienteDAO clienteDAO){
        System.out.println("Ingresa el ID del cliente a buscar: ");
        var idBuscado = Integer.parseInt(sc.nextLine());
        var cliente = new Cliente(idBuscado);
        System.out.println(clienteDAO.buscarClientePorId(cliente));
        System.out.println("Cliente encontrado con el ID "+idBuscado + ":" + cliente);
    }
    public static void agregarCliente(Scanner sc, IClienteDAO clienteDAO){

        var nombre = "";
        while (nombre.isBlank()){
            System.out.println("Ingresa el nombre del cliente: ");
            nombre = sc.nextLine();
        }
        var apellido = "";
        while (apellido.isBlank()){
            System.out.println("Ingresa el apellido del cliente: ");
            apellido = sc.nextLine();
        }
        int membresia = 0;
        boolean verificarmembresia=false;
        while (!verificarmembresia) {
            System.out.println("Ingresa la membresia del cliente: ");
            try {
                membresia = Integer.parseInt(sc.nextLine());
                verificarmembresia =true;
            }catch (Exception e){
                System.out.println("ERROR: "+ e.getMessage());
            }
        }
        var cliente = new Cliente(nombre,apellido,membresia);
        clienteDAO.agregarCliente(cliente);
    }
    public static void eliminarCliente(Scanner sc,IClienteDAO clienteDAO){
        System.out.println("Que cliente desea eliminar(id): ");
        var idIngresado = Integer.parseInt(sc.nextLine());
        var cliente = new Cliente(idIngresado);
        if (clienteDAO.eliminarCliente(cliente))
            System.out.println("Cliente ha sido eliminado: "+cliente);
        else
            System.out.println("No se pudo encontrar al cliente con el id "+ idIngresado);

    }
    public static void modificarCliente(Scanner sc,IClienteDAO clienteDAO){
        System.out.println("Que cliente desea modificar(id): ");
        var idIngresado = Integer.parseInt(sc.nextLine());
        System.out.println("Nombre: ");
        var nombreCambiado= sc.nextLine();
        System.out.println("Apellido: ");
        var apellidoCambiado = sc.nextLine();
        System.out.println("Membresia: ");
        var membresiaCambiado = Integer.parseInt(sc.nextLine());
        var cliente = new Cliente(idIngresado,nombreCambiado,apellidoCambiado
                ,membresiaCambiado);
        var modificado = clienteDAO.modificarCliente(cliente);
        if (modificado)
            System.out.println("Cliente modificado "+ cliente);
        else
            System.out.println("Cliente no modificado "+cliente);

    }
}

