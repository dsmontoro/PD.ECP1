package calculadora;

import upm.jbb.IO;

public class GuardarCommand extends AbstractCommand {

	private GestorMementos<MementoCalculadora> gestorMementos;
	
	public GuardarCommand(Calculator calculator, GestorMementos<MementoCalculadora> gestorMementos) {
		super(calculator);
		this.gestorMementos = gestorMementos;
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		gestorMementos.addMemento(IO.getIO().readString("Nombre punto de restauración: "), ((CalculadoraMementable)this.getCalculator()).createMemento());
	}

}
