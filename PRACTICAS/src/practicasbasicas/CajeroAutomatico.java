import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var salir = false;
        var saldo = 1000;
        while (!salir){
            System.out.println("""
                    1. Depositar
                    2. Retirar
                    3. Consultar saldo
                    4. Salir
                    """);
            var opcion = Integer.parseInt(sc.nextLine());
            switch (opcion){
                case 1 -> {
                    System.out.println("Cuanto desea depositar: ");
                    var deposito = Float.parseFloat(sc.nextLine());
                    saldo += deposito;
                }
                case 2 ->{
                    System.out.println("Cuanto desea retirar: ");
                    var retirar = Float.parseFloat(sc.nextLine());
                    if(retirar > saldo){
                        System.out.println("No puede retirar más de lo que " +
                                "tiene " + saldo);
                    } else{
                        saldo -= retirar;
                    }

                }
                case 3 ->{
                    System.out.println("Su saldo actual es: " + saldo );
                }
                case 4 ->{
                    System.out.println("Hasta luego");
                    salir = true;
                }
                default -> System.out.println("Revise la opción nuevamente");
            }
        }
    }
}
