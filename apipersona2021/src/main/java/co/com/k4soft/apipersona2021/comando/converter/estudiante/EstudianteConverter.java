package co.com.k4soft.apipersona2021.comando.converter.estudiante;

import org.springframework.stereotype.Component;

import co.com.k4soft.apipersona2021.comando.dto.estudiante.EstudianteDTO;
import co.com.k4soft.apipersona2021.dominio.ValidadorArgumento;
import co.com.k4soft.apipersona2021.model.Estudiante;
import co.com.k4soft.apipersona2021.model.TipoDocumento;

@Component
public class EstudianteConverter {
	

	private static final String EL_ID_ESTUDIANTE_ES_OBLIGATORIO = "El id estudiante es obligatorio";
	private static final String EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO = "El tipo de documento es obligatorio";
	private static final String EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO = "El nombre del estudiante es obligatorio";
	private static final String EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO = "El número  de documento es obligatorio";
	private static final String EL_APELLIDO_ESTUDIANTE_ES_OBLIGATORIO = "El apellido es oblugatorio";
	private static final String ID_INSTITUCION_EDUCATIVA_OBLIGATORIO = "El id de la institución eductativa es obligatorio";

	public Estudiante crear(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdTipoDocumento(), EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNumeroDocumento(), EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getApellidos(), EL_APELLIDO_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdInstitucionEducativa(),ID_INSTITUCION_EDUCATIVA_OBLIGATORIO);
		estudiante.getTipoDocumento().setIdTipoDocumento(estudianteDTO.getIdTipoDocumento());
		estudiante.setNombres(estudianteDTO.getNombres());
		estudiante.setApellidos(estudianteDTO.getApellidos());
		estudiante.setNumeroDocumento(estudianteDTO.getNumeroDocumento());
		estudiante.getInstitucionEducativa().setIdInstitucionEducativa(estudianteDTO.getIdInstitucionEducativa());
		return estudiante;
	}
	
	public Estudiante editar(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdEstudiante(), EL_ID_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdTipoDocumento(), EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getApellidos(), EL_APELLIDO_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNumeroDocumento(), EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdInstitucionEducativa(),ID_INSTITUCION_EDUCATIVA_OBLIGATORIO);
		estudiante.setIdEstudiante(estudianteDTO.getIdEstudiante());
		estudiante.getTipoDocumento().setIdTipoDocumento(estudianteDTO.getIdTipoDocumento());
		estudiante.setNombres(estudianteDTO.getNombres());
		estudiante.setApellidos(estudianteDTO.getApellidos());
		estudiante.setNumeroDocumento(estudianteDTO.getNumeroDocumento());
		estudiante.getInstitucionEducativa().setIdInstitucionEducativa(estudianteDTO.getIdInstitucionEducativa());
		return estudiante;
	}
	
	public Estudiante borrar(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdTipoDocumento(), EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO);
		estudiante.setIdEstudiante(estudianteDTO.getIdTipoDocumento());
		return estudiante;
	}
	
	
	

}
