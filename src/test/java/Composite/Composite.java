package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    String name;
   List<Component> lstComponent= new ArrayList<>();

   public void addLeaf(Component component)
   {
       lstComponent.add(component);
   }
    Composite(String name)
    {
        this.name=name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);

        for(Component component: lstComponent)
        {
            component.showPrice();
        }
    }

}
