package ar.edu.unlam.tallerweb1.delivery;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.*;


public class ControladorRegistroTest {

    private static final String CORREO = "ignacio@gmail.com";
    private static final String CLAVE = "asd123";
    private static final String USUARIO = "jaimito99";
    private static final String NOMBRE = "Jaimito";
    private static final String APELLIDO = "Perez";
    private static final String TELEFONO = "1122334455";
    private static final String UBICACION = "La Matanza";
    private DatosRegistracion datosRegistracion;
    private ControladorRegistro controladorRegistro;

    @Before
    public void init() {
        this.datosRegistracion = new DatosRegistracion(USUARIO, CORREO, CLAVE, NOMBRE, APELLIDO, TELEFONO, UBICACION);
        this.controladorRegistro = new ControladorRegistro();
    }

    @Test
    public void queAlIngresarAlRegistroMeMuestreLaVistaDeRegistro() {
        dadoQueNoExisteUnUsuario();
        ModelAndView mav = cuandoMeQuieroRegistrar();
        entoncesMeLlevaALaVistaDeRegistro(mav);
    }
    @Test
    public void queAlRegistrarmeExitosamenteMeLleveALaVistaLogin(){
        dadoQueNoExisteUnUsuario();
        ModelAndView mav = cuandoMeRegistro();
        entoncesMeLlevaALaVistaDeLogin();
    }

    private void entoncesMeLlevaALaVistaDeLogin() {
    }

    private ModelAndView cuandoMeRegistro() {
        return this.controladorRegistro.registrar();
    }

    private void dadoQueNoExisteUnUsuario() {
    }

    private void entoncesMeLlevaALaVistaDeRegistro(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("usuario-registro");
    }

    private ModelAndView cuandoMeQuieroRegistrar() {
        return controladorRegistro.irARegistro();
    }

    private void dadoQueExisteUnUsuario() {
    }
}
