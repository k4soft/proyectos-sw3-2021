package co.com.k4soft.apipersona2021.servicio.tipodocumento.consulta;

import co.com.k4soft.apipersona2021.model.TipoDocumento;

public interface ConsultaTipoDocumentoService {

	Iterable<TipoDocumento> findAll();

}
