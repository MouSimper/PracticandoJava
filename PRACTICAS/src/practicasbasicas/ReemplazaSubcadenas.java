public class ReemplazaSubcadenas {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("cadena original");

         var nuevaCadena = cadena.replace("Mundo", "a todos" );
        System.out.println("nuevaCadena = " + nuevaCadena);

        //reemplaza "Hola" por "Adios

        nuevaCadena = cadena.replace("Hola","Saludos");
        System.out.println("nuevaCadena = "+ nuevaCadena);
    }
}
