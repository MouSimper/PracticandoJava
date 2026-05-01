package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

    @Autowired
    private IClienteServicio clienteServicio;

    private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);
    String nl = System.lineSeparator();
	public static void main(String[] args) {
        //Levanta la fabrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        zonaFitApp();
    }
    private void zonaFitApp(){
        logger.info(nl +"***APLICACIÓN ZONA FIT***"+ nl);
        var salir = false;
        var consola = new Scanner(System.in);
        while (!salir){
            var opcion = mostrarmenu(consola);
            salir = ejecutarOpciones(consola,opcion);
            logger.info("");
        }
    }
    private int mostrarmenu(Scanner consola){
        logger.info("""
                1.Listar Clientes
                2.Buscar Cliente
                3.Agregar Cliente
                4.Modificar cliente
                5.Eliminar cliente
                6.Salir
                Elige una opcion: """);
         return Integer.parseInt(consola.nextLine());
    }
    private boolean ejecutarOpciones(Scanner sc, int option){
        var salir = false;
        switch (option){
            case 1 -> {
                logger.info(nl+"Listado de clientes"+nl);
                List<Cliente> clientes = clienteServicio.listarClientes();
                clientes.forEach(cliente -> logger.info(cliente.toString()+nl));
            }
            case 2 -> {
                logger.info(nl + " Buscar cliente por ID "+nl);
                var idCliente = Integer.parseInt(sc.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null){
                    logger.info("Cliente encontrado "+cliente);
                } else{
                    logger.info("Cliente no encontrado");
                }
            }
            case 3 ->{
                logger.info("Agregar estudiante "+ nl);
                logger.info("Nombre:" );
                var nombre = sc.nextLine();
                logger.info("Apellido:" );
                var apellido = sc.nextLine();
                logger.info("Membresia:" );
                var membresia = Integer.parseInt(sc.nextLine());
                var cliente = new Cliente();
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setMembresia(membresia);
                clienteServicio.guardarCliente(cliente);
                logger.info("Cliente agregado: "+ cliente+ nl);
            }
            case 4 -> {
                logger.info("Modificar cliente"+nl);
                logger.info("Id cliente: ");
                var idCliente = Integer.parseInt(sc.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null){
                    logger.info("Nombre:" );
                    var nombre = sc.nextLine();
                    logger.info("Apellido:" );
                    var apellido = sc.nextLine();
                    logger.info("Membresia:" );
                    var membresia = Integer.parseInt(sc.nextLine());
                    cliente.setNombre(nombre);
                    cliente.setApellido(apellido);
                    cliente.setMembresia(membresia);
                    clienteServicio.guardarCliente(cliente);
                    logger.info("Cliente modificado: "+cliente+nl);
                }
                else
                    logger.info("No encontrado "+cliente+ nl);
            }
            case 5 ->{
                logger.info("Eliminar cliente"+nl);
                logger.info("Id cliente: ");
                var idCliente = Integer.parseInt(sc.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null){
                    clienteServicio.eliminarCliente(cliente);
                    logger.info("Cliente eliminado: "+cliente+nl);
                }
                else
                    logger.info("Cliente No encontrado");
            }
            case 6 ->{
                logger.info("Hasta pronto "+ nl+nl);
                salir=true;
            }
            default -> logger.info("Opcion no reconocida "+option+nl);
        }
        return salir;
    }
}
