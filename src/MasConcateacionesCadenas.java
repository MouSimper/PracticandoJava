import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentSkipListMap;

public class MasConcateacionesCadenas {
    public static void main(String[] args) {
        var cadena1 ="Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " "+ cadena2;

        System.out.println("Cadena3 usando + = " + cadena3);


        //metodo concat

        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = "+ cadena3);

        //StringBuilder (más eficiente)
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);

        var resultado = constructorCadenas.toString();constructorCadenas.append(cadena1).append(" ").append(cadena2).toString();
        System.out.println("resultado = " + constructorCadenas);

        //StringBuffer (cuando trabajas con varios Hilos)
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado String Buffer = "+resultado);


        var  mensaje = String.join(", ","Hola","Mundo","Java");
        var fecha = String.join("-","2024","01","15");

        System.out.println(mensaje);
        System.out.println(fecha);



    }
}
