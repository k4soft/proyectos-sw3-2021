package co.com.k4soft.apipersona2021.comando.converter.estudiante;

import org.springframework.stereotype.Component;

import co.com.k4soft.apipersona2021.comando.dto.estudiante.EstudianteDTO;
import co.com.k4soft.apipersona2021.dominio.ValidadorArgumento;
import co.com.k4soft.apipersona2021.model.Estudiante;

@Component
public class EstudianteConverter {
	
	
	private static final String EL_NOMBRE_DEL_ESTUDDIANTE_ES_OBLIGATORIO = "El nombre del estudiante es obligatorio";

	public Estudiante crear(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_NOMBRE_DEL_ESTUDDIANTE_ES_OBLIGATORIO);
		estudiante.setNombres(estudianteDTO.getNombres());
		return estudiante;
	}
	
	

}
