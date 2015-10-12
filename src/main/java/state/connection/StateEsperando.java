package state.connection;

public class StateEsperando extends State {

    private static final Estado estado = Estado.ESPERANDO;
    
    @Override
    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void enviar(String msg, Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(int respuesta, Conexion conexion) {
        if (respuesta == 0)
            conexion.setState(new StatePreparado());
        else if (respuesta > 0)
            conexion.setState(new StateCerrado());
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

}
