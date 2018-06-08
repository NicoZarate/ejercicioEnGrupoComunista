package ejercicio2;

import java.util.ArrayList;

public class Producto extends Proveedor{



    private ArrayList<Viajero> viajeros;
    private Proveedor proveedor;
    private Double porcentajeDeGanaciaDespegar;
    private Double retencionDelGobierno;
    private Double montoBase;
    private String descripcion;

    public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

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


    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
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
