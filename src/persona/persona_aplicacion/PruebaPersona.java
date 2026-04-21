package persona.persona_aplicacion;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        var objeto1 = new Persona("Diego","Huaman");
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getApellido());
    }
}
