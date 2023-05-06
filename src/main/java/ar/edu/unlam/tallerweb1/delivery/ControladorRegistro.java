package ar.edu.unlam.tallerweb1.delivery;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class ControladorRegistro {

    public ModelAndView irARegistro() {
        ModelMap model = new ModelMap();
        model.put("datosRegistro",new DatosRegistracion());
        return new ModelAndView("usuario-registro",model);
    }
}
