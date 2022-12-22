package Practice4_1.Task1;

public class Tester {
    public static void main(String[] args) {
        Shape shape=new Shape("orange",true);
        System.out.println(shape);

        Shape circle = new Circle("red",false,5);
        System.out.println(circle);
        System.out.println(circle.getType()+" area is "+circle.getArea());
        System.out.println(circle.getType()+" perimeter is "+circle.getPerimeter());

        Shape rectangle = new Rectangle("blue",true,4,6);
        System.out.println(rectangle);
        System.out.println(rectangle.getType()+" area is "+rectangle.getArea());
        System.out.println(rectangle.getType()+" perimeter is "+rectangle.getPerimeter());

        Rectangle square = new Square("green",true,4);
        System.out.println(square);
        System.out.println(square.getType()+" area is "+square.getArea());
        System.out.println(square.getType()+" perimeter is "+square.getPerimeter());
    }
}
