package TEMASAVANZADOS.excepciones;

public class ExcepcionEdadMain {
    public static void main(String[] args){
        try{
            Validacion.ValidarEdad(5);
        }
        catch (EdadInvalidaException e){
                System.out.println("Error "+e.getMessage());
        }
    }
}
