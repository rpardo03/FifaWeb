package progra.Sistema.Fifa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import progra.Sistema.Fifa.Controller.JugadorController;
import progra.Sistema.Fifa.Controller.JugadoresController;

@SpringBootApplication
@ComponentScan(basePackageClasses = JugadoresController.class)
public class SistemaFifaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFifaApplication.class, args);
	}

}
