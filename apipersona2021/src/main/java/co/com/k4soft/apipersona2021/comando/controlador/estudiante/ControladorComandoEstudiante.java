package co.com.k4soft.apipersona2021.comando.controlador.estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.k4soft.apipersona2021.comando.dto.estudiante.EstudianteDTO;
import co.com.k4soft.apipersona2021.comando.manejador.estudiante.crear.ManejadorCrearEstudiante;
import co.com.k4soft.apipersona2021.comando.manejador.estudiante.editar.ManejadorEditarEstudiante;



@RestController
@RequestMapping("/v1/estudiante")
public class ControladorComandoEstudiante {
	
	@Autowired
	private ManejadorCrearEstudiante manejadorCrearEstudiante;
	
	@Autowired
	private ManejadorEditarEstudiante manejadorEditarEstudiante;
	
	@Secured({"ROLE_ADMIN"})
	@PostMapping
	public void insertar(@RequestBody EstudianteDTO estudianteDTO) {
		manejadorCrearEstudiante.ejecutar(estudianteDTO);
	}
	
	@Secured({"ROLE_ADMIN"})
	@PutMapping("/{idEstudiante}")
	public void editar(@RequestBody EstudianteDTO estudianteDTO, @PathVariable Integer idEstudiante) {
		estudianteDTO.setIdEstudiante(idEstudiante);
		manejadorEditarEstudiante.ejecutar(estudianteDTO);
	}

}
