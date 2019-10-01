package progra.Sistema.Fifa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import progra.Sistema.Fifa.Controller.RegistrosController;
import progra.Sistema.Fifa.Model.Jugador;
import progra.Sistema.Fifa.Model.Jugadores;
import progra.Sistema.Fifa.Model.ListaJugador;
import progra.Sistema.Fifa.Services.ManejoDato;

import java.util.ArrayList;

@SpringBootApplication
@ComponentScan(basePackageClasses = RegistrosController.class)
public class SistemaFifaApplication {


    //para ver la web colocar url localhost:8080/index
    public static void main(String[] args) {
        SpringApplication.run(SistemaFifaApplication.class, args);
    }
}
