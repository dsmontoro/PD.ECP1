package calculadora;

import upm.jbb.IO;

public class MainCalculatorConDeshacer {

    private CommandManager commandManager;

    public MainCalculatorConDeshacer() {
        CalculadoraMementable calculator = new CalculadoraMementable();
        GestorMementos<MementoCalculadora> gestorMementos = new GestorMementos<MementoCalculadora>();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new GuardarCommand(calculator,gestorMementos));
        this.commandManager.add(new DeshacerCommand(calculator,gestorMementos));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculatorConDeshacer());
    }

}
