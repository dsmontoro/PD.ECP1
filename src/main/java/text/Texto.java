package text;

public class Texto extends Compuesto {

    @Override
    public void add(Componente componente) {
        if (!componente.esCompuesto())
            throw new UnsupportedOperationException("Acción no permitida... ");
        componentes.add(componente);
        
    }

    @Override
    public void remove(Componente componente) {
        if (componente.esCompuesto())
            componentes.remove(componente);
    }

    @Override
    public String dibujar(boolean mayusculas) {
        return super.dibujar(mayusculas) + "---o---\n";
    }
    
}
