import java.util.ArrayList;

public class Alphabetizer implements Observer{

    public void triggerEvent(ArrayList<String> lines) {
        System.out.println("triggering alphabatizer");
    }
}
