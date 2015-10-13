package text;

public class Parrafo extends Compuesto {
    
    @Override
    public void add(Componente componente) {
        if (componente.esCompuesto())
            throw new UnsupportedOperationException("Acción no permitida... ");
        this.getComponentes().add(componente);
    }

    @Override
    public void remove(Componente componente) {
        if (!componente.esCompuesto())
            this.getComponentes().remove(componente);
    }
    
    @Override
    public String dibujar(boolean mayusculas) {
        return super.dibujar(mayusculas)+"\n";        
    }
}
