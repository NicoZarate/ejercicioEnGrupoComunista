public class Ticket extends Producto {

    private int cantidadDias;
    static final int LIMITE_MAXIMO_DIA = 10000;

    public void Ticket (double montoBase, Proveedor unProveedor, double porcentajeGanancia, double retencionGobierno , int cantDias) {

        super(montoBase, unProveedor, porcentajeGanancia, retencionGobierno); // llama al constructor del padre
        this.cantidadDias = cantDias;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public double adicionalPorPersona (Viajero unViajero){
        switch (unViajero.getTipo()) {
            case "INFANT": return 200;
            case "CHILD": return 900;
            case "ADULT": return 1000;
        }
    }

    public double montoTotal(){
        int totalViajeros = this.getCantidadViajeros();
        double subTotal = (this.getMontoBase() * totalViajeros) + this.gananciaDespegar() + this.totalRetencionDelGobierno());
        double totalAdicionales = 0;
        for (int i=0; i<totalViajeros; i++) {
            totalAdicionales += this.adicionalPorPersona(this.getViajeros()[i]);
        }



    }
}
