package Practice3.MathRand.Task2;

import java.util.Random;
import static java.lang.Math.PI;

public class Circle {
    private Point center=new Point();
    protected double length;
    protected double radius;
    public Circle(double a, double b){
        length=a;
        radius=b;
    }
    public Circle(){
    }
    public void setLength(){
        this.length=2*PI*this.radius;
    }
    public void setRadius(){
        this.radius=this.length/(2*PI);
    }
    public void setRandRadius(){
        Random rand=new Random();
        this.radius=rand.nextDouble();
    }
    public void setRandLength(){
        Random rand=new Random();
        this.length=rand.nextDouble();
        //this.center.y= rand.nextInt(1000);
    }
    public void setX(){
        Random rand=new Random();
        this.center.x= rand.nextInt(1000);
    }
    public void setY(){
        Random rand=new Random();
        this.center.y= rand.nextInt(1000);
    }
}
