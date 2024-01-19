import java.util.ArrayList;

public class CircularShifter implements Observer {

    LineStorageWrapper sh;
    ArrayList<String> shifts = new ArrayList<String>();
    ArrayList<String> lines = new ArrayList<String>();

    public CircularShifter(LineStorageWrapper shifts) {
        this.sh = shifts;
        this.shifts = shifts.lines;
    }

    public void initiateShift() {
        for (String line : lines) {
            String[] arrOfStr = line.split(" ");
            shift(arrOfStr, arrOfStr.length);
        }
        sh.setChanged("ADD EVENT");
    }

    public void shift(String[] arrOfStr, int shift) {
        if (shift > 0) {
            String[] newArr = new String[arrOfStr.length];
            for (int i = 0; i < arrOfStr.length; i++) {
                if (i == arrOfStr.length - 1) {
                    newArr[0] = arrOfStr[i];
                } else {
                    newArr[i + 1] = arrOfStr[i];
                }
            }
            String circulatedString = String.join(" ", newArr);
            shifts.add(circulatedString);
            shift(newArr, shift -= 1);
        }
    }

    public void triggerEvent(ArrayList<String> lines, String eventType) {
        if (eventType.equals("ADD EVENT")) {
            this.lines = lines;
            initiateShift();
        }
    }

    public void printShifts() {
        for (String shift : shifts) {
            System.out.println(shift);
        }
    }

}
