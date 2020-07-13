package Observer;

public class HexaObserver implements Observer{
    Subject subject;
    @Override
    public void update() {

        System.out.println("HexaObserver state "+ this.subject.getState());
    }
    HexaObserver(Subject subject)
    {
        this.subject=subject;
        this.subject.attach(this);
    }


}
