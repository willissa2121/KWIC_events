import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Alphabetizer implements Observer{

    ArrayList<String> lines;

    ArrayList<String> sortedLines = new ArrayList<String>();

    public void alphabetize(){
        Collections.sort(lines, String.CASE_INSENSITIVE_ORDER);
        for(String line: lines){
            sortedLines.add(line);
        }
    }

    public void triggerEvent(ArrayList<String> lines) {
        this.lines = lines;
        alphabetize();
    }

    public void printLines(){
        for(String line: sortedLines){
            System.out.println(line);
        }
    }
}
