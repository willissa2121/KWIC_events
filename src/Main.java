import java.io.IOException;
public class Main {

    public static void execute() throws IOException {
        LineStorageWrapper lines = new LineStorageWrapper();
        LineStorageWrapper shifts = new LineStorageWrapper();

        CircularShifter shifter = new CircularShifter(shifts);
        lines.addObserver(shifter);

        Alphabetizer alphabetizer = new Alphabetizer();
        shifts.addObserver(alphabetizer);

        Output output = new Output(shifts.lines);
        new Input("/src/input.txt", lines);
        output.print();
    }

    public static void main(String[] args) throws IOException {
        execute();
    }
}