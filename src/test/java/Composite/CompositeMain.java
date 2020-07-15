package Composite;

public class CompositeMain {
    public static void main(String[] args) {
        Component ram= new Leaf("RAM",1000);
        Component hardDisk= new Leaf("HardDisk",500);
        Component cpu= new Leaf("CPU",3000);

        Composite motherboard= new Composite("Motherboard");
        motherboard.addLeaf(ram);
        motherboard.addLeaf(cpu);
        motherboard.showPrice();
        Composite cabinet= new Composite("Cabinet");
        cabinet.addLeaf(motherboard);
        cabinet.addLeaf(hardDisk);
        cabinet.showPrice();

    }

}
