package co.com.k4soft.apipersona2021.repository;

import java.util.List;

import co.com.k4soft.apipersona2021.model.Persona;

public interface PersonaRepository {

	List<Persona> findAll();

	Persona findById(Integer idPersona);

}
