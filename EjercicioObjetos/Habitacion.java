package ProductoHotel;

import java.util.ArrayList;

public class Habitacion {

    private String tipo;
    private int adicional;
    private double precioHabitacion;

    public Habitacion(String tipo, int adicional, double precioHabitacion){
        this.tipo = tipo;
        this.adicional = adicional;
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAdicional() {
        return adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    public double adicionalMasPrecio(){
        return getAdicional() + getPrecioHabitacion();
    }
}
