package co.com.k4soft.apipersona2021.consulta.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.k4soft.apipersona2021.model.Estudiante;
import co.com.k4soft.apipersona2021.servicio.persona.consulta.ConsultaEstudianteService;

@RestController
@RequestMapping("/v1/estudiante")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
public class ControladorConsultaEstudiante {
	
	@Autowired
	private ConsultaEstudianteService estudianteService;
	
	@GetMapping
	Iterable<Estudiante> findAll(){
		return estudianteService.findAll();
	}
	
	@GetMapping("/{idEstudiante}")
	Estudiante findById(@PathVariable("idEstudiante") Integer idEstudiante){
		return estudianteService.findById(idEstudiante);
	}

}


