public class Viajero {

    private String nombre;
    private String apellido;
    private String tipo;

    public void Viajero (String nombreViajero, String apellidoViajero, String tipoViajero) {
        this.nombre = nombreViajero;
        this.apellido = apellidoViajero;
        this.tipo = tipoViajero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
