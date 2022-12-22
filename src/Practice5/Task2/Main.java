package Practice5.Task2;


import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static Shape getRandShape(){
        int rand =(int)(Math.random()*3);
        switch (rand){
            case 1:
                return new Circle();
            case 2:
                return new Rectangle();
            default:
                return new Square();
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        for (int i = 50; i < 800; i = i + 200)
        {
            for (int j = 50; j < 1250; j = j + 250) {
                Shape s = getRandShape();
                s.setXY(j, i);
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);
                s.setColor(new Color(red, green, blue));

                g.setColor(s.getColor());
                if (s.getType()=="Square") {
                    g.fillRect(s.getX(), s.getY(), 150, 150);
                } else if (s.getType()=="Circle") {
                    g.fillOval(s.getX(), s.getY(), 150, 150);
                } else {
                    g.fillRect(s.getX(), s.getY(), 200, 150);
                }
            }
        }

    }
    public Main()
    {
        super("Shape");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300,850);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
