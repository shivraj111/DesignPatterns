package Observer;

public class BinaryObserver implements Observer{

    Subject subject;
    @Override
    public void update() {
        System.out.println("BinaryObserver state "+ this.subject.getState());
    }
    BinaryObserver(Subject subject)
    {
        this.subject=subject;
        this.subject.attach(this);
    }

}
