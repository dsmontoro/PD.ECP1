package calculadora;

public class ResetCommand extends AbstractCommand {

    public ResetCommand(Calculator calculator) {
        super(calculator);
    }
    
    @Override
    public String name() {
        return "Resetear";
    }

    @Override
    public void execute() {
        this.getCalculator().reset();
    }

}
