package Factory;

public class OperatingSystemFactory {


    public OS getInstance(String str)
    {
        if(str.equals("IOS"))
            return new IOS();
        else
            return new Android();
    }


}
