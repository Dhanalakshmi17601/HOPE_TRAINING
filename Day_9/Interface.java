import java.util.*;

interface RemoteControl {
    void change();
}
class TV implements RemoteControl {
    @Override
    public void change()
    {
        System.out.println("Changing channel");
    }
}

public class Interface {
    public static void main(String[] args)
    {
        RemoteControl r=new TV();
        r.change();
    }
    
    
}
