package co.com.k4soft.apipersona2021.aplicacion.manejador;

import org.springframework.transaction.annotation.Transactional;

public interface  ManejadorComandoRespuesta <C, R> {

	@Transactional
	R ejecutar(C comando);
}
