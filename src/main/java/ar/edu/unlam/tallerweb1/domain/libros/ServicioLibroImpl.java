package ar.edu.unlam.tallerweb1.domain.libros;

import ar.edu.unlam.tallerweb1.infrastructure.RepositorioLibro;
import ar.edu.unlam.tallerweb1.infrastructure.RepositorioLibroImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServicioLibroImpl implements ServicioLibro{
    private RepositorioLibro repositorioLibro;

    @Autowired
    public ServicioLibroImpl(RepositorioLibro repositorioLibro) {
        this.repositorioLibro = repositorioLibro;
    }

    @Override
    @Transactional
    public void agregar(Libro libro) {
        this.repositorioLibro.guardar(libro);
    }

    @Override
    public Boolean verificarISBN(String ISBN) {
        return ISBN.length()>=10 && ISBN.length()<=13;
    }

    @Override
    public List<Libro> obtenerLibrosPorUsuario(String usuario) {
        return this.repositorioLibro.obtenerLibrosPorUsuario(usuario);
    }

    @Override
    public List<Libro> obtenerLibros() {
        return this.repositorioLibro.obtenerLibros();
    }

}
