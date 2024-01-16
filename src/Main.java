import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        LineStorageWrapper lines = new LineStorageWrapper();
        LineStorageWrapper shifts = new LineStorageWrapper();

        CircularShifter shifter = new CircularShifter(shifts.lines);
        lines.addObserver(shifter);





        Input input = new Input("/src/input.txt", lines);

        shifter.printShifts();
    }

}