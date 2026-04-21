package vehiculo_aplicacion;

public class Vehiculo {
    private String marca;
    private int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    protected void describir( ){
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidad máxima: " + getVelocidadMaxima());
    }
}
