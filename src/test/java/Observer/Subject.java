package Observer;

import java.util.ArrayList;

public class Subject {
    ArrayList<Observer> lstobserver= new ArrayList<Observer>();
    int state;

    public void setState(int a)
    {
        this.state=a;
this.notifyAllObserver();

    }

    public void attach(Observer observer)
    {
        lstobserver.add(observer);
    }
    public int getState()
    {
        return  this.state;
    }

    public void notifyAllObserver()
    {
        for(Observer observer: lstobserver)
        {
            observer.update();
        }

    }

}
