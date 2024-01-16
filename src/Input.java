import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {

    LineStorageWrapper lines;
    String filepath;
    public Input(String filepath, LineStorageWrapper lines){
        this.lines = lines;
        this.filepath = filepath;
        readFile();
    }

    public void readFile(){
        BufferedReader reader;

        try {
            File temp = new File("");
            String currentPath = temp.getAbsolutePath();
            reader = new BufferedReader(new FileReader(currentPath + this.filepath));
            String line = reader.readLine();

            while (line != null) {
                lines.addLine(line);
                // read next line
                line = reader.readLine();
            }
            lines.setChanged();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
