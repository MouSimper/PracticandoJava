import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("**Sistemas de Empleados**");
        var sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        var nombre = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        var edad = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa tu salario: ");
        var salario = Double.parseDouble(sc.nextLine());
        System.out.println("Es jefe de departamento? ");
        var esJefe = Boolean.parseBoolean(sc.nextLine());
        var resultadoFinal = new StringBuilder();
        resultadoFinal.append("Bienvenido ").append(nombre).append("\nTienes ").append(edad).append("\nTu salario es de ").append(salario).append("\nEs Jefe? ").append(esJefe);
        System.out.println(resultadoFinal);
    }
}
