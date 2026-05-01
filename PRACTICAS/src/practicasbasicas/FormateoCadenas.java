public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("***Formateo de Cadenas***");
        var nombre = "Diego";
        var edad = 22;
        var salario = 1200.05;

        //string format
        var mensaje = String.format("Nombre: %s \nEdad: %d \nMi salario es %" +
                        ".2f",
                nombre,edad,salario);
        System.out.println(mensaje);
        //Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2nf%n");
    }
}
