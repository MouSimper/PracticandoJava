package persona;

public class Persona {
    private static int contadorPersonas=0;
    private String nombre;
    private String apellido;
    private int idPersona;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //Incrementar el atributo estatico
        this.idPersona = ++Persona.contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.nombre = apellido;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }
}
