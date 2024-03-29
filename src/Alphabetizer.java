import java.util.ArrayList;
import java.util.Collections;

public class Alphabetizer implements Observer {

    ArrayList<String> lines;

    ArrayList<String> sortedLines = new ArrayList<String>();

    public void alphabetize() {
        Collections.sort(lines);
        sortedLines.addAll(lines);
    }

    public void triggerEvent(ArrayList<String> lines, String eventType) {
        if (eventType.equals("ADD EVENT")) {
            this.lines = lines;
            alphabetize();
        }
    }

    public void printLines() {
        for (String line : sortedLines) {
            System.out.println(line);
        }
    }
}
