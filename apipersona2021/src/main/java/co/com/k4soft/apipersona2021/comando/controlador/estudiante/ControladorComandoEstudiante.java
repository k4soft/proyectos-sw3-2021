package co.com.k4soft.apipersona2021.comando.controlador.estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.k4soft.apipersona2021.comando.dto.estudiante.EstudianteDTO;
import co.com.k4soft.apipersona2021.comando.manejador.estudiante.crear.ManejadorCrearEstudiante;



@RestController
@RequestMapping("/v1/estudiante")
@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
public class ControladorComandoEstudiante {
	
	@Autowired
	private ManejadorCrearEstudiante manejadorCrearEstudiante;
	
	
	@PostMapping
	public void insertar(@RequestBody EstudianteDTO estudianteDTO) {
		manejadorCrearEstudiante.ejecutar(estudianteDTO);
	}

}
