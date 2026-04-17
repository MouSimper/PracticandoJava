import java.util.Scanner;

public class NumeroPositivo {
    static void main() {
        var sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        var ingresonumero = Integer.parseInt(sc.nextLine());
        if (ingresonumero > 0){
            System.out.println("Es Positivo");
        } else if (ingresonumero < 0) {
            System.out.printf("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }
}
