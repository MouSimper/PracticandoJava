package TEMASAVANZADOS.proyecto_maquina_Snacks;

public class Snack {
        private final int idsnack;
        private String nombre;
        private double precio;
        private static int contadorSnak;

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
        public String toString() {
            return super.toString();
        }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
        public int hashCode() {
            return super.hashCode();
        }
}
