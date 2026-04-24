package sistemaventas_aplicacion;

public class Producto {
    private final int idproducto;
    private String nombre;
    private float precio;
    private static int contadorproductos=0;

    public Producto(int idproducto, String nombre, float precio) {
        this.idproducto = ++Producto.contadorproductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idproducto=" + idproducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

}
