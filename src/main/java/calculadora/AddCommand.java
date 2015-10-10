package calculadora;

import upm.jbb.IO;

public class AddCommand extends AbstractCommand {

    public AddCommand(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public String name() {
        return "Sumar";
    }

    @Override
    public void execute() {
        calculator.add(IO.getIO().readInt());        
    }


}
