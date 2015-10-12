package text;

public class Caracter extends Componente {

    private Character caracter;
    
    public Caracter(Character caracter) {
        this.caracter = caracter;
    }
    
    @Override
    public void add(Componente componente) {        
    }

    @Override
    public void remove(Componente componente) {        
    }

    @Override
    public boolean esCompuesto() {
        return false;
    }
    
    @Override
    public String dibujar(boolean mayusculas) {
        if (mayusculas)
            return caracter.toString().toUpperCase();
        else
            return caracter.toString();
    }

}
