package Practice21.Task2.Task3.Task4;

public class Main {
    public static void main(String[] args) {
        Storage <?> storage = new Storage<>(new Object[]{"ads",1,1.2});
        System.out.println(storage.getElement(2));
        storage.getArr();
    }
}
