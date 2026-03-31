import java.util.*;

abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    void deviceInfo()
    {
        System.out.println("This is a smart device");
    }
}

class light extends SmartDevice {
    @Override
    void turnOn()
    {
        System.out.println("Light on");
    }
    @Override
    void turnOff()
    {
        System.out.println("Light off");
    }
}

public class Abstraction {
    public static void main(String[] args)
    {
        SmartDevice  s=new light();
        s.turnOn();
        s.turnOff();
    }
    
    
}
