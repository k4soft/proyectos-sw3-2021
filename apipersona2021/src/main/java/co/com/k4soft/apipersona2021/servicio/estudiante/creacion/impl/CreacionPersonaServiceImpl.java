package co.com.k4soft.apipersona2021.servicio.estudiante.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.k4soft.apipersona2021.model.Estudiante;
import co.com.k4soft.apipersona2021.repository.EstudianteRepository;
import co.com.k4soft.apipersona2021.servicio.estudiante.creacion.CreacionEstudianteService;


@Service
public class CreacionPersonaServiceImpl implements CreacionEstudianteService {
	
	@Autowired
	private EstudianteRepository personaRepository;

	@Override
	public Integer ejecutar(Estudiante estudiante){
		personaRepository.save(estudiante);
		return estudiante.getIdEstudiante();
	}

}
