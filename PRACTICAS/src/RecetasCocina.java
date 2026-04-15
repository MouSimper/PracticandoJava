import java.util.Scanner;

public class RecetasCocina {
        public static void main(String[] args) {
            System.out.println("**Recetas de Cocina**");
            var sc = new Scanner(System.in);
            System.out.println("Ingresa el Nombre de la Receta: ");
            var nombreReceta = sc.nextLine();
            System.out.println("Ingresa los ingredientes: ");
            var nombreIngredientes = sc.nextLine();
            System.out.println("Ingresa el tiempo de preparación(min): ");
            var tiempoPreparacion = Integer.parseInt(sc.nextLine());
            System.out.println("Dificultad ('Facil, Media, Alta') ");
            var dificultad = sc.nextLine();
            var resultadoFinal = new StringBuilder();
            resultadoFinal.append("--- Receta de cocina ---").append("\nLa receta creada lleva por nombre: ").append(nombreReceta).append("\nLos Ingredientes son: ").append(nombreIngredientes).append("\nEl tiempo de preparación(min): ").append(tiempoPreparacion).append("\nLa dificultad es: ").append(dificultad);
            System.out.println(resultadoFinal);
        }
}
