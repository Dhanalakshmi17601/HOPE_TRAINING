import java.util.*;

// 🔹 Abstract Class (Abstraction + Inheritance)
abstract class SmartDevice {
    String name;

    SmartDevice(String name) {
        this.name = name;
    }

    abstract void turnOn();
    abstract void turnOff();
}

// 🔹 Devices
class Light extends SmartDevice {

    Light() {
        super("Light");
    }

    void turnOn() {
        System.out.println(name + " is turned ON");
    }

    void turnOff() {
        System.out.println(name + " is turned OFF");
    }
}

class AC extends SmartDevice {

    AC() {
        super("AC");
    }

    void turnOn() {
        System.out.println(name + " is turned ON");
    }

    void turnOff() {
        System.out.println(name + " is turned OFF");
    }
}

// 🔹 Trigger Interface (Abstraction)
interface Trigger {
    boolean isTriggered();
}

// 🔹 Different Triggers

class MotionTrigger implements Trigger {
    boolean motion;

    MotionTrigger(boolean motion) {
        this.motion = motion;
    }

    public boolean isTriggered() {
        return motion;
    }
}

class TemperatureTrigger implements Trigger {
    int temp;

    TemperatureTrigger(int temp) {
        this.temp = temp;
    }

    public boolean isTriggered() {
        return temp > 30;
    }
}

class TimeTrigger implements Trigger {
    int time;

    TimeTrigger(int time) {
        this.time = time;
    }

    public boolean isTriggered() {
        return time == 19; // 7 PM
    }
}

// 🔹 Action Interface
interface Action {
    void execute();
}

// 🔹 Action Implementation (Polymorphism)
class TurnOnAction implements Action {
    SmartDevice device;

    TurnOnAction(SmartDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}

// 🔹 Rule Class (Combines Trigger + Action)
class Rule {
    Trigger trigger;
    Action action;

    Rule(Trigger trigger, Action action) {
        this.trigger = trigger;
        this.action = action;
    }

    void result() {
        if (trigger.isTriggered()) {
            action.execute();
        }
    }
}

// 🔹 Main Class
public class Smart_Home_Automation_System {

    public static void main(String[] args) {

        // Devices
        SmartDevice light = new Light();
        SmartDevice ac = new AC();

        // Triggers
        Trigger motion = new MotionTrigger(true);
        Trigger temp = new TemperatureTrigger(32);
        Trigger time = new TimeTrigger(19);

        // Actions
        Action lightOn = new TurnOnAction(light);
        Action acOn = new TurnOnAction(ac);

        // Rules
        Rule r1 = new Rule(motion, lightOn);
        Rule r2 = new Rule(temp, acOn);
        Rule r3 = new Rule(time, lightOn);

        // Execute
        r1.result();
        r2.result();
        r3.result();
    }
}