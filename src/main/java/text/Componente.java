package text;

public abstract class Componente {
    public abstract void add(Componente componente);
    public abstract void remove(Componente componente);
    public abstract boolean esCompuesto();   
    public abstract String dibujar(boolean mayusculas);

}
