package calculadora;

import upm.jbb.IO;

public class PrintCommand extends AbstractCommand {

    public PrintCommand(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public String name() {
        return "Imprimir";
    }

    @Override
    public void execute() {
        IO.getIO().println(calculator.getTotal());
    }

}
