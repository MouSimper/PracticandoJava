public class AcumuladorSuma {
    public static void main(String[] args) {
        final var CANT_MAX_SUMA = 5;
        var acumuladorSuma = 0;
        var numero2 = 1;
        while(numero2 <=CANT_MAX_SUMA){
            System.out.println("Suma Acumulada = "+acumuladorSuma +"+"+  numero2 );
            acumuladorSuma+= numero2;
            numero2++;
            System.out.println("Suma Acumulada = "+acumuladorSuma);
        }
    }
}
