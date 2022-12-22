package Practice4_1.Task1;

public class Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(){}
    public Rectangle (double length, double width){
        this.length=length;
        this.width=width;
    }
    public Rectangle(String color, boolean filled,double length, double width){
        super(color, filled);
        this.length=length;
        this.width=width;
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

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return (super.toString()+"\n"+ getType()+" length is "+length+"\n"+getType()+ " width is "+width);
    }
}
