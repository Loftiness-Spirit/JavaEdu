package Practice4_1.Task1;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){}
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public String getType(){
        return "Shape";
    }
    public String toString() {
        if(filled)
            return(getType() + " is filled with the "+color+" color");
        else
            return (getType() + " is not filled, but it's color is "+color);

    }
}
