package co.com.k4soft.apipersona2021.consulta.service;

import java.util.List;

import co.com.k4soft.apipersona2021.model.Persona;

public interface PersonaService {

	List<Persona> findAll();

	Persona findById(Integer idPersona);

}
