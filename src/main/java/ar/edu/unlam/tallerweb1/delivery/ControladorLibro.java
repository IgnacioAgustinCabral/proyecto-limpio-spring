package ar.edu.unlam.tallerweb1.delivery;

//import ar.edu.unlam.tallerweb1.domain.ServicioLibro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorLibro {
//    private ServicioLibro servicioLibro;
//    @Autowired
//    public ControladorLibro(ServicioLibro servicioLibro) {
//        this.servicioLibro = servicioLibro;
//    }

//    public Long crearLibro(DatosLibro datosLibro){
//        Libro libro = LibroMapper.INSTANCE.datosLibroToLibro(datosLibro);
//        return this.servicioLibro.agregar(libro);
//    }

    @RequestMapping(path = "/alta",method = RequestMethod.GET)
    public ModelAndView alta() {
        ModelMap model = new ModelMap();
        model.put("datosLibro",new DatosLibro());
        return new ModelAndView("alta",model);
    }
}
