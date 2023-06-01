package ar.edu.unlam.tallerweb1.delivery;

public class DatosRegistracion {
    private String usuario;
    private String correo;
    private String clave;
    private String clave_rep;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave_rep() {
        return clave_rep;
    }

    public void setClave_rep(String clave_rep) {
        this.clave_rep = clave_rep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "DatosRegistracion{" +
                "usuario='" + usuario + '\'' +
                ", correo='" + correo + '\'' +
                ", clave='" + clave + '\'' +
                ", clave_rep='" + clave_rep + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
