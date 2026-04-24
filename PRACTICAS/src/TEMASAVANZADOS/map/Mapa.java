package TEMASAVANZADOS.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();
        persona.put("Nombre","Diego");
        persona.put("Apellido","Huaman");
        persona.put("edad","22");
        System.out.println("Valores del mapa");
        persona.entrySet().forEach(System.out::println);

        persona.forEach((llave,valor)->{
            System.out.println("Llave "+llave+" valor "+valor);
        });

    }
}
