package co.com.k4soft.apipersona2021.comando.dto.estudiante;

import lombok.Data;

@Data
public class EstudianteDTO {
	
	private Integer idTipoDocumento;
	private String numeroDocumento;
	private String nombres;  
	private String apellidos;
	private Integer idInstitucionEducativa;


}
