import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("**Dibujo Trinagulo**");
        var sc = new Scanner(System.in);
        System.out.println("Proporciona el numero de filas: ");
        var numeroFilasIngresada = Integer.parseInt(sc.nextLine());
        for(var fila = 1; fila <=numeroFilasIngresada; fila++){
            var espacioenblanco = " ".repeat(numeroFilasIngresada - fila);
            var astericos = "*".repeat(2 * fila - 1);
            System.out.println(espacioenblanco + astericos);
        }


    }
}
