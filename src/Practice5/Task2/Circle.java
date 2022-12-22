package Practice5.Task2;

import java.awt.*;

public class Circle extends Shape {
    private double radius = 1;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(Color color, int x, int y, double radius){
        super(color,x,y);
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getType(){
        return "Circle";
    }

}
