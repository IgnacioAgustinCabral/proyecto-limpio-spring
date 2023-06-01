package ar.edu.unlam.tallerweb1.domain.usuarios;
public interface ServicioRegistro {

    Boolean correoValido(String correo);

    Boolean nroCaracteresUsername(String usuario);

    Boolean passwordIguales(String clave, String claveRep);

    void guardarUsuario(Usuario usuario);
}
