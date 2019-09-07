package progra.Sistema.Fifa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import progra.Sistema.Fifa.Controller.JugadorController;
import progra.Sistema.Fifa.Controller.JugadoresController;
import progra.Sistema.Fifa.Model.Jugador;
import progra.Sistema.Fifa.Model.Jugadores;
import progra.Sistema.Fifa.Services.ManejoDato;

import java.util.ArrayList;

@SpringBootApplication
@ComponentScan(basePackageClasses = JugadoresController.class)
public class SistemaFifaApplication {


	//para ver la web colocar url localhost:8080/index
	public static void main(String[] args) {
		ManejoDato md = new ManejoDato();
		Jugadores jugadores = new Jugadores(md.leerDatos("src/archivos/data.csv"));
		for (int i=0;i<jugadores.getJugadores().size();i++){
			System.out.println(jugadores.getJugadores().get(i).toString());
		}
		SpringApplication.run(SistemaFifaApplication.class, args);
	}
}
