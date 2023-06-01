package ar.edu.unlam.tallerweb1.delivery;


import ar.edu.unlam.tallerweb1.domain.libros.Libro;
import ar.edu.unlam.tallerweb1.domain.libros.ServicioLibro;
import ar.edu.unlam.tallerweb1.mappers.LibroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorLibro {
    private ServicioLibro servicioLibro;
    @Autowired
    public ControladorLibro(ServicioLibro servicioLibro) {
        this.servicioLibro = servicioLibro;
    }

//    public Long crearLibro(DatosLibro datosLibro){
//        Libro libro = LibroMapper.INSTANCE.datosLibroToLibro(datosLibro);
//        return this.servicioLibro.agregar(libro);
//    }

    @RequestMapping(path = "/alta",method = RequestMethod.GET)
    public ModelAndView irAVistaAlta() {
        ModelMap model = new ModelMap();
        model.put("datosLibro",new DatosLibro());
        return new ModelAndView("alta",model);
    }

    @RequestMapping(path = "/agregar",method = RequestMethod.POST)
    public ModelAndView agregar(@ModelAttribute("datosLibro") DatosLibro datosLibro) {
        //mapeo de DTO a Entidad
        Libro libro = LibroMapper.INSTANCE.datosLibroToLibro(datosLibro);
        ModelMap model = new ModelMap();
        String vista = "";
        if(this.servicioLibro.verificarISBN(libro.getISBN())){
            model.put("msg","Exito al agregar libro");
            vista = "alta";
            this.servicioLibro.agregar(libro);
        } else {
            model.put("error","Fallo al agregar libro, intentelo nuevamente");
            vista = "alta";
        }
        return new ModelAndView(vista,model);
    }
}
