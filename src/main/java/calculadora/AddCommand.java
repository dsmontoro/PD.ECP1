package calculadora;

import upm.jbb.IO;

public class AddCommand extends AbstractCommand {

    public AddCommand(Calculator calculator) {
        super(calculator);
    }
    
    @Override
    public String name() {
        return "Sumar";
    }

    @Override
    public void execute() {
        this.getCalculator().add(IO.getIO().readInt());        
    }


}
