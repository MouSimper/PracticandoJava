public class Persona {

    String nombre;
    String apellido;
    void MostrarNombre(){
        var variablesLocal="Valor1";
        System.out.println("Variable Local = " + variablesLocal);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }

    public static void main(String[] args) {
        var objeto1 = new Persona();
        objeto1.nombre = "Diego";
        objeto1.apellido = "Huaman";
        objeto1.MostrarNombre();
        var objeto2 = new Persona();
        objeto2.nombre ="Isabel";
        objeto2.apellido = "Durcal";
        objeto2.MostrarNombre();
    }
}
