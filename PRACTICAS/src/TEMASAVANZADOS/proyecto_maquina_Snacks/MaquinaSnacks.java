package TEMASAVANZADOS.proyecto_maquina_Snacks;

import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var continuar = true;
        Snack objeto = new Snack(1.50,"Casino");
        Snack objeto1 = new Snack(2.50,"Gaseosa Inka Cola");
        Snack objeto2 = new Snack(0.50,"Rellenitas");

        Snacks objetosnacks = new Snacks();
        while(continuar){
            System.out.println("""
                    1. Comprar Snack
                    2. Mostrar ticket
                    3. Agregar nuevo snack
                    4.Salir
                    """);
            var opcion = Integer.parseInt(sc.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Que snack quieres comprar(id): ");
                    var elegirsnack = Integer.parseInt(sc.nextLine());
                    objetosnacks.getSnacks(elegirsnack);
                case 2:
                    objetosnacks.mostrarsnacks();
                case 3:
                    System.out.println("XD");
            }
        }
    }
}
