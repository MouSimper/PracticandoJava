package figura_aplicacion;

public class Rectangulo extends Figura{
    private int alto;
    private int ancho;

    public Rectangulo(String color, int alto, int ancho) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("El alto de la figura es: "+alto);
        System.out.println("El ancho de la figura es: "+ancho);
    }

    public void CalcularArea(){
        System.out.println("El area del rectangulo "+ ancho*alto);
    }
}
