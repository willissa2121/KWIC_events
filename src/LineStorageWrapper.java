import java.util.ArrayList;

public class LineStorageWrapper implements Observable {

    ArrayList<String> lines = new ArrayList<String>();
    ArrayList<Observer> observers = new ArrayList<Observer>();

    public LineStorageWrapper() {

    }

    public void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public void printLines() {
        for (String i : lines)
            System.out.println(i);
    }

    public void setChanged(String eventType) {
        for (Observer o : observers) {
            o.triggerEvent(lines, eventType);
        }
    }
}
