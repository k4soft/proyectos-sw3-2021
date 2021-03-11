package co.com.k4soft.apipersona2021.comando.controlador.estudiante;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.k4soft.apipersona2021.comando.dto.persona.EstudianteDTO;
import co.com.k4soft.apipersona2021.comando.manejador.estudiante.crear.ManejadorCrearEstudiante;



@RestController
@RequestMapping("/v1/estudiante")
public class ControladorComandoEstudiante {
	
	private ManejadorCrearEstudiante manejadorCrearEstudiante;
	
	
	@PostMapping
	public void insertar(@RequestBody EstudianteDTO estudianteDTO) {
		manejadorCrearEstudiante.ejecutar(estudianteDTO);
	}

}
