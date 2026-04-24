package TEMASAVANZADOS.excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws Exception{
        if(denominador ==0)
            throw new RuntimeException("Division entre 0");
        return numerador/denominador;
    }
}
