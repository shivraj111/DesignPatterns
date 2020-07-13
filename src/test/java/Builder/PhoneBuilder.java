package Builder;

public class PhoneBuilder {
    String OS;
    String processor;
    int cameras;

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setCameras(int cameras) {
        this.cameras = cameras;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone(OS,processor,cameras);
    }




}
