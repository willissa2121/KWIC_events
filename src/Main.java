import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void execute(){
        LineStorageWrapper lines = new LineStorageWrapper();
        LineStorageWrapper shifts = new LineStorageWrapper();

        CircularShifter shifter = new CircularShifter(shifts);
        lines.addObserver(shifter);

        Alphabetizer alphabetizer = new Alphabetizer();
        shifts.addObserver(alphabetizer);

        Output output = new Output(shifts.lines);
        Input input = new Input("/src/input.txt", lines);
        output.print();
    }

    public static void main(String[] args) {
        execute();
    }
}