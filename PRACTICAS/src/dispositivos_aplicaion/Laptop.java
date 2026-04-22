package dispositivos_aplicaion;

public class Laptop extends Dispositivo{
    private int memoriaRAM;

    public Laptop(String marca, String modelo, int precioBase, int memoriaRAM) {
        super(marca, modelo, precioBase);
        this.memoriaRAM = memoriaRAM;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("La memoria RAM es de "+memoriaRAM +"GB");
    }
}
