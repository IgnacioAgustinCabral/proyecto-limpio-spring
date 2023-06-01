package ar.edu.unlam.tallerweb1.domain.usuarios;

import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistro;
import ar.edu.unlam.tallerweb1.infrastructure.RepositorioLibroImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicioRegistroImpl implements ServicioRegistro {
    private RepositorioUsuario repositorioUsuario;

    @Autowired
    public ServicioRegistroImpl(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @Override
    public Boolean correoValido(String correo) {
        return correo.endsWith(".com") && correo.contains("@");
    }

    @Override
    public Boolean nroCaracteresUsername(String usuario) {
        return usuario.length() <= 10;
    }

    @Override
    public Boolean passwordIguales(String clave, String claveRep) {
        return clave.equals(claveRep);
    }

    @Override
    @Transactional
    public void guardarUsuario(Usuario usuario) {
        this.repositorioUsuario.guardar(usuario);
    }
}
