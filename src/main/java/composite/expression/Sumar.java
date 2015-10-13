package composite.expression;

public class Sumar extends Compuesto {

	public Sumar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}
	
	@Override
	public int operar() {
		return this.getExpresion1().operar() + this.getExpresion2().operar();
	}

	@Override
	public String toString() {
		return "("+this.getExpresion1().toString()+"+"+this.getExpresion2().toString()+")";
	}

}
