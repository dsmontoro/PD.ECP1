package factoryMethod.naturalNumber;

public class NaturalNumbersManager {
    private NaturalNumber naturalNumber;
    private NaturalNumberCreator naturalNumberCreator;
    
    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }
         
    public void createNaturalNumber(int value) {
        this.naturalNumber = naturalNumberCreator.createNaturalNumber(value);        
    }
    
    public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
        this.naturalNumberCreator = naturalNumberCreator;
    }
}
