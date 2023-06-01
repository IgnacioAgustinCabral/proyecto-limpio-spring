package ar.edu.unlam.tallerweb1.infrastructure;

import ar.edu.unlam.tallerweb1.domain.libros.Libro;

public interface RepositorioLibro {

    void guardar(Libro libro);

    Libro buscarPorId(Long id);

    Libro buscarPorISBN(String isbn);

    void borrar(Libro libro);

    void modificar(Libro libro);
}
