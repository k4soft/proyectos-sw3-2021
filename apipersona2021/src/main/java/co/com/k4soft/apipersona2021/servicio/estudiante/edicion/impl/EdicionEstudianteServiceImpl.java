package co.com.k4soft.apipersona2021.servicio.estudiante.edicion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.k4soft.apipersona2021.model.Estudiante;
import co.com.k4soft.apipersona2021.repository.EstudianteRepository;
import co.com.k4soft.apipersona2021.servicio.estudiante.edicion.EdicionEstudianteService;

@Service
public class EdicionEstudianteServiceImpl implements EdicionEstudianteService {
	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public Integer ejecutar(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
		return estudiante.getIdEstudiante();
	}

}
