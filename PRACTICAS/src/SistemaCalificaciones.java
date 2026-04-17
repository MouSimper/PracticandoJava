import java.util.Scanner;

public class SistemaCalificaciones {
    static void main() {
        var sc = new Scanner(System.in);
        System.out.printf("Ingresa la nota que recibiste: ");
        var notaIngresada = Integer.parseInt(sc.nextLine());
        var notaConvertida = "";
        if (notaIngresada>=9  && notaIngresada<=10){
            notaConvertida = "A";
        } else if (notaIngresada>=8 && notaIngresada<9) {
            notaConvertida = "B";
        } else if (notaIngresada>=7 && notaIngresada<8){
            notaConvertida = "C";
        } else if (notaIngresada>=6 && notaIngresada<7){
            notaConvertida = "D";
        } else if (notaIngresada>=0 && notaIngresada<6){
            notaConvertida = "F";
        } else {
            System.out.println("Valor Desconocido");;
        }
        System.out.printf("""
                Nota Ingresada: %d
                Nota Convertida: %s
                """,notaIngresada,notaConvertida);
    }
}
