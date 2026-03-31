import java.util.*;

interface RemoteControl {
    void change();
}
interface wifiControl {
    void connect();
}
class TV implements RemoteControl,wifiControl {
    @Override
    public void change()
    {
        System.out.println("Changing channel");
    }
    @Override
    public void connect()
    {
        System.out.println("Connecting to wifi");
    }
}
public class Multiple_Inheritence {
    public static void main(String[] args)
    {
        TV t=new TV();
        t.change();
        t.connect();
    }
    
}
