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
        state.abrir(this);
    }

    public void cerrar() {
        state.cerrar(this);
    }

    public void parar() {
        state.parar(this);
    }

    public void iniciar() {
        state.iniciar(this);
    }

    public void enviar(String msg) {
        link.enviar(msg);
        state.enviar(msg,this);
    }

    public void recibir(int respuesta) {
        state.recibir(respuesta,this);
    }

}
