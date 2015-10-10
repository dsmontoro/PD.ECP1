package state.connection;

public class Conexion {
    private State state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.setState(new StateCerrado());
    }

    public Link getLink() {
        return link;
    }

    protected void setState(State state) {
        this.state = state;
    }
    
    public Estado getEstado() {
        return this.state.getEstado();
    }

    public void abrir() {
        state.abrir();
    }

    public void cerrar() {
        state.cerrar();
    }

    public void parar() {
        state.parar();
    }

    public void iniciar() {
        state.iniciar();
    }

    public void enviar(String msg) {
        state.enviar(msg);
    }

    public void recibir(int respuesta) {
        state.recibir(respuesta);
    }

}
