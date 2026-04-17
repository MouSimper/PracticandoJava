import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        System.out.println("**Números Random**");
        var rand = new Random();
        var numeroAleatorio = rand.nextInt(10);
        System.out.println("Numero aletorio = "+ numeroAleatorio);

    }
}
