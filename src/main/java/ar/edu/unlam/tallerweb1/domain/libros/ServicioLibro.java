package ar.edu.unlam.tallerweb1.domain.libros;

import java.util.List;

public interface ServicioLibro {

    void agregar(Libro libro);

    Boolean verificarISBN(String ISBN);

    List<Libro> obtenerLibrosPorUsuario(String usuario);

    List<Libro> obtenerLibros();
}
