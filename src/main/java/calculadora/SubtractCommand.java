package calculadora;

import upm.jbb.IO;

public class SubtractCommand extends AbstractCommand{

    public SubtractCommand(Calculator calculator) {
        super(calculator);
    }
    
    @Override
    public String name() {
        return "Restar";
    }

    @Override
    public void execute() {
        this.getCalculator().subtract(IO.getIO().readInt());
    }

}
