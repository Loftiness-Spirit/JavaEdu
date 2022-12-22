package Practice4.Task4;

import java.util.ArrayList;

public class Memory {
    private ArrayList<String> values = new ArrayList<String>();

    public Memory(){
        values.add("Initial");
        values.add("Elements");
    }

    public void addInMem(String v) {
        this.values.add(v);
    }

    public void printMem() {
        for (String val : values) {
            System.out.print(val + ' ');
        }
        System.out.println();
    }

    public void removeByInd(int ind) {
        this.values.remove(ind);
    }

    public void clearMem(){
        this.values.clear();
    }
}
