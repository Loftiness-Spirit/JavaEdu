package Practice5.Task4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Animation extends JFrame {
    protected static Image image;
    protected static ArrayList<Image> frames = new ArrayList<>();

    Animation(){
        super("Animation");
        setSize(640,640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g){
        Graphics2D graphics = (Graphics2D) g;
        graphics.drawImage(image,0,0, 640, 640, null);
    }
}
