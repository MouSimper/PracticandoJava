package empleados_aplicacion;

public class EmpleadoFreelance extends Empleados{
    private int horasTrabajadas;
    private int precioPorHora;

    public EmpleadoFreelance(String nombre, int salario, int horasTrabajadas, int precioPorHora) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    @Override
    public int calcularSalario() {
        return horasTrabajadas * precioPorHora;
    }
}
