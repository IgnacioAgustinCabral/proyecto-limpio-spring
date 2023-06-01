package ar.edu.unlam.tallerweb1.infrastructure;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.libros.Libro;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

public class RepositorioLibroTest extends SpringTest {

    private static final String NOMBRE = "El Señor de los Anillos: Las Dos Torres";
    private static final String AUTOR = "Tolkien";
    private static final String ISBN = "1245-5664";
    private static final String IDIOMA = "Español";
    private static final String EDITORIAL = "De Bolsillo";
    private static final String ESTADO = "Nuevo";
    private static final String EDITORIAL_MODIFICADA = "Penguin Books";

    @Autowired
    private RepositorioLibroImpl repositorioLibro;

    @Test
    @Transactional
    @Rollback
    public void guardarUnLibroDeberiaPersistirlo(){
        Libro libro = dadoQueExisteUnLibro();
        Long id = cuandoGuardoUnLibro(libro);
        entoncesLoPuedoBuscarPorSuId(id);
    }

    @Test
    @Transactional
    @Rollback
    public void sePuedeBuscarUnLibroPorSuIsbnUnico(){
        Libro libro = dadoQueYaHayUnLibroGuardado();
        Libro libroBuscado = cuandoBuscoUnLibroPorISBN(libro.getISBN());
        entoncesLoEncuentroPorSuISBN(libroBuscado,libro.getISBN());
    }

    @Test
    @Transactional
    @Rollback
    public void sePuedeBorrarUnLibro(){
        Libro libro = dadoQueYaHayUnLibroGuardado();
        cuandoBorroUnLibro(libro);
        entoncesElLibroFueBorrado(libro);
    }

    @Test
    @Transactional
    @Rollback
    public void sePuedeModificarLaEditorialDeUnLibro(){
        Libro libro = dadoQueYaHayUnLibroGuardado();
        Libro libroModificado = cuandoModificoLaEditorialUnLibro(libro);
        entoncesLaEditorialDelLibroFueModificado(libroModificado);
    }

    private void entoncesLaEditorialDelLibroFueModificado(Libro libroModificado) {
        assertThat(libroModificado.getEditorial()).isEqualTo(EDITORIAL_MODIFICADA);
    }

    private Libro cuandoModificoLaEditorialUnLibro(Libro libro) {
        libro.setEditorial(EDITORIAL_MODIFICADA);
        this.repositorioLibro.modificar(libro);
        return libro;
    }

    private void entoncesElLibroFueBorrado(Libro libro) {
        assertThat(this.repositorioLibro.buscarPorId(libro.getId())).isNull();
    }

    private void cuandoBorroUnLibro(Libro libro) {
        this.repositorioLibro.borrar(libro);
    }

    private void entoncesLoEncuentroPorSuISBN(Libro libroBuscado, String isbn) {
        assertThat(libroBuscado.getISBN()).isEqualTo(isbn);
    }

    private Libro cuandoBuscoUnLibroPorISBN(String isbn) {
        return this.repositorioLibro.buscarPorISBN(isbn);
    }

    private Libro dadoQueYaHayUnLibroGuardado() {
        Libro libro = new Libro();
        libro.setNombre(NOMBRE);
        libro.setAutor(AUTOR);
        libro.setISBN(ISBN);
        libro.setIdioma(IDIOMA);
        libro.setEditorial(EDITORIAL);
        libro.setEstado(ESTADO);
        this.repositorioLibro.guardar(libro);
        return libro;
    }

    private void entoncesLoPuedoBuscarPorSuId(Long id) {
        Libro libroABuscar = repositorioLibro.buscarPorId(id);
        assertThat(libroABuscar).isNotNull();
        assertThat(libroABuscar.getId()).isEqualTo(id);
    }

    private Long cuandoGuardoUnLibro(Libro libro) {
        repositorioLibro.guardar(libro);
        return libro.getId();
    }

    private Libro dadoQueExisteUnLibro() {
        Libro libro = new Libro();
        libro.setNombre(NOMBRE);
        libro.setAutor(AUTOR);
        libro.setISBN(ISBN);
        libro.setIdioma(IDIOMA);
        libro.setEditorial(EDITORIAL);
        libro.setEstado(ESTADO);
        return libro;
    }
}
