package dispositivos_aplicaion;

public class Telefono extends Dispositivo{
    private String numeroSIM;

    public Telefono(String marca, String modelo, int precioBase, String numeroSIM) {
        super(marca, modelo, precioBase);
        this.numeroSIM = numeroSIM;
    }

    public String getNumeroSIM() {
        return numeroSIM;
    }

    public void setNumeroSIM(String numeroSIM) {
        this.numeroSIM = numeroSIM;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("El número SIM es: "+numeroSIM);
    }
}
