package EjercicioObjetos;

public class Producto {

    private Viajero viajero;
    private Preveedor proveedor;
    private Double porcentajeDeGanaciaDespegar;
    private Double retencionDelGobierno;
    private Double montoBase;


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


    public Viajero getViajero() {
        return viajero;
    }

    public void setViajero(Viajero viajero) {
        this.viajero = viajero;
    }

    public Preveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Preveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double ganaciaDespegar(){}

    public double montoTotal(){}


}
