package ejercicio2;

public class Vuelo extends Producto{
	private String aerolinea;
	private String origen;
	private String destino;
	
	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void Vuelo(String aerolinea, String origen, String destino, String descripcion, Double monto) {
		this.setAerolinea(aerolinea);
		this.setOrigen(origen);
		this.setDestino(destino);
		super.setMontoBase(monto);
		super.setDescripcion(descripcion);
	}
	
	public double coeficiente(String tipo) {
		switch (tipo) {
			case "INFANT": return (0.2);
			case "CHILD": return (0.5);
			case "ADULT": return (1);
		}
		return 1;
	}
	
	public int cantidad_viajeros() {
		return this.getViajeros().size();
	}
	
	public double montoTotal() {
		Double total=0.0;
		for (Viajero viajero: this.getViajeros()) {
			total += (this.getMonto()*this.coeficiente(viajero.getTipo)*(this.getPorcentajeDeGananciaDespegar()+1)+this.totalRetencionDelGobierno());
		}
		return total;
	}
	
	private double descuento() {
		if (this.getDestino()=="ORL") {
			return 0.8;
		}
		return 1;
	}
}
