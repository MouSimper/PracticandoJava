public class OperadorTernario {
    static void main() {
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "Par":"";
        System.out.println("El numero " + numero + " es "+ resultado);
    }
}
