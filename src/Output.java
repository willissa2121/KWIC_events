import java.util.ArrayList;

public class Output {

    ArrayList<String> lines;

    public Output(ArrayList lines){
        this.lines = lines;
    }

    public void print(){
        for (String line: lines){
            System.out.println(line);
        }
    }
}
