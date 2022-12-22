package Practice5.Task2;

import java.awt.*;

abstract public class Shape {
    protected Color color;
    protected int x;
    protected int y;
    public Shape(){}
    public Shape(Color color, int x, int y){
        this.color=color;
        this.x=x;
        this.y=y;
    }

    abstract String getType();
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}
