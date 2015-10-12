package state.connection;

public class StatePreparado extends State {

    private static final Estado estado = Estado.PREPARADO;
    
    @Override
    public void abrir(Conexion conexion) {
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setState(new StateCerrado());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(new StateParado());
    }

    @Override
    public void iniciar(Conexion conexion) {
    }

    @Override
    public void enviar(String msg, Conexion conexion) {
        conexion.setState(new StateEsperando());
    }

    @Override
    public void recibir(int respuesta, Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

}
