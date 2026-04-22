package empleados_aplicacion;

public class Empleados {
    private String nombre;
    private int salario;

    public Empleados(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int calcularSalario(){
        return this.salario;
    }
}
