package TEMASAVANZADOS.excepciones;

public class AccesoArreglo {
    public static void AccesoArreglo(int acceso){
        int[] numeros = {1,2,3,4,5};
        try{
            System.out.println(numeros[acceso]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Falla en la buscqueda" +
                    " el arreglo cuenta con "+numeros.length + " ustede " +
                    "busca" +
                    "en la posición "+ acceso);
        }
        finally {
            System.out.println("Proceso finalizado");
        }

    }
}
