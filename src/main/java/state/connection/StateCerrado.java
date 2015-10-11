package state.connection;

public class StateCerrado extends State {

	private Estado estado = Estado.CERRADO;
	
	@Override
	public void abrir(Conexion conexion) {
	    conexion.setState(new StatePreparado());
	}

	@Override
	public void cerrar(Conexion conexion) {
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
	    throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estado getEstado() {
		return estado;
	}

}
