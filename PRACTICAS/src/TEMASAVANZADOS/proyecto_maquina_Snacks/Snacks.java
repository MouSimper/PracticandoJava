package TEMASAVANZADOS.proyecto_maquina_Snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> lista1;

    static {
        lista1 = new ArrayList<>();
        lista1.add(new Snack(70, "Papa"));
        lista1.add(new Snack(90, "Chela"));
        lista1.add(new Snack(80, "Hamburguesa"));
    }

    public void agregarsnacks(Snack objeto){
        lista1.add(objeto);
    }
    public static void mostrarsnacks(){
        System.out.println("Lista de Snacks");
        var inventariosSnack = "";
        for(var snack:lista1){
            inventariosSnack += snack.toString() + "\n";
        }
        System.out.println("----Snacks en el inventario----");
        System.out.println(inventariosSnack);
    }
    public static List<Snack> getsnacks(){
        return lista1;
    }
}
