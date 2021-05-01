package co.com.k4soft.apipersona2021.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.k4soft.apipersona2021.model.seguridad.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    
	Usuario findByNombreUsuario(String nombreUsuario);
}
