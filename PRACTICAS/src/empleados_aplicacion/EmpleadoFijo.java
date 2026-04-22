package empleados_aplicacion;

public class EmpleadoFijo extends Empleados{
    public EmpleadoFijo(String nombre, int salario) {
        super(nombre, salario);
    }

    @Override
    public int calcularSalario() {
        return super.calcularSalario()+500;
    }
}
