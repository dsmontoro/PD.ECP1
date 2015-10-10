package calculadora;

public abstract class AbstractCommand implements Comando{
    protected Calculator calculator;
    public abstract void execute();
}
