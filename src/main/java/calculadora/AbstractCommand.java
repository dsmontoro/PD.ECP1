package calculadora;

public abstract class AbstractCommand implements Comando{
    private Calculator calculator;
    
    public AbstractCommand(Calculator calculator) {
    	this.calculator = calculator;
    }
    
    public Calculator getCalculator() {
    	return calculator;
    }
    
    public abstract void execute();
}
