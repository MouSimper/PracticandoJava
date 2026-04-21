package figura_aplicacion;

public class Figura {
    public Figura(String color) {
        this.color = color;
    }

    private String color;

    public Figura() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void describir(){
        System.out.println("La figura tiene el color: " + this.color);
    }
}
