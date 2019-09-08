package progra.Sistema.Fifa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import progra.Sistema.Fifa.Model.Jugador;
import progra.Sistema.Fifa.Model.Jugadores;
import progra.Sistema.Fifa.Services.ManejoDato;

import java.util.ArrayList;

@Controller
@RequestMapping()
public class JugadoresController {

    @RequestMapping("/index")
    public String index(Model model) {
        ManejoDato md = new ManejoDato();
        Jugadores jugadores = new Jugadores(md.leerDatos("src/archivos/data.csv"));
        model.addAttribute("jugadores", jugadores.getJugadores());
        return "index";
    }


    public String listarJugadores(Model modelo) {
        // TODO - implement JugadoresController.listarJugadores
        throw new UnsupportedOperationException();
    }

    public String listarPorClub(String club, Model modelo) {
        // TODO - implement JugadoresController.listarPorClub
        throw new UnsupportedOperationException();
    }

    public String listarPorPotencial(int potencial, Model modelo) {
        // TODO - implement JugadoresController.listarPorPotencial
        throw new UnsupportedOperationException();
    }

    public String listarPorNacionalidad(String nacionalidad, Model modelo) {
        // TODO - implement JugadoresController.listarPorNacionalidad
        throw new UnsupportedOperationException();
    }

    public String listarPorRating(int rating, Model modelo) {
        // TODO - implement JugadoresController.listarPorRating
        throw new UnsupportedOperationException();
    }

    public void buscarNombre(String nombre, Model modelo) {
        // TODO - implement JugadoresController.buscarNombre
        throw new UnsupportedOperationException();
    }

}