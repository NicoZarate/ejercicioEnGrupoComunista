package ejercicio2;

public class Adicional {

    private String nombre;
    private double precio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Adicional(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
