package ar.edu.unlam.tallerweb1.domain.libros;

public interface ServicioLibro {

    void agregar(Libro libro);

    Boolean verificarISBN(String ISBN);
}
