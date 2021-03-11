package co.com.k4soft.apipersona2021.dominio.excepcion;

public class ExcepcionDeProceso extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionDeProceso(String mensaje) {
        super(mensaje);
    }

}
