import java.util.*;

class Battery{
    public void powerSupply(){
        System.out.println("Battery is supplying power");
    }
}
class Remote{
    Battery b=new Battery();//has a relationship
    public void ChangeChannel()
    {
        b.powerSupply();
        System.out.println("Remote is changing channel");

    }
}

public class Relationship {
    public static void main(String[] args) {
        Remote r=new Remote();
        r.ChangeChannel();
    }
    
}
