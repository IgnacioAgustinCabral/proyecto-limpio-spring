package ar.edu.unlam.tallerweb1.domain.usuarios;

import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistro;
import org.springframework.stereotype.Service;

@Service
public class ServicioRegistroImpl implements ServicioRegistro {
    @Override
    public Boolean correoValido(String correo) {
        return correo.endsWith(".com") && correo.contains("@");
    }

    @Override
    public Boolean nroCaracteresUsername(String usuario) {
        return usuario.length() <= 10;
    }
}
