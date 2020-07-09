package Strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("Addition "+context.executeStrategy(2,1));
        context=new Context(new OperationSubstract());
        System.out.println("Substract "+context.executeStrategy(2,1));


    }



}
