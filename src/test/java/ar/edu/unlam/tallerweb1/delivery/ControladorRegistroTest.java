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
    private static final String USUARIO = "jaimito";
    private static final String USUARIO_11_CARACTERES = "eljaimito1995";
    private static final String NOMBRE = "Jaimito";
    private static final String APELLIDO = "Perez";
    private static final String TELEFONO = "1122334455";
    private static final String UBICACION = "La Matanza";
    private DatosRegistracion datosRegistracion;
    private ControladorRegistro controladorRegistro;
    private ServicioRegistro servicioRegistro;
    private DatosRegistracion datosRegistracionIncorrectos;
    private DatosRegistracion datosRegistracionUsername11Caracteres;

    @Before
    public void init() {
        this.datosRegistracion = new DatosRegistracion(USUARIO, CORREO, CLAVE, NOMBRE, APELLIDO, TELEFONO, UBICACION);
        this.datosRegistracionIncorrectos = new DatosRegistracion(USUARIO, CORREO_INCORRECTO, CLAVE, NOMBRE, APELLIDO, TELEFONO, UBICACION);
        this.datosRegistracionUsername11Caracteres = new DatosRegistracion(USUARIO_11_CARACTERES, CORREO_INCORRECTO, CLAVE, NOMBRE, APELLIDO, TELEFONO, UBICACION);
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
        dadoQueIngresoCredencialesValidas(this.datosRegistracion,true,true);
        ModelAndView mav = cuandoMeRegistroCorrectamente();
        entoncesMeLlevaALaVistaDeLogin(mav);
    }

    @Test
    public void queAlRegistrarmeFallidamentePorMailIncorrectoMeDevuelvaALaVistaDeRegistro(){
        dadoQueIngresoCredencialesInvalidas(this.datosRegistracionUsername11Caracteres,true,false);
        ModelAndView mav = cuandoMeRegistroIncorrectamente();
        entoncesMeLlevaALaVistaDeRegistro(mav);
    }

    @Test
    public void queAlPonerUnUsernameConMasDe10CaracteresMeDevuelvaALaVistaDeRegistro(){
        dadoQueUsernameConMasDe10Caracteres(this.datosRegistracionUsername11Caracteres,true,false);
        ModelAndView mav = cuandoMeRegistroConUsernameConMasDe10Caracteres();
        entoncesMeLlevaALaVistaDeRegistro(mav);
    }

    private ModelAndView cuandoMeRegistroConUsernameConMasDe10Caracteres() {
        return this.controladorRegistro.registrar(this.datosRegistracionUsername11Caracteres);
    }

    private void dadoQueUsernameConMasDe10Caracteres(DatosRegistracion datosRegistracion, Boolean retornoMail,Boolean retornoUsername) {
        when(this.servicioRegistro.correoValido(this.datosRegistracionUsername11Caracteres.getCorreo())).thenReturn(retornoMail);
        when(this.servicioRegistro.nroCaracteresUsername(this.datosRegistracionUsername11Caracteres.getUsuario())).thenReturn(retornoUsername);
    }

    private void entoncesMeLlevaALaVistaDeLogin(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("login");
    }

    private ModelAndView cuandoMeRegistroCorrectamente() {
        return this.controladorRegistro.registrar(this.datosRegistracion);
    }
    private ModelAndView cuandoMeRegistroIncorrectamente() {
        return this.controladorRegistro.registrar(this.datosRegistracionUsername11Caracteres);
    }

    private void dadoQueNoExisteUnUsuario(DatosRegistracion datosRegistracion,Boolean retorno) {
        when(this.servicioRegistro.correoValido(this.datosRegistracion.getCorreo())).thenReturn(retorno);
    }

    private void dadoQueIngresoCredencialesValidas(DatosRegistracion datosRegistracion,Boolean retornoMail,Boolean retornoUsername) {
        when(this.servicioRegistro.correoValido(this.datosRegistracion.getCorreo())).thenReturn(retornoMail);
        when(this.servicioRegistro.nroCaracteresUsername(this.datosRegistracion.getUsuario())).thenReturn(retornoUsername);
    }
    private void dadoQueIngresoCredencialesInvalidas(DatosRegistracion datosRegistracion,Boolean retornoMail,Boolean retornoUsername) {
        when(this.servicioRegistro.correoValido(this.datosRegistracionUsername11Caracteres.getCorreo())).thenReturn(retornoMail);
        when(this.servicioRegistro.nroCaracteresUsername(this.datosRegistracionUsername11Caracteres.getUsuario())).thenReturn(retornoUsername);
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
