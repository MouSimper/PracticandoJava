package TEMASAVANZADOS.excepciones;

public class Validacion {
    public static void ValidarEdad(int edad) throws EdadInvalidaException{
        if (edad < 18) {
            throw new EdadInvalidaException("Eres menor de edad");
        }
        System.out.println("Acceso permitido");
    }
}
