package ar.edu.unlam.tallerweb1.delivery;

public class DatosRegistracion {
    private String usuario;
    private String correo;
    private String clave;
    private String nombre;
    private String apellido;
    private String telefono;
    private String ubicacion;

    public DatosRegistracion(String usuario, String correo, String clave, String nombre, String apellido, String telefono, String ubicacion) {
        this.usuario = usuario;
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    public DatosRegistracion() {

    }
}
