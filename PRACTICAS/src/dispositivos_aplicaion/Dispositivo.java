package dispositivos_aplicaion;

public class Dispositivo {
    private String marca;
    private String modelo;
    private int precioBase;

    public Dispositivo(String marca, String modelo, int precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public void describir(){
        System.out.println("El dispositivo es de la marca "+this.marca);
        System.out.println("El dispositivo es del modelo "+this.modelo);
        System.out.println("El dispositivo tiene un precio base de "+this.precioBase);
    }
}
