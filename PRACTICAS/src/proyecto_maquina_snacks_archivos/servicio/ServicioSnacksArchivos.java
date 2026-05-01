package proyecto_maquina_snacks_archivos.servicio;

import proyecto_maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";
    //CREAR LA LISTA DE SNACKS
    private List<Snack> snacks = new ArrayList<>();

    //Constructor clase
    public ServicioSnacksArchivos(){
        //CREAMOS EL ARCHIVO SI NO EXISTE
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe=archivo.exists();
            if(existe){
                this.snacks = obtenerSnack();
            }
            else{
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); //Guarda el archivo en el disco
                System.out.println("Se ha creado el archivo");
            }
        }catch (Exception e){
            System.out.println("Error al crear el archivo "+e.getMessage());
        }
        //SI NO EXISTE, CARGAMOS AL CREAR EL ARCHIVO
        if (!existe){
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack(70, "Papa"));
        this.agregarSnack(new Snack(90, "Chela"));
        this.agregarSnack(new Snack(80, "Hamburguesa"));
    }
    @Override
    public void agregarSnack(Snack snack) {
        //Agregamos el nuevo snack, 1. a la lista en memoria
        this.snacks.add(snack);
        //2. Guardamos el nuevo snack en el archivo
        this.agregarSnackArchvio(snack);
    }
    private void agregarSnackArchvio(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(snack.escribirSnack());
            salida.close();//se escribe la informacion en el archivo

        }catch (Exception e){
            System.out.println("Error encontrado "+ e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("----Snacks del inventario----");
        var inventarioSnacks = "";
        for(var snack: this.snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }
    private List<Snack> obtenerSnack(){
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for(String linea: lineas){
                String[] lineaSnack = linea.split(","); //parseo separado por
                // coma
                var idSnack= lineaSnack[0]; //No se usa
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack = new Snack(precio,nombre);
                snacks.add(snack);
            }
        }catch (Exception e){
            System.out.println("Error al leer el archivo "+e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
