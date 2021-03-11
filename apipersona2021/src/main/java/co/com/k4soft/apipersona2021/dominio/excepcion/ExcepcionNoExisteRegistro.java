package co.com.k4soft.apipersona2021.dominio.excepcion;

public class ExcepcionNoExisteRegistro extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionNoExisteRegistro(String mensaje) {
        super(mensaje);
    }
}
