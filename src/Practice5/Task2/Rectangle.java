package Practice5.Task2;

import java.awt.*;

public class Rectangle extends Shape {
    protected double length = 200;
    protected double width = 100;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Color color, int x, int y, double length, double width) {
        super(color, x, y);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}