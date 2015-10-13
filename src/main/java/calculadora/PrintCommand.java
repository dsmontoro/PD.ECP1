package calculadora;

import upm.jbb.IO;

public class PrintCommand extends AbstractCommand {

    public PrintCommand(Calculator calculator) {
        super(calculator);
    }
    
    @Override
    public String name() {
        return "Imprimir";
    }

    @Override
    public void execute() {
        IO.getIO().println(this.getCalculator().getTotal());
    }

}
