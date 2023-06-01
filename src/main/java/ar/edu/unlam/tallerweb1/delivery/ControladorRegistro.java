package ar.edu.unlam.tallerweb1.delivery;

import ar.edu.unlam.tallerweb1.domain.usuarios.ServicioRegistro;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import ar.edu.unlam.tallerweb1.mappers.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorRegistro {
    private ServicioRegistro servicioRegistro;

    @Autowired
    public ControladorRegistro(ServicioRegistro servicioRegistro) {
        this.servicioRegistro = servicioRegistro;
    }


    @RequestMapping(path = "/registrar-usuario", method = RequestMethod.GET)
    public ModelAndView irARegistro() {
        ModelMap model = new ModelMap();
        model.put("datosRegistro", new DatosRegistracion());
        return new ModelAndView("registro-usuario", model);
    }

    @RequestMapping(path = "/registrarme", method = RequestMethod.POST)
    public ModelAndView registrar(@ModelAttribute("datosRegistro") DatosRegistracion datosRegistracion) {
        Usuario usuario = UsuarioMapper.INSTANCE.datosRegistracionToUsuario(datosRegistracion);
        System.out.println(usuario);
        System.out.println(datosRegistracion);
        ModelMap model = new ModelMap();
        String vista = "";
        if (this.servicioRegistro.correoValido(datosRegistracion.getCorreo()) && this.servicioRegistro.nroCaracteresUsername(datosRegistracion.getUsuario()) && this.servicioRegistro.passwordIguales(datosRegistracion.getClave(), datosRegistracion.getClave_rep())) {
            System.out.println("IF");
            model.put("msg", "Registrado exitosamente");
            vista = "redirect:/login";
            this.servicioRegistro.guardarUsuario(usuario);
        } else {
            System.out.println("ELSE");
            model.put("error", "Error al registrarse, intente nuevamente");
            vista = "registro-usuario";
        }
        return new ModelAndView(vista, model);
    }
}
