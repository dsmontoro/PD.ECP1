package calculadora;

import upm.jbb.IO;

public class SubtractCommand extends AbstractCommand{

    public SubtractCommand(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public String name() {
        return "Restar";
    }

    @Override
    public void execute() {
        calculator.subtract(IO.getIO().readInt());
    }

}
