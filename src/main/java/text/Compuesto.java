package text;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente {
    
    protected List<Componente> componentes = new ArrayList<Componente>();
        
    @Override
    public boolean esCompuesto() {
        return true;
    }

    @Override
    public String dibujar(boolean mayusculas) {
        String resultado = "";
        for (Componente componente : componentes) {
            resultado += componente.dibujar(mayusculas);
        }
        return resultado;
    }
    
}
