package TEMASAVANZADOS;

import figura_aplicacion.Figura;

public class ClasesAbstractas {
    public static void main(String[] args) {
        FiguraGeometrica objeto1 = new Rectangulo();
        objeto1.Dibujar();
        FiguraGeometrica objeto2 = new Circulo();
        objeto2.Dibujar();
    }
}

//clase abstracta
abstract class FiguraGeometrica{
    public abstract void Dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void Dibujar() {
        System.out.println("Se dibuja un rectangulo");
    }
}
class Circulo extends FiguraGeometrica{
    @Override
    public void Dibujar() {
        System.out.println("Se dibuja un circulo");
    }
}
