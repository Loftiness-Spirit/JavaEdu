package Practice4_1.Task1;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape{
    protected double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius=radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea(){
        return pow(radius,2)*PI;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*this.radius;
    }

    public String getType(){
        return "Circle";
    }
    @Override
    public String toString() {
        return (super.toString()+"\n"+getType()+ " radius is "+ radius);
    }
}
