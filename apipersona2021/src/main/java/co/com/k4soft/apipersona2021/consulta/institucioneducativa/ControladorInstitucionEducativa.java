package co.com.k4soft.apipersona2021.consulta.institucioneducativa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.k4soft.apipersona2021.model.InstitucionEducativa;
import co.com.k4soft.apipersona2021.servicio.instituacioneducativa.consulta.InstitucionEducativaService;

@RestController
@RequestMapping("/v1/instituciones-educativas")
public class ControladorInstitucionEducativa {
	
	@Autowired
	private InstitucionEducativaService institucionEducativaService;
	
	@GetMapping
	Iterable<InstitucionEducativa> findAll(){
		return institucionEducativaService.findAll();
	}
	
	

}
