import java.util.Scanner;

public class SistemaAutenticacion {
    static void main() {
        System.out.println("***Sistema de Autenticación***");
        var sc = new Scanner(System.in);
        final var USUARIO_CORRECTO = "Diego";
        final var CONTRASENIA_CORRECTA = "Diego123";
        System.out.println("Ingrese su usuario:");
        var usuarioInicial = sc.nextLine().trim();
        System.out.println("Ingrese su contraseña:");
        var contraseniaInicial = sc.nextLine();
        var normalizarUsuariocorrecto = USUARIO_CORRECTO.toLowerCase();
        var normalizarContraseniacorrecta = CONTRASENIA_CORRECTA.toLowerCase();

        var normalizarUsuarioinicial = usuarioInicial.toLowerCase();
        var normalizarContraseniainicial = contraseniaInicial.toLowerCase();



        var verificarUsuario = normalizarUsuarioinicial.equals(normalizarUsuariocorrecto) &&
                normalizarContraseniainicial.equals(normalizarContraseniacorrecta);


        System.out.println("El usuario es correcto? " + verificarUsuario);


    }
}
