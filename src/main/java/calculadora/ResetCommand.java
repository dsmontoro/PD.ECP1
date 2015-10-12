package calculadora;

public class ResetCommand extends AbstractCommand {

    public ResetCommand(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public String name() {
        return "Resetear";
    }

    @Override
    public void execute() {
        calculator.reset();

    }

}
