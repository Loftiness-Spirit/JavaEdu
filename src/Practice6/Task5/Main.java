package Practice6.Task5;

public class Main {
    public static void main(String[] args) {
        Movable circle = new MovableCircle(10,10,1,2,15);
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);
    }
}
