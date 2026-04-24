package sistemaventas_aplicacion;

public interface Traductor {
    void traducir();
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor");
    };
}


class Ingles implements Traductor{
    @Override
    public void traducir() {
        System.out.println("Traduzco a ingles");
    }
}
class pruebaTraductor{
    public static void main(String[] args) {
        Traductor objeto1 = new Ingles();
        objeto1.iniciarTraductor();
        objeto1.traducir();
    }
}