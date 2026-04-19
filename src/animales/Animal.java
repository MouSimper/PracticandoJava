package animales;

public class Animal{
    protected void comer(){
        System.out.println("Como muchas veces al día");
    }
    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }
}

class Perro extends Animal{
    public void hacersonidos(){
        System.out.println("Puedo ladrar");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("Clase padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacersonidos(); no le pertenece al padre
        System.out.println("\nClase Hija, soy un perro");
        var perro = new Perro();
        perro.comer();
        perro.dormir();
        perro.hacersonidos();
        
    }
}
