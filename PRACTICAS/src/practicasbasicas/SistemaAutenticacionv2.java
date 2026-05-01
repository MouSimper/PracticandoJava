import java.util.Scanner;

public class SistemaAutenticacionv2 {
    static void main() {
        final var USUARIO_DEFINIDO = "diego";
        final var CONTRASENIA_DEFINIDO = "diego123";
        var sc = new Scanner(System.in);
        System.out.println("Ingresa el usuario: ");
        var usuarioIngresado = sc.nextLine().strip();
        System.out.println("Ingresa la contraseña: ");
        var contraseniaIngresada = sc.nextLine().strip();
        var validacion = switch (usuarioIngresado){
                    case USUARIO_DEFINIDO -> {
                        if(CONTRASENIA_DEFINIDO.equals(contraseniaIngresada))
                            yield "Bienvenido al sistema";
                        else
                            yield "Password incorrecto, favor corregirlo!";
                    }
                    default -> {
                        if(CONTRASENIA_DEFINIDO.equals(contraseniaIngresada)){
                            yield "Usuario incorrecto";
                        }else{
                            yield  "Usuario y password incorrectos, favor de " +
                                    "corregirlo";
                        }
                    }
                } ;
        System.out.println(validacion);

    }
}
