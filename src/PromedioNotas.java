import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Cuantas calificaciones desea agregar? ");
        var cantidadCalificaciones = Integer.parseInt(sc.nextLine());
        int[] arreglo = new int[cantidadCalificaciones];
        var sumatoria=0;
        for(var i=0;i<cantidadCalificaciones;i++) {
            System.out.printf("\nCalificacion[%d] = ",  i+1);
            var calificacionAgregada = Integer.parseInt(sc.nextLine());
            arreglo[i] = calificacionAgregada;
            sumatoria+= calificacionAgregada;
            var promedio = sumatoria / (i+1);
            System.out.printf("\nPromedio %d",promedio);
        }


    }
}
