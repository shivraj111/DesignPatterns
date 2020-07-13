package Factory;

public class FactoryMain {

    public static void main(String[] args) {
        OperatingSystemFactory osf= new OperatingSystemFactory();
        OS obj= osf.getInstance("IOS");
       obj.name();
        obj= osf.getInstance("ANDROID");
        obj.name();

    }
}
