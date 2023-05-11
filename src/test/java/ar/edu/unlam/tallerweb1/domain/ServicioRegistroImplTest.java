package ar.edu.unlam.tallerweb1.domain;

import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistro;
import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistroImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;


public class ServicioRegistroImplTest {

    private final String MAIL_CORRECTO = "jaimito@gmail.com";
    private final String MAIL_INCORRECTO = "jaimito@";
    private final String USERNAME_INCORRECTO = "eljaimito1995";
    private final String USERNAME_CORRECTO = "jaimito95";

    private ServicioRegistro servicioRegistro = new ServicioRegistroImpl();

    @Test
    public void queUnMailInvalidoDevuelvaFalse(){

        dadoQueIngresoUnMailIncorrecto();
        Boolean resultado = cuandoIntentoRegistrarmeConUnMailIncorrecto(MAIL_INCORRECTO);
        entoncesElMailEsInvalido(resultado);
    }

    @Test
    public void queUnMailValidoDevuelvaTrue(){
        dadoQueIngresoUnMailIncorrecto();
        Boolean resultado = cuandoIntentoRegistrarmeConUnMailCorrecto(MAIL_CORRECTO);
        entoncesElMailEsValido(resultado);
    }

    @Test
    public void queUnUsernameConMasDe10CaracteresDevuelvaFalse(){
        dadoQueIngresoUnUsernameIncorrecto();
        Boolean resultado = cuandoIntentoRegistrarmeConUnUsernameIncorrecto(USERNAME_INCORRECTO);
        entoncesElUsernameEsIncorrecto(resultado);
    }

    @Test
    public void queUnUsernameConMenosIgualA10CaracteresDevuelvaTrue(){
        dadoQueIngresoUnUsernameCorrecto();
        Boolean resultado = cuandoIntentoRegistrarmeConUnUsernameCorrecto(USERNAME_CORRECTO);
        entoncesElUsernameEsCorrecto(resultado);
    }

    private void entoncesElUsernameEsCorrecto(Boolean resultado) {
        assertThat(resultado).isTrue();
    }

    private Boolean cuandoIntentoRegistrarmeConUnUsernameCorrecto(String USERNAME_CORRECTO) {
        return this.servicioRegistro.nroCaracteresUsername(USERNAME_CORRECTO);
    }

    private void dadoQueIngresoUnUsernameCorrecto() {
    }

    private void entoncesElUsernameEsIncorrecto(Boolean resultado) {
        assertThat(resultado).isFalse();
    }

    private Boolean cuandoIntentoRegistrarmeConUnUsernameIncorrecto(String USERNAME_INCORRECTO) {
        return this.servicioRegistro.nroCaracteresUsername(USERNAME_INCORRECTO);
    }

    private void dadoQueIngresoUnUsernameIncorrecto() {
    }

    private void entoncesElMailEsValido(Boolean resultado) {
        assertThat(resultado).isTrue();
    }

    private Boolean cuandoIntentoRegistrarmeConUnMailCorrecto(String MAIL_CORRECTO) {
        return this.servicioRegistro.correoValido(MAIL_CORRECTO);
    }


    private void entoncesElMailEsInvalido(Boolean resultado) {
        assertThat(resultado).isFalse();
    }

    private Boolean cuandoIntentoRegistrarmeConUnMailIncorrecto(String MAIL_INCORRECTO) {
        return this.servicioRegistro.correoValido(MAIL_INCORRECTO);
    }

    private void dadoQueIngresoUnMailIncorrecto() {
    }
}
