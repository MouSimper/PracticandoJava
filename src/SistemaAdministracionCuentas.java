import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var salir = false;
        while (!salir){
            System.out.println("""
                    Sistema administracion de cuentas
                    \tMenú:
                    \t1. Crear cuenta
                    \t2. Eliminar cuenta
                    \t3. Salir
                    \tEscoje una opción
                    """);
            var opcion = Integer.parseInt(sc.nextLine());
            switch (opcion){
                case 1 -> System.out.println("Creando cuenta...");
                case 2 -> System.out.println("Eliminando cuenta...");
                case 3 -> {
                    System.out.println("Adeof");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida");
                }
            }
        }
    }
