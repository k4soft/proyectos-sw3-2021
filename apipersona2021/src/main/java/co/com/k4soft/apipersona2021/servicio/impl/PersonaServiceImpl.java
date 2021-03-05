package co.com.k4soft.apipersona2021.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.k4soft.apipersona2021.model.Persona;
import co.com.k4soft.apipersona2021.repository.PersonaRepository;
import co.com.k4soft.apipersona2021.servicio.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {
	
//	@Autowired
//	private PersonaRepository personaRepository;

	@Override
	public List<Persona> findAll() {
		return null;
	}

	@Override
	public Persona findById(Integer idPersona) {
		return null;
	}

}
