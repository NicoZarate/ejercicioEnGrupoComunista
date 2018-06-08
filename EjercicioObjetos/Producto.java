package EjercicioObjetos;

import java.util.ArrayList;

public class Producto {



    private ArrayList<Viajero> viajeros;
    private Preveedor proveedor;
    private Double porcentajeDeGanaciaDespegar;
    private Double retencionDelGobierno;
    private Double montoBase;

    public ArrayList<Viajero> getViajeros() {
        return viajeros;
    }

    public void setViajeros(ArrayList<Viajero> viajeros) {
        this.viajeros = viajeros;
    }
    public Double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(Double montoBase) {
        this.montoBase = montoBase;
    }


    public Double getRetencionDelGobierno() {
        return retencionDelGobierno;
    }

    public void setRetencionDelGobierno(Double retencionDelGobierno) {
        this.retencionDelGobierno = retencionDelGobierno;
    }

    public Double getPorcentajeDeGanaciaDespegar() {
        return porcentajeDeGanaciaDespegar;
    }

    public void setPorcentajeDeGanaciaDespegar(Double porcentajeDeGanaciaDespegar) {
        this.porcentajeDeGanaciaDespegar = porcentajeDeGanaciaDespegar;
    }


    public Preveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Preveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double gananciaDespegar(){
         return ((this.getMontoBase() * this.getPorcentajeDeGanaciaDespegar())/100) * this.getViajeros().size();
    }

    public double totalRetencionDelGobierno(){
        return ((this.getMontoBase() * this.getRetencionDelGobierno())/100)  * this.getViajeros().size();
    }
    public double montoTotal(){

    }


}
