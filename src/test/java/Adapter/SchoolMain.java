package Adapter;

public class SchoolMain {

    public static void main(String[] args) {
        Assignment assignment= new Assignment();
        Pen pen= new PenAdapter();
        assignment.setPen(pen);
        assignment.writeAssignment("I am bit tired");

    }
}
