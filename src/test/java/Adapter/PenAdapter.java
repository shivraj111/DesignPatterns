package Adapter;

public class PenAdapter implements Pen {
    PilotPen pilotpen= new PilotPen();

    @Override
    public void write(String str) {
        pilotpen.mark(str);
    }
}
