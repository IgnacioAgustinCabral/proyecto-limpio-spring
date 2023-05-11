package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ControladorRegistro {
    private ServicioRegistro servicioRegistro;

    @Autowired
    public ControladorRegistro(ServicioRegistro servicioRegistro) {
        this.servicioRegistro = servicioRegistro;
    }



    public ModelAndView irARegistro() {
        ModelMap model = new ModelMap();
        model.put("datosRegistro",new DatosRegistracion());
        return new ModelAndView("registro-usuario",model);
    }

    public ModelAndView registrar(DatosRegistracion datosRegistracion) {
        ModelMap model = new ModelMap();
        String vista = "";
        if(this.servicioRegistro.correoValido(datosRegistracion.getCorreo())){
            model.put("msg","Registrado exitosamente");
            vista="login";
        } else {
            model.put("msg","Error al registrarse, intente nuevamente");
            vista="registro-usuario";
        }
        return new ModelAndView(vista,model);
    }
}
