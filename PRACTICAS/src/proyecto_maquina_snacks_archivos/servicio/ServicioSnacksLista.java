package proyecto_maquina_snacks_archivos.servicio;

import proyecto_maquina_snacks_archivos.dominio.Snack;


import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks{
    private static final List<Snack> lista1;

    static {
        lista1 = new ArrayList<>();
        lista1.add(new Snack(70, "Papa"));
        lista1.add(new Snack(90, "Chela"));
        lista1.add(new Snack(80, "Hamburguesa"));
    }


    public void agregarSnack(Snack snack) {
        lista1.add(snack);
    }

    public void mostrarSnacks(){
        System.out.println("Lista de Snacks");
        var inventariosSnack = "";
        for(var snack:lista1){
            inventariosSnack += snack.toString() + "\n";
        }
        System.out.println("----Snacks en el inventario----");
        System.out.println(inventariosSnack);
    }

    public List<Snack> getSnacks(){
        return lista1;
    }
}
