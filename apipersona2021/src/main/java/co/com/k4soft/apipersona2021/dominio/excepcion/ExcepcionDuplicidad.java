package co.com.k4soft.apipersona2021.dominio.excepcion;
public class ExcepcionDuplicidad extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionDuplicidad(String mensaje) {
        super(mensaje);
    }
}
