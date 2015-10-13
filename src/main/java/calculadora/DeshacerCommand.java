package calculadora;

import upm.jbb.IO;

public class DeshacerCommand extends AbstractCommand {

	private GestorMementos<MementoCalculadora> gestorMementos;
	
	public DeshacerCommand(Calculator calculator, GestorMementos<MementoCalculadora> gestorMementos) {
		super(calculator);
		this.gestorMementos = gestorMementos;
	}

	@Override
	public String name() {
		return "Deshacer";
	}

	@Override
	public void execute() {
		((CalculadoraMementable)this.getCalculator()).restoreMemento(gestorMementos.getMemento((String)IO.getIO().select(gestorMementos.keys(), "Restaurar: ")));
	}

}
