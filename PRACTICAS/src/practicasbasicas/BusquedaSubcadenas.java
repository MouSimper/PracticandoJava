public class BusquedaSubcadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";

        var indice1 = cadena1.indexOf("Hola");

        System.out.println("Indice 1 = "+ indice1);

        //subcadena de Mundo

        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice 2 = "+ indice2);

        //subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " +indice3);

    }
}
