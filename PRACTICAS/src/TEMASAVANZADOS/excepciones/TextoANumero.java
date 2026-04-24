package TEMASAVANZADOS.excepciones;

public class TextoANumero {

    public static int cambiarANumero(String palabra) {

        try {
            int numero = Integer.parseInt(palabra);
            return numero;

        } catch (NumberFormatException e) {
            System.out.println("Error: no es un número válido");
            return 0;

        } finally {
            System.out.println("Fin del proceso");
        }
    }
}