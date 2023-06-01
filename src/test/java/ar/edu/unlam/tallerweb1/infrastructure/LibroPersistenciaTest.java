package ar.edu.unlam.tallerweb1.infrastructure;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.domain.libros.Libro;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;


public class LibroPersistenciaTest extends SpringTest {

    private static final String NOMBRE = "El Señor de los Anillos: Las Dos Torres";
    private static final String AUTOR = "Tolkien";
    private static final String ISBN = "1245-5664";
    private static final String IDIOMA = "Español";
    private static final String EDITORIAL = "De Bolsillo";
    private static final String ESTADO = "Nuevo";

    @Test
    @Transactional
    @Rollback
    public void queSePuedaGuardarUnLibro(){
        Libro libro = dadoQueExisteUnLibro();
        Long id = cuandoGuardoUnLibro(libro);
        entoncesSuIdNoEsNulo(id);
    }

    private void entoncesSuIdNoEsNulo(Long id) {
        assertThat(id).isNotNull();
    }

    private Long cuandoGuardoUnLibro(Libro libro) {
        //devuelve el id del libro
        return (Long)session().save(libro);

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
