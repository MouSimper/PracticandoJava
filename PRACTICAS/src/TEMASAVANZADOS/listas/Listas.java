package TEMASAVANZADOS.listas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Listas {
    public static void main(String[] args) {
        List<String> milista = new ArrayList();
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        milista.add("Viernes");
        for (Object elemento: milista){
            System.out.println("Día de la semana: " +elemento);
        }

        milista.forEach(elemento ->{
            System.out.println("Elemento "+elemento);
        });
        System.out.println("*********************");
        milista.forEach(System.out::println);

        List<String> nombre = Arrays.asList("Pedro","Ruiz","Nohemi");
        nombre.forEach(System.out::println);
    }
}
