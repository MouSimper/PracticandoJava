import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var cerrarAplicacion = false;
        var numero1 = 0;
        var numero2 = 0;
        while (!cerrarAplicacion){
            System.out.println("""
                    \tCalculadora
                    \t1. Suma
                    \t2. Resta
                    \t3. Multiplicacion
                    \t4. División
                    \t5. Salir
                    """);
            var opcion = Integer.parseInt(sc.nextLine());
            if (opcion>=1 && opcion<=4){
                System.out.println("Ingresa el primer numero: ");
                numero1 = Integer.parseInt(sc.nextLine());
                System.out.println("Ingresa el segundo numero");
                numero2 = Integer.parseInt(sc.nextLine());
            }
            switch (opcion){
                case 1 ->{
                    var sumaTotal = numero1 + numero2;
                    System.out.println("La suma de "+ numero1 + "+" +numero2 + "=" + sumaTotal);
                }
                case 2 ->{
                    var restaTotal = numero1 - numero2;
                    System.out.println("La resta de "+ numero1 + "-" +numero2 +
                            "=" + restaTotal);
                }
                case 3 ->{
                    var multitplicacionTotal = numero1 * numero2;
                    System.out.println("La multiplicación de "+ numero1 + "x" +numero2 + "=" + multitplicacionTotal);
                }
                case 4 ->{
                    if (numero2 == 0){
                        System.out.println("No se puede dividir entre 0");
                    }else {
                        float multitplicacionTotal = numero1 / numero2;
                        System.out.printf("La division de %d / %d es igual a %.2f",
                                numero1, numero2,
                                multitplicacionTotal);
                    }
                }
                case 5 ->{
                    System.out.println("Saliendo del sistema");
                    cerrarAplicacion = true;
                }
            }
        }
    }
}
