package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        try{
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo");
            lineas.forEach(System.out::println);
            System.out.println("********+");
            for(String linea:lineas){
                System.out.println(linea);
            }
        } catch (Exception e){
            System.out.println("Erro al leer el archivo: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
