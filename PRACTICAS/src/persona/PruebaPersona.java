package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("VARIABLE ESTATICA: ");
        var objeto1 = new Persona("Diego","Huaman");
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getApellido());
        System.out.println(objeto1.getIdPersona());
        var objeto2 = new Persona("Arturo","Bonilla");
        System.out.println(objeto2.getNombre());
        System.out.println(objeto2.getApellido());
        System.out.println(objeto2.getIdPersona());
        System.out.println("VARIABLE ESTATICA: "+ objeto2.getIdPersona());

    }
}
