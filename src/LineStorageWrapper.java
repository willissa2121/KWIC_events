import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LineStorageWrapper implements Observable {

    ArrayList<String> lines = new ArrayList<String>();
    ArrayList<Observer> observers = new ArrayList<Observer>();
    public LineStorageWrapper(){

    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void addLine(String line){
        lines.add(line);
    }

    public void printLines(){
        for (String i: lines)
            System.out.println(i);
    }

    public void setChanged(){
        observers.get(0).triggerEvent(lines);
    }
}
