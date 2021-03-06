package co.com.k4soft.apipersona2021.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.k4soft.apipersona2021.model.Persona;


@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer>{

	

}
