import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.text.Collator;
public class Alphabetizer implements Observer{

    ArrayList<String> lines;

    ArrayList<String> sortedLines = new ArrayList<String>();

    public void alphabetize(){
        // Performing case sensitive string comparisons
        Collator collator = Collator.getInstance();
        Collections.sort(lines, collator);
        sortedLines.addAll(lines);
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
