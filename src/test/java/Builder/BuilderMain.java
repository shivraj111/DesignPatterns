package Builder;

public class BuilderMain {

    public static void main(String[] args) {
        PhoneBuilder builder= new PhoneBuilder();

        Phone phone=builder.setOS("Android").setCameras(1).setProcessor("Octa").getPhone();
        System.out.println(phone);
    }

}
