import java.util.Scanner;

public class CasaEspejos {
    static void main() {
        final var EDAD_OBLIGATORIA = 10;
        var sc = new Scanner(System.in);
        System.out.printf("Ingresa tu edad: ");
        var edadIngresado = Integer.parseInt(sc.nextLine());
        System.out.println("Miedo a la oscuridad: ");
        var tieneMiedo = Boolean.parseBoolean(sc.nextLine());
        if (!tieneMiedo && edadIngresado >= EDAD_OBLIGATORIA){
            System.out.println("Puedes entrar en la casa de espejos");
        }else{
            System.out.println("No puedes entrar a la casa");
        }
    }
}
