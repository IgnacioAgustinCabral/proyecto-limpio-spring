package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.libros.Libro;
import ar.edu.unlam.tallerweb1.domain.libros.ServicioLibro;
import ar.edu.unlam.tallerweb1.domain.libros.ServicioLibroImpl;
import ar.edu.unlam.tallerweb1.mappers.LibroMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ControladorLibroTest {

    /*private static final String NOMBRE = "El Señor de los Anillos: Las Dos Torres";
    private static final String AUTOR = "Tolkien";
    private static final String ISBN = "12455664";
    private static final String ISBN_ERRONEO = "1122334455667788";
    private static final String IDIOMA = "Español";
    private static final String EDITORIAL = "De Bolsillo";
    private static final String ESTADO = "Nuevo";
    private ControladorLibro controladorLibro;
    private DatosLibro datosLibro;
    private DatosLibro datosLibroErroneo;
    private ServicioLibro servicioLibro;
    private Libro libro;
    private Libro libroErroneo;

    @Before
    public void init() {
        this.datosLibro = new DatosLibro(NOMBRE,AUTOR,ISBN,IDIOMA,EDITORIAL,ESTADO);
        this.datosLibroErroneo = new DatosLibro(NOMBRE,AUTOR,ISBN_ERRONEO,IDIOMA,EDITORIAL,ESTADO);
        this.libro = LibroMapper.INSTANCE.datosLibroToLibro(datosLibro);
        this.libroErroneo = LibroMapper.INSTANCE.datosLibroToLibro(datosLibroErroneo);
        this.servicioLibro = mock(ServicioLibroImpl.class);
        this.controladorLibro = new ControladorLibro(this.servicioLibro);
    }

    @Test
    public void queAlIngresarAAgregarLibroMeMuestreLaVistaDeAgregarLibro(){
        dadoQueIngresoALaVistaDeAgregarLibro();
        ModelAndView mav = cuandoQuieroIngresarUnLibro();
        entoncesMeLlevaALaVistaDeAgregarLibro(mav);
    }

    private void entoncesMeLlevaALaVistaDeAgregarLibro(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("alta");
    }

    private ModelAndView cuandoQuieroIngresarUnLibro() {
        return this.controladorLibro.irAVistaAlta();
    }

    private void dadoQueIngresoALaVistaDeAgregarLibro() {

    }

    @Test
    public void queAlAgregarUnLibroElISBNEstenBienYMeDevuelvaALaVistaDeMiColeccionDeLibros(){
        dadoQueIngresoLosDatosDeUnLibro(this.libro,true);
        ModelAndView mav = cuandoIngresoLosDatosYLosGuardo();
        entoncesMeLlevaALaVistaDeMisLibros(mav);
    }

    private void entoncesMeLlevaALaVistaDeMisLibros(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("mis-libros");
    }

    private ModelAndView cuandoIngresoLosDatosYLosGuardo() {
        return this.controladorLibro.agregar(this.datosLibro);
    }

    private void dadoQueIngresoLosDatosDeUnLibro(Libro libro, Boolean retorno) {
        when(this.servicioLibro.verificarISBN(libro.getISBN())).thenReturn(retorno);
    }

    @Test
    public void queAlAgregarUnLibroConISBNErroneoMeDevuelvaALaVistaDeAltaLibro(){
        dadoQueIngresoLosDatosDeUnLibroErroneamente(this.libroErroneo,false);
        ModelAndView mav = cuandoIngresoLosDatosErroneosYTratoDeGuardarlos(datosLibroErroneo);
        entoncesMeDevuelveALaVistaDeAlta(mav);
    }

    private void entoncesMeDevuelveALaVistaDeAlta(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("alta");
    }

    private ModelAndView cuandoIngresoLosDatosErroneosYTratoDeGuardarlos(DatosLibro datosLibroErroneo) {
        return this.controladorLibro.agregar(datosLibroErroneo);
    }

    private void dadoQueIngresoLosDatosDeUnLibroErroneamente(Libro libroErroneo, Boolean retorno) {
        when(this.servicioLibro.verificarISBN(libroErroneo.getISBN())).thenReturn(retorno);
    }*/
}
