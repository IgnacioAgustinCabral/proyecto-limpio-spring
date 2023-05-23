package ar.edu.unlam.tallerweb1.domain;

import ar.edu.unlam.tallerweb1.domain.libros.Libro;
import ar.edu.unlam.tallerweb1.domain.libros.ServicioLibro;
import ar.edu.unlam.tallerweb1.domain.libros.ServicioLibroImpl;
import ar.edu.unlam.tallerweb1.infrastructure.RepositorioLibro;
import ar.edu.unlam.tallerweb1.infrastructure.RepositorioLibroImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ServicioLibroImplTest {

//    private static final String NOMBRE = "El Señor de los Anillos: Las Dos Torres";
//    private static final String AUTOR = "Tolkien";
//    private static final String ISBN = "12455664";
//    private static final String ISBN_ERRONEO = "1122334455667788";
//    private static final String IDIOMA = "Español";
//    private static final String EDITORIAL = "De Bolsillo";
//    private static final String ESTADO = "Nuevo";
//    private Libro libro;
//    private ServicioLibro servicioLibro;
//    private RepositorioLibro repositorioLibro;
//
//    @Before
//    public void init() {
//        this.libro = new Libro();
//        this.libro.setNombre(NOMBRE);
//        this.libro.setAutor(AUTOR);
//        this.libro.setEditorial(EDITORIAL);
//        this.libro.setISBN(ISBN);
//        this.libro.setIdioma(IDIOMA);
//        this.libro.setEstado(ESTADO);
//        this.repositorioLibro = mock(RepositorioLibroImpl.class);
//        this.servicioLibro = new ServicioLibroImpl(this.repositorioLibro);
//    }
//
//    @Test
//    @Transactional
//    @Rollback
//    public void queUnLibroSePuedaGuardarEnLaBaseDeDatos() {
//        dadoQueQuieroGuardarUnLibro(this.libro);
//        Long id = cuandoGuardoElLibro(this.libro);
//        System.out.println("AAAAAAAAAAA" + id);
//        entoncesLoPuedoBuscarPorSuId(id);
//    }
//
//    private void entoncesLoPuedoBuscarPorSuId(Long id) {
//        assertThat(id).isEqualTo(this.repositorioLibro.buscarPorId(id));
//    }
//
//    private Long cuandoGuardoElLibro(Libro libro) {
//        return this.servicioLibro.agregar(libro);
//    }
//
//    private void dadoQueQuieroGuardarUnLibro(Libro libro) {
//        when(this.repositorioLibro.guardar(libro)).thenReturn(1L);
//
//    }
}
