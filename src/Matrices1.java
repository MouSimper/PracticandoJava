import java.util.Scanner;

public class Matrices1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Escribir los renglones: ");
        var ren = Integer.parseInt(sc.nextLine());
        System.out.println("Escribir los columnas: ");
        var col = Integer.parseInt(sc.nextLine());
        var matriz = new int[ren][col];
        for (var i = 0; i < ren; i++) {
            for (var j = 0; j < col; j++) {
                System.out.println("Agrega la el valor dentro de la matriz  " +
                        "[" + i + "]" + "[" + j + "]" + "=");
                matriz[i][j] = Integer.parseInt(sc.nextLine());

            }
        }
        for (var i = 0; i < ren; i++) {
            for (var j = 0; j < col; j++) {
                System.out.println("Matriz  " + "[" + i + "]" + "[" + j + "]" + "=" + matriz[i][j]);
            }
        }
    }
}
