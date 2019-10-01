package progra.Sistema.Fifa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import progra.Sistema.Fifa.Model.Jugadores;
import progra.Sistema.Fifa.Services.ManejoDato;

import java.applet.Applet;

@Controller
@RequestMapping()
public class RegistrosController {

    @RequestMapping("/index")
    public String index(Model model) {
        ManejoDato md = new ManejoDato();
        RegistroController rController = new RegistroController();
        model.addAttribute("registros", rController.registrosPorHora(md.leerArchivo("src/archivos/Historial_Abril_2019.csv")));
        return "index";
    }

    @RequestMapping()
        public String principal(Model model){
        return "PaginaContaminacion";
        }


}


