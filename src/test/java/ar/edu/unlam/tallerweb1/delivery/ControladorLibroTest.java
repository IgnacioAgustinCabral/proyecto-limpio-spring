package ar.edu.unlam.tallerweb1.delivery;


import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.*;

public class ControladorLibroTest {

    private static final String NOMBRE = "El Señor de los Anillos: Las Dos Torres";
    private static final String AUTOR = "Tolkien";
    private static final String ISBN = "1245-5664";
    private static final String IDIOMA = "Español";
    private static final String EDITORIAL = "De Bolsillo";
    private static final String ESTADO = "Nuevo";
    private ControladorLibro controladorLibro;
    private DatosLibro datosLibro;

    @Before
    public void init() {
        this.controladorLibro = new ControladorLibro();
        this.datosLibro = new DatosLibro(NOMBRE,AUTOR,ISBN,IDIOMA,EDITORIAL,ESTADO);
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
        return this.controladorLibro.alta();
    }

    private void dadoQueIngresoALaVistaDeAgregarLibro() {

    }
}
