import java.util.Scanner;

public class CalculoAreaPerimetro {
    static void main() {
        System.out.println("**Calcular Area y Perimetro de un Rectangulo");
        var sc = new Scanner(System.in);
        System.out.println("Dime la base del Rectangulo: ");
        var base = Integer.parseInt(sc.nextLine());
        System.out.println("Dime la altura del Rectangulo: ");
        var altura = Integer.parseInt(sc.nextLine());

        var calculararea = base * altura;
        System.out.println("El area del Rectangulo es "+calculararea);
        var perimetro = 2 * (base + altura);
        System.out.println("El perimetro del Rectangulo es "+perimetro);
    }
}
