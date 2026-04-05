import java.util.*;

// Abstract Class
abstract class Event {
    private String title;
    private Date date;

    public Event(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() { return title; }
    public Date getDate() { return date; }

    public abstract void displayDetails();
}

// Child Class 1
class Meeting extends Event {
    private List<String> participants;

    public Meeting(String title, Date date, List<String> participants) {
        super(title, date);
        this.participants = participants;
    }

    @Override
    public void displayDetails() {
        System.out.println("Meeting: " + getTitle() + " on " + getDate());
        System.out.println("Participants: " + participants);
    }
}

// Child Class 2
class Reminder extends Event {
    private String note;

    public Reminder(String title, Date date, String note) {
        super(title, date);
        this.note = note;
    }

    @Override
    public void displayDetails() {
        System.out.println("Reminder: " + getTitle() + " on " + getDate());
        System.out.println("Note: " + note);
    }
}

// Calendar Class
class CalendarSystem {
    private List<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }
        events.add(event);
    }

    public void showEvents() {
        for (Event e : events) {
            e.displayDetails(); // Polymorphism
            System.out.println("-------------------");
        }
    }
}

// User Class
class User {
    private String name;
    private CalendarSystem calendar;

    public User(String name) {
        this.name = name;
        this.calendar = new CalendarSystem();
    }

    public CalendarSystem getCalendar() {
        return calendar;
    }
}

// Extra Feature: Scheduler Service
class SchedulerService {
    public static boolean isConflict(Event e1, Event e2) {
        return e1.getDate().equals(e2.getDate());
    }
}

// Main Class (Test Cases)
public class Main {
    public static void main(String[] args) {
        User user = new User("Dhana");

        CalendarSystem calendar = user.getCalendar();

        Event meeting = new Meeting(
                "Project Meeting",
                new Date(),
                Arrays.asList("Alice", "Bob")
        );

        Event reminder = new Reminder(
                "Doctor Appointment",
                new Date(),
                "Bring reports"
        );

        // Add events
        calendar.addEvent(meeting);
        calendar.addEvent(reminder);

        // Show events
        calendar.showEvents();

        // Test conflict
        boolean conflict = SchedulerService.isConflict(meeting, reminder);
        System.out.println("Conflict: " + conflict);
    }
}
