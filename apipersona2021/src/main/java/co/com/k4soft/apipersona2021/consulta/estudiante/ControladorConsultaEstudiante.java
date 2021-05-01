package co.com.k4soft.apipersona2021.consulta.estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.k4soft.apipersona2021.model.Estudiante;
import co.com.k4soft.apipersona2021.servicio.estudiante.consulta.ConsultaEstudianteService;

@RestController
@RequestMapping("/v1/estudiante")
public class ControladorConsultaEstudiante {
	
	@Autowired
	private ConsultaEstudianteService estudianteService;
	
	@Secured({"ROLE_ADMIN","ROLE_CONSULTA"})
	@GetMapping
	Iterable<Estudiante> findAll(){
		return estudianteService.findAll();
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/{idEstudiante}")
	Estudiante findById(@PathVariable("idEstudiante") Integer idEstudiante){
		return estudianteService.findById(idEstudiante);
	}

}


