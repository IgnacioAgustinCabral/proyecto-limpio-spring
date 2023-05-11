package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistro;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistroImpl;
import org.springframework.web.servlet.ModelAndView;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ControladorRegistroTest {

    private static final String CORREO = "jaimito@gmail.com";
    private static final String CORREO_INCORRECTO = "jaimito@gmail";
    private static final String CLAVE = "asd123";
    private static final String USUARIO = "jaimito99";
    private static final String NOMBRE = "Jaimito";
    private static final String APELLIDO = "Perez";
    private static final String TELEFONO = "1122334455";
    private static final String UBICACION = "La Matanza";
    private DatosRegistracion datosRegistracion;
    private ControladorRegistro controladorRegistro;
    private ServicioRegistro servicioRegistro;
    private DatosRegistracion datosRegistracionIncorrectos;

    @Before
    public void init() {
        this.datosRegistracion = new DatosRegistracion(USUARIO, CORREO, CLAVE, NOMBRE, APELLIDO, TELEFONO, UBICACION);
        this.datosRegistracionIncorrectos = new DatosRegistracion(USUARIO, CORREO_INCORRECTO, CLAVE, NOMBRE, APELLIDO, TELEFONO, UBICACION);
        this.servicioRegistro = mock(ServicioRegistroImpl.class);
        this.controladorRegistro = new ControladorRegistro(this.servicioRegistro);
    }

    @Test
    public void queAlIngresarAlRegistroMeMuestreLaVistaDeRegistro() {
        dadoQueNoExisteUnUsuario(this.datosRegistracion,true);
        ModelAndView mav = cuandoMeQuieroRegistrar();
        entoncesMeLlevaALaVistaDeRegistro(mav);
    }
    @Test
    public void queAlRegistrarmeExitosamenteMeLleveALaVistaLogin(){
        dadoQueNoExisteUnUsuario(this.datosRegistracion,false);
        ModelAndView mav = cuandoMeRegistro();
        entoncesMeLlevaALaVistaDeLogin(mav);
    }

    @Test
    public void queAlRegistrarmeFallidamentePorMailIncorrectoMeDevuelvaALaVistaDeRegistro(){
        dadoQueNoExisteUnUsuario(this.datosRegistracion,false);
        ModelAndView mav = cuandoMeRegistro();
        entoncesMeLlevaALaVistaDeRegistro(mav);
    }

    private void entoncesMeLlevaALaVistaDeLogin(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("login");
    }

    private ModelAndView cuandoMeRegistro() {
        return this.controladorRegistro.registrar(this.datosRegistracion);
    }

    private void dadoQueNoExisteUnUsuario(DatosRegistracion datosRegistracion,Boolean retorno) {
        when(this.servicioRegistro.correoValido(this.datosRegistracion.getCorreo())).thenReturn(retorno);
    }

    private void entoncesMeLlevaALaVistaDeRegistro(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("registro-usuario");
    }

    private ModelAndView cuandoMeQuieroRegistrar() {
        return controladorRegistro.irARegistro();
    }

    private void dadoQueExisteUnUsuario() {
    }
}
