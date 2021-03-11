package co.com.k4soft.apipersona2021.dominio.excepcion;

public class ExcepcionSinDatos extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
    public ExcepcionSinDatos(String message) {
        super(message);
    }
}
