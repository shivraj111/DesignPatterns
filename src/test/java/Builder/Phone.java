package Builder;

public class Phone {
    String OS;
    String processor;
    int cameras;

 Phone(String OS,String processor,int cameras){

     this.OS=OS;
     this.processor=processor;
     this.cameras=cameras;
 }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", processor='" + processor + '\'' +
                ", cameras=" + cameras +
                '}';
    }
}
