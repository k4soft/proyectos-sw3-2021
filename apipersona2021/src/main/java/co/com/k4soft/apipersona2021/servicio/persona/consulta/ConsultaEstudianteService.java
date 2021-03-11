package co.com.k4soft.apipersona2021.servicio.persona.consulta;

import co.com.k4soft.apipersona2021.model.Estudiante;

public interface ConsultaEstudianteService {

	Iterable<Estudiante> findAll();

	Estudiante findById(Integer idPersona);

}
