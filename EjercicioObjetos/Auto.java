package ejercicio2;

import java.util.List;

public class Auto extends Producto {
    private int dias;
    private String categoria;
    private List<Adicional> adicionales;




    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }



    public int getDias() {
        return dias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void agregarAdicional(Adicional adic) {

    adicionales.add(adic);


    }



    public Auto(int dias, String categoria, List<Adicional> adicionales){
        this.dias = dias;
        this.categoria = categoria;
        this.adicionales = adicionales;
    }
}
