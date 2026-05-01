package zonafit_proyecto.dominio;

import java.util.Objects;

public class Cliente {
    private final int idCliente;
    private String  nombre;
    private String apellido;
    private boolean membresia;
    private static int contadorSnack=0;

    public Cliente() {
        this.idCliente = ++contadorSnack;
    }

    public Cliente(String nombre, String apellido, boolean membresia) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", membresia=" + membresia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente == cliente.idCliente && membresia == cliente.membresia && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombre, apellido, membresia);
    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }
}
