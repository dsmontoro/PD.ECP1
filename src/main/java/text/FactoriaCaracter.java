package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    
    private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter();
    
    private Map<Character,Caracter> map = new HashMap<Character,Caracter>();
    
    public static FactoriaCaracter getFactoria() {
        return factoriaCaracter;
    }
    
    public Caracter get(char key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            // Construcción perezosa
            Caracter c = new Caracter(key);
            map.put(key, c);
            return c;
        }
    }
           
}
