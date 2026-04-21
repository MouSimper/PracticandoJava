package vehiculo_aplicacion;

public class Auto extends Vehiculo{
    private int numeroPuertas;

    public Auto(String marca, int velocidadMaxima,int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas =numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
