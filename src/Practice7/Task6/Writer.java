package Practice7.Task6;

public class Writer implements ProcessStrings.Writeable {
    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
