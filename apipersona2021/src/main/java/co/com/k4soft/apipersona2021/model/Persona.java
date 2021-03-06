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
@Table(name="persona")
@Data
@NoArgsConstructor
public class Persona {
	@Id
	@GeneratedValue
	@Column(name="idpersona")
	private Integer idPersona;
	@ManyToOne
	@JoinColumn(name = "idtipodocumento")
	private TipoDocumento tipoDocumento;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;

}
