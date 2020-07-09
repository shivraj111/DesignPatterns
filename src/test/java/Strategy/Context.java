package Strategy;

public class Context {

    private Strategy strategy;

    Context(Strategy s)
    {
        this.strategy=s;
    }

    public int executeStrategy(int a, int b)
    {
        return this.strategy.doOperation(a,b);
    }

}
