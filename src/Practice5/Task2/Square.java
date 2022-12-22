package Practice5.Task2;

import java.awt.*;

public class Square extends Rectangle {
    protected double side=150;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(Color color, int x, int y, double side) {
        super(color, x, y, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String getType() {
        return "Square";
    }
}
