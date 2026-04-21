package figura_aplicacion;

public class Circulo extends Figura{
    private float radio;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void CalcularArea(){
        System.out.println("El área del circulo " + 3.14 * this.radio*this.radio);
    }
    @Override
    public void describir() {
        super.describir();
        System.out.println("Tiene un radio de: "+ radio);
    }
}
