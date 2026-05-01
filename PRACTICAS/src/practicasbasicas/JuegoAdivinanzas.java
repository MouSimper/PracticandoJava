import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var rand = new Random();
        var numeroAdivinar = rand.nextInt(1,51);
        var intentos = 1;
        var numeroIngresadoUsuario =0;
        final var INTENTOS_MAXIMOS = 10;
        System.out.println(numeroAdivinar);
        System.out.println("Ingresa un número entre 1 al 50: ");
        numeroIngresadoUsuario = Integer.parseInt(sc.nextLine());
        while (numeroIngresadoUsuario != numeroAdivinar && intentos <= INTENTOS_MAXIMOS) {
            if (numeroIngresadoUsuario <= 0 || numeroIngresadoUsuario>50) {
                System.out.println("Ingresa el número nuevamente");
                numeroIngresadoUsuario = Integer.parseInt(sc.nextLine());
            } else {
                if (numeroIngresadoUsuario > numeroAdivinar){
                    System.out.println("El numero secreto es menor");
                } else{
                    System.out.println("El numero secreto es mayor");
                }
                System.out.println("Intento n° " + intentos);
                intentos++;

                System.out.println("Intenta de nuevo, ingresa otro número: ");
                numeroIngresadoUsuario = Integer.parseInt(sc.nextLine());
            }
        }
        if (intentos>10){
            System.out.println("Perdiste hiciste muchos intentos");
        }else {
            System.out.printf("""
                    \tNúmero de intentos: %d
                    \tFelicitaciones adivinaste el numero : %d
                    """, intentos, numeroAdivinar);
        }
    }
}
