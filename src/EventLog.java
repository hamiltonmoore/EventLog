import java.util.ArrayList;
import java.util.List;

public class EventLog {    //static makes this class level and accessable

    private List<Event> eventList;

    public boolean addEvent(Event event) {

        if (event == null) {
            throw new IllegalArgumentException("Exception thrown");
        }
        if (event.equals("Face2Face")) {
            eventList.add(event);
        }
        if (event.equals("PhoneCall")) {
            eventList.add(event);
        }
        if (event.equals("TextMessaging")) {
            eventList.add(event);
        }
        if (event.equals("Unknown")) {

        } else {
            throw new IllegalArgumentException("action must be of type: Face2face, PhoneCall, TextMessaging or Unknown");
        }

        eventList.add(event);
        System.out.println("this is the event being added: " + event);
        return true;
    }

    public int getNumEvent(List<Event> eventList) {
        int listSize = eventList.size();
        System.out.println("this is the event being added:" + eventList); //this needs to print event added to list
        return listSize;
    }

    //constructor initializes this class - doesn't need parameters
    public EventLog() {
        this.eventList = new ArrayList<>();

    }

}

