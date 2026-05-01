package proyecto_maquina_snacks_archivos.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
        private final int idsnack;
        private String nombre;
        private double precio;
        private static int contadorSnak=0;

        public Snack(){
            this.idsnack = ++contadorSnak;
        }
        public Snack(double precio, String nombre) {
            this();
            this.precio = precio;
            this.nombre = nombre;
        }

        public int getIdsnack() {
            return idsnack;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

    public static int getContadorSnak() {
        return contadorSnak;
    }

    public static void setContadorSnak(int contadorSnak) {
        Snack.contadorSnak = contadorSnak;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idsnack == snack.idsnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idsnack=" + idsnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    public String escribirSnack(){
        return idsnack + "," + nombre + "," + precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsnack, nombre, precio);
    }
}
