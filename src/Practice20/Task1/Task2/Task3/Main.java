package Practice20.Task1.Task2.Task3;

public class Main {
    public static void main(String[] args) {
        Generics <Integer, Pug, String> A = new Generics<>(3, new Pug(),"ZYX");
        A.showTypes();
    }

}
