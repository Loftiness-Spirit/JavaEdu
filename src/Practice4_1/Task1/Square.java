package Practice4_1.Task1;

import static java.lang.Math.pow;

public class Square extends Rectangle{
    protected double side;

    public Square(){}
    public Square(double side){
        this.side=side;
    }
    public Square(String color, boolean filled,double side){
        super(color,filled,side,side);
        this.side=side;
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

    @Override
    public double getArea() {
        return pow(side,2);
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return (super.toString()+"\nIt is a "+getType()+" with side "+side);
    }
}
