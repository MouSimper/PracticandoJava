import java.text.BreakIterator;

public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("break and continue");
        //ejemplo imprimir el primer numero par
        for(var numero=1;numero<10;numero++){
            if (numero%2==0){
                System.out.println(numero + " ");
                break;
            }
        }
        //EJEMPLO CON CONTINUE
        System.out.println("\nPalabra Continue");
        for (var numero=1;numero<10; numero++){
            if(numero % 2 ==1){
                continue;
            }
            System.out.println(numero);
        }
    }
}
