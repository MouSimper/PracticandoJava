package TEMASAVANZADOS.sets;

import java.util.TreeSet;
import java.util.Set;
public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto1 = new TreeSet<>();
        conjunto1.add("Carlos");
        conjunto1.add("Carlos");
        conjunto1.add("Karla");
        conjunto1.add("Victoria");

        System.out.println("Elementos en el Set");
        conjunto1.forEach(System.out::println);


        conjunto1.remove("Karla");
        System.out.println("\nElementos del nuevo Set");
        conjunto1.forEach(System.out::println);

    }
}
