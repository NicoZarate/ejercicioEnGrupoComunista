package ProductoHotel;
import java.util.*;

public class Hotel extends  Producto{

    private int cantidadNoches;
    private int cantidadEstrellas;
    ArrayList<Habitacion> habitaciones;

    public Hotel(int cant_noches, int cant_estellas, int montoBase, double porcionGanaciaDespegar, double retencionDelGobierno*/){
        this.cantidadNoches= cant_noches;
        this.cantidadEstrellas= cant_estellas;
        habitaciones = new ArrayList<Habitacion>();
        /*
        * this.montoBase = montoBase;
        * this.porcionGanaciaDespegar = montoBase;
        * this.retenciongobierno = retenciongobierno;
        * */
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public int getCantidadEstrellas() {
        return cantidadEstrellas;
    }

    public void setCantidadEstrellas(int cantidadEstrellas) {
        this.cantidadEstrellas = cantidadEstrellas;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public double gananciaDespegar(){

    }

    @Override
    public double montoTotal(){
        return (this.cantidadNoches *(this.precioTotalDeLasHabitaciones())*this.getMontoBase()) +
                this.getPorcentajeDeGanaciaDespegar()+this.getRetencionDelGobierno())
    }

    private double precioTotalDeLasHabitaciones(){
        double total = 0;
        for(Habitacion hab: habitaciones){
            total += hab.adicionalMasPrecio();
        }
    }

    public void agregarHabitacion(Habitacion hab){
        habitaciones.add(hab);
    }


}
