package co.com.k4soft.apipersona2021.model.seguridad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name ="roles")
@Data
public class Rol {
	@Id
	private int idRol;
	@Column(unique = true, length = 20)
	private String nombreRol;
}
