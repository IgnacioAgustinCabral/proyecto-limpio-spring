package ar.edu.unlam.tallerweb1.domain.usuarios;
public interface ServicioRegistro {

    Boolean correoValido(String correo);

    Boolean nroCaracteresUsername(String usuario);
}
