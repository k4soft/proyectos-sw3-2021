package co.com.k4soft.apipersona2021.servicio.persona.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.k4soft.apipersona2021.model.Estudiante;
import co.com.k4soft.apipersona2021.repository.EstudianteRepository;
import co.com.k4soft.apipersona2021.servicio.persona.consulta.ConsultaEstudianteService;

@Service
public class ConsultaPersonaServiceImpl implements ConsultaEstudianteService {
	
	@Autowired
	private EstudianteRepository personaRepository;

	@Override
	public Iterable<Estudiante> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public Estudiante findById(Integer idPersona) {
		return personaRepository.findById(idPersona).orElse(null);
	}

}
