package Observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject= new Subject();
        new HexaObserver(subject);
        new BinaryObserver(subject);
        System.out.println("New State : 1" );
        subject.setState(1);
        System.out.println("New State : 2" );
        subject.setState(2);
    }


}
