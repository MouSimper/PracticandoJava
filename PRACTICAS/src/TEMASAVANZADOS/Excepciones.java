package TEMASAVANZADOS;

public class Excepciones {
    public static void main(String[] args) {
        int valor = 10;
        int valor2 = 0;
        try{
            var resultado = valor/valor2;
            System.out.println("Resultado " + resultado);
        }catch (Exception e){
            System.out.println("Ocurrio un error: "+e);
        }

    }
}
