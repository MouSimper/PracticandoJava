public class MetodosDeCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        cadena1.replace('o','a');
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena ="+ nuevaCadena);

        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = "+ mayusculas);

        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = "+ minusculas);

        var cadena2= "Leo Reyes         ";
        System.out.println("cadena con espacios = "+ cadena2 );
        System.out.println("cadena sin espacios = "+ cadena2.trim()  );
    }
}
