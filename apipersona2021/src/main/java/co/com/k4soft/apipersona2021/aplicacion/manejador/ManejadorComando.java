package co.com.k4soft.apipersona2021.aplicacion.manejador;

import org.springframework.transaction.annotation.Transactional;

public interface ManejadorComando<C> {
	
	@Transactional
	void ejecutar(C comando);

}
