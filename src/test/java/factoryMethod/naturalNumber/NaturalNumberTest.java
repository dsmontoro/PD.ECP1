package factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {
    
    private NaturalNumbersManager naturalNumbersManager;
    private NaturalNumberCreator Español,Ingles,Frances;
    
    @Before
    public void ini() {
        this.naturalNumbersManager = new NaturalNumbersManager();
        this.Español = new NaturalNumberEsCreator();
        this.Ingles = new NaturalNumberEnCreator();
        this.Frances = new NaturalNumberFrCreator();        
    }
    
    @Test
    public void testNaturalNumberEs() {
        this.naturalNumbersManager.setNaturalNumberCreator(Español);
        this.naturalNumbersManager.createNaturalNumber(1);
        assertEquals("uno", this.naturalNumbersManager.getNaturalNumber().getTextValue());
        this.naturalNumbersManager.getNaturalNumber().add(3);
        assertEquals("cuatro", this.naturalNumbersManager.getNaturalNumber().getTextValue());
        this.naturalNumbersManager.getNaturalNumber().add(2);
        assertEquals("???", this.naturalNumbersManager.getNaturalNumber().getTextValue());
    }
    
    @Test
    public void testNaturalNumberEn() {
        this.naturalNumbersManager.setNaturalNumberCreator(Ingles);
        this.naturalNumbersManager.createNaturalNumber(1);
        assertEquals("one", this.naturalNumbersManager.getNaturalNumber().getTextValue());
        this.naturalNumbersManager.getNaturalNumber().add(3);
        assertEquals("four", this.naturalNumbersManager.getNaturalNumber().getTextValue());
        this.naturalNumbersManager.getNaturalNumber().add(2);
        assertEquals("???", this.naturalNumbersManager.getNaturalNumber().getTextValue());
    }
    
    @Test
    public void testNaturalNumberFr() {
        this.naturalNumbersManager.setNaturalNumberCreator(Frances);
        this.naturalNumbersManager.createNaturalNumber(1);
        assertEquals("un", this.naturalNumbersManager.getNaturalNumber().getTextValue());
        this.naturalNumbersManager.getNaturalNumber().add(3);
        assertEquals("quatre", this.naturalNumbersManager.getNaturalNumber().getTextValue());
        this.naturalNumbersManager.getNaturalNumber().add(2);
        assertEquals("???", this.naturalNumbersManager.getNaturalNumber().getTextValue());
    }
}
