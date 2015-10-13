package composite.expression;

public class Restar extends Compuesto {

	public Restar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}
	
	@Override
	public int operar() {
		return this.getExpresion1().operar() - this.getExpresion2().operar();
	}

	@Override
	public String toString() {
		return "("+this.getExpresion1().toString()+"-"+this.getExpresion2().toString()+")";
	}

}
