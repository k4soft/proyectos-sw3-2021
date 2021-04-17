package co.com.k4soft.apipersona2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="estudiante")
@Data
@NoArgsConstructor
public class Estudiante {
	@Id
	@GeneratedValue
	@Column(name="idestudiante")
	private Integer idEstudiante;
	@Column(name="numerodocumento")
	private String numeroDocumento;
	@ManyToOne
	@JoinColumn(name = "idtipodocumento")
	private TipoDocumento tipoDocumento;
	@ManyToOne
	@JoinColumn(name = "idinstitucioneducativa")
	private InstitucionEducativa institucionEducativa;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	
	// pasa de Lazy a Eager (Singleton)
	public TipoDocumento getTipoDocumento() {
		if(tipoDocumento == null) {
			tipoDocumento = new TipoDocumento();
		}
		return tipoDocumento;
	}

	public InstitucionEducativa getInstitucionEducativa() {
		if(institucionEducativa == null) {
			institucionEducativa = new InstitucionEducativa();
		}
		return institucionEducativa;
	}
	
	

}
