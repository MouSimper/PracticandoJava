package empleados_aplicacion.prueba_aplicacion;

import empleados_aplicacion.EmpleadoFijo;
import empleados_aplicacion.EmpleadoFreelance;

public class PruebaEmpleado {
    public static void main(String[] args) {
        var objeto1 = new EmpleadoFreelance("Diego",0,8,21);
        System.out.println(objeto1.calcularSalario());
        var objeto2 = new EmpleadoFijo("Arturo",1200);
        System.out.println(objeto2.calcularSalario());
    }
}
