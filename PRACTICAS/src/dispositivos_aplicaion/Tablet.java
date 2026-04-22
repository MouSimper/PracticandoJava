package dispositivos_aplicaion;

public class Tablet extends Dispositivo{
    private boolean tieneLapiz;

    public Tablet(String marca, String modelo, int precioBase, boolean tieneLapiz) {
        super(marca, modelo, precioBase);
        this.tieneLapiz = tieneLapiz;
    }

    public boolean isTieneLapiz() {
        return tieneLapiz;
    }

    public void setTieneLapiz(boolean tieneLapiz) {
        this.tieneLapiz = tieneLapiz;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tiene lapíz? "+ tieneLapiz);
    }
}
